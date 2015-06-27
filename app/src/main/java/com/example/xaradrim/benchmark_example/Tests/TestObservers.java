package com.example.xaradrim.benchmark_example.Tests;

/**
 * Created by Pardeep  on 6/26/15.
 * This interface is for intended observers who are observing the runnning benchamrks
 */
public interface TestObservers {

    //Observers will recive updates/notification from form benchmarks through this method
    public void update(String testType, boolean testStarted, boolean testStopped);
}
