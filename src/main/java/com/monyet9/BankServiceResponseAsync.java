package com.monyet9;

import com.monyet9.service.WithdrawResponse;
import io.grpc.stub.StreamObserver;

public class BankServiceResponseAsync implements StreamObserver<WithdrawResponse> {

    @Override
    public void onNext(WithdrawResponse value) {
        System.out.println("lavoro ul corrente e passo al prossimo "+ value);
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {

        System.out.println("terminato");
    }
}
