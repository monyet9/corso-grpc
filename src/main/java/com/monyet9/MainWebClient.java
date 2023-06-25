package com.monyet9;

import com.monyet9.service.DepositoRequest;
import com.monyet9.service.DepositoObserverResponse;
import com.monyet9.service.WithdrawRequest;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class MainWebClient {

    public static void main(String[] args) {
        ClientBankServiceGrpc clientBankServiceGrpc= new ClientBankServiceGrpc();
        ManagedChannel managedChannel=clientBankServiceGrpc.managedChannel();
        /*
        //richiesta asincrona
        WithdrawRequest req=WithdrawRequest.newBuilder().setUsername("ciccioGrpc")
                .setPassword("ciccioGrpc").build();
        clientBankServiceGrpc.requestAsync(managedChannel).getMoney(req,new BankServiceResponseAsync());
        try {
            Thread.sleep(200000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */
        //richiesta di piu request e ricezione unica
        DepositoObserverResponse response;
        response= new DepositoObserverResponse();
        StreamObserver<DepositoRequest> request=clientBankServiceGrpc.
                requestAsync(managedChannel).
                deposito(response);
        for(int i =0;i<3;i++){
            DepositoRequest reqdep=DepositoRequest.newBuilder()
                            .setUsername("c")
                                    .setPassword("d")
                                            .setAmuountDeposito("20")
                                                    .build();

            request.onNext(reqdep);
        }
        request.onCompleted();
        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
