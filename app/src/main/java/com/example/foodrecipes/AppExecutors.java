package com.example.foodrecipes;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class AppExecutors {

    private static com.example.foodrecipes.AppExecutors instance;

    public static com.example.foodrecipes.AppExecutors getInstance(){
        if(instance == null){
            instance = new com.example.foodrecipes.AppExecutors();
        }
        return instance;
    }

    private final ScheduledExecutorService mNetworkIO = Executors.newScheduledThreadPool(3);

    public ScheduledExecutorService networkIO(){
        return mNetworkIO;
    }
}
