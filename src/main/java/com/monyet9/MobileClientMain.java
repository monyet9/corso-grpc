package com.monyet9;

import com.monyet9.service.*;
import io.grpc.ManagedChannel;

import java.util.Iterator;

public class MobileClientMain {

    public static void main(String[] args) {
        //creazione client grpc
        ClientBankServiceGrpc clientBankServiceGrpc= new ClientBankServiceGrpc();
        //creazione channel grpc
        ManagedChannel managedChannel=clientBankServiceGrpc.managedChannel();
        System.out.println("canale " + managedChannel);
        // getServiceGrpc ed utilizzo della classe blocking stub
        // tale classe si mette in attesa di una risposta .Invia la richiesta ed attende una risposta .
        // l'operazione
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

        WithdrawRequest req=WithdrawRequest.newBuilder().setUsername("ciccioGrpc")
                        .setPassword("ciccioGrpc").build();


        Iterator<WithdrawResponse> itRes=bankServiceBlockingStub.getMoney(req);
        while(itRes.hasNext()){
            Integer amount = itRes.next().getMoney().getValue();
            System.out.println("saldo " + amount);
        }

        //classe creata da me , alimentato il ritorno di uno blockingStub che attente il completamento da parte del server
        clientBankServiceGrpc.requestServerStreaming(managedChannel)
                .getMoney(req).forEachRemaining(res-> System.out.println(res.getMoney()));


    }
}
