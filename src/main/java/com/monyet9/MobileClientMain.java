package com.monyet9;

import com.monyet9.service.BankServiceGrpc;
import com.monyet9.service.BankServiceRequest;
import com.monyet9.service.BankServiceResponse;
import io.grpc.ManagedChannel;

public class MobileClientMain {

    public static void main(String[] args) {
        ClientBankServiceGrpc clientBankServiceGrpc= new ClientBankServiceGrpc();
        ManagedChannel managedChannel=clientBankServiceGrpc.managedChannel();
        System.out.println("canale " + managedChannel);
        BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub=clientBankServiceGrpc.requestSync(managedChannel);
        System.out.println("richiesta sincrona " + bankServiceBlockingStub);
        BankServiceRequest bankServiceRequest=BankServiceRequest.newBuilder()
                        .setUsername("francesco")
                                .setPassword("dkaodjsn")
                                        .build();
        System.out.println("richiesta sincrona in corso" + bankServiceBlockingStub);
        BankServiceResponse resposne =bankServiceBlockingStub.login(bankServiceRequest);
        System.out.println("risposta" + bankServiceBlockingStub);
        System.out.println("saldo " + resposne);
    }
}
