package com.monyet9.service;

import io.grpc.stub.StreamObserver;

public class DepositoObserverResponse implements StreamObserver<DepositoResponse> {

    private int amount;

    @Override
    public void onNext(DepositoResponse value) {
        System.out.println("hello next"+ "" + value.getTotal());
        this.setAmount(Integer.parseInt(value.getTotal()));

    }

    @Override
    public void onError(Throwable t) {
       // this.countDownLatch.countDown();
    }

    @Override
    public void onCompleted() {
        System.out.println("complete by response");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
