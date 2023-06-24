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
     * BUILD RICHIESTA SINCRONA DEL CANALE UTILIZZANDO  LA CLASSE BLOCKING STUB
     * LO STUB SI METTE IN ASCOLTO ED ASPETTA UNA RISPOSTA E IL COMPLETAMENTO
     */
    public BankServiceGrpc.BankServiceBlockingStub requestSync(ManagedChannel managedChannel){
        return BankServiceGrpc.newBlockingStub(managedChannel);
    }

    /*
     * BUILD RICHIESTA SINCRONA DEL CANALE UTILIZZANDO  LA CLASSE BLOCKING STUB
     * LO STUB SI METTE IN ASCOLTO ED ASPETTA UNA RISPOSTA E IL COMPLETAMENTO.
     * IN CASO DI SERVER STREAMING IL NOSTRO CLIENT SI METTERA IN ASCOLTO DI PIU RESPONSE CHE IL SERVER INVIERA
     * PRIMA DEL COMPLETAMENTO
     */
    public BankServiceGrpc.BankServiceBlockingStub requestServerStreaming(ManagedChannel managedChannel){
        return BankServiceGrpc.newBlockingStub(managedChannel);
    }

    public BankServiceGrpc.BankServiceStub requestAsync(ManagedChannel managedChannel) {
        return BankServiceGrpc.newStub(managedChannel);
    }


}
