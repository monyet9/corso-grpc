package com.monyet9;

import com.monyet9.service.WithdrawRequest;
import io.grpc.ManagedChannel;

public class MainWebClient {

    public static ClientBankServiceGrpc clientBankServiceGrpc= new ClientBankServiceGrpc();
    public static ManagedChannel managedChannel=clientBankServiceGrpc.managedChannel();

    public static void main(String[] args) {
        WithdrawRequest req=WithdrawRequest.newBuilder().setUsername("ciccioGrpc")
                .setPassword("ciccioGrpc").build();
        clientBankServiceGrpc.requestAsync(managedChannel).getMoney(req,new BankServiceResponseAsync());
        try {
            Thread.sleep(200000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
