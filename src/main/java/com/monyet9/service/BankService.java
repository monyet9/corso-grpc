package com.monyet9.service;

import com.google.protobuf.Int32Value;
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
}
