package com.monyet9;

import com.monyet9.service.BankService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerGrpc {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(6565)
                .addService(new BankService())
                .build();

        server.start();
        System.out.println("{SERVER GRPC START}");
        server.awaitTermination();
        System.out.println("{SERVER GRPC START : LISTEN ON PORT 6565 }");
    }
}
