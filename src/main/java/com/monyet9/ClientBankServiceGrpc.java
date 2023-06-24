package com.monyet9;

import com.monyet9.service.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientBankServiceGrpc {

    /*
    * BUILD  CANALE DEL CLIENT
     */
    public ManagedChannel managedChannel(){
        return ManagedChannelBuilder.forAddress("localhost",6565)
                .usePlaintext()
                .build();
    }

    /*
     * BUILD RICHIESTA SINCRONA DEL CANALE
     */
    public BankServiceGrpc.BankServiceBlockingStub requestSync(ManagedChannel managedChannel){
        return BankServiceGrpc.newBlockingStub(managedChannel);
    }



}
