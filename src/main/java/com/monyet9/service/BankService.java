package com.monyet9.service;

import com.google.protobuf.Int32Value;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase{

    @Override
    public void login(BankServiceRequest request, StreamObserver<BankServiceResponse> responseObserver) {
        System.out.println("verifica credenziali");
        if(request.getUsername().isEmpty() || request.getPassword().isEmpty()){
            //ritorno un eccezzione
            responseObserver.onError(new Exception("Username && Password is required"));
        }
        System.out.println("credenziali corrette , calcolo response");
        Integer saldo =Integer.valueOf(250);
        BankServiceResponse res=BankServiceResponse.newBuilder()
                .setNome("Francesco")
                .setCognome("Stellato")
                .setSaldo(Int32Value.of(saldo))
                .build();
        // restituisce al channel la risposta
        responseObserver.onNext(res);
        // chiude la comunicazione
        responseObserver.onCompleted();
        System.out.println("response inviata");
    }

    @Override
    public void getMoney(WithdrawRequest request, StreamObserver<WithdrawResponse> responseObserver) {
        if(request.getUsername().isEmpty() || request.getPassword().isEmpty()){
            //ritorno un eccezzione
            Status status= Status.FAILED_PRECONDITION.withDescription("attenzione inserire la username e la password");
            responseObserver.onError(status.asRuntimeException());
            return;
        }
        for (int i=0;i<10;i++){
            WithdrawResponse response= WithdrawResponse.newBuilder()
                            .setMoney(Money.newBuilder().setValue(10).build()).build();
            responseObserver.onNext(response);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<DepositoRequest> deposito(StreamObserver<DepositoResponse> responseObserver) {
        System.out.println("server instance "+ responseObserver.toString());
        return new DepositoObserverRequest(responseObserver);
    }
}
