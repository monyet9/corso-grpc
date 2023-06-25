package com.monyet9.service;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public class DepositoObserverRequest implements StreamObserver<DepositoRequest> {
    StreamObserver<DepositoResponse> res;
    Map<String,Integer> dbAmount= new HashMap<>();


    {
        dbAmount.put("total",0);
    }

    public DepositoObserverRequest(StreamObserver<DepositoResponse> res) {
        this.res = res;
        System.out.println("streamRequestor "+ this.res.toString());
    }

    @Override
    public void onNext(DepositoRequest value) {
        int total = 0;
       if(dbAmount.size()>0)
           total=dbAmount.get("total").intValue();
       total= total+Integer.parseInt(value.getAmuountDeposito());
       dbAmount.put("total", total);
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {
        String s = dbAmount.get("total").toString();
        DepositoResponse press= DepositoResponse.newBuilder()
                .setTotal(s).build();
        this.res.onNext(press);
        this.res.onCompleted();
    }
}
