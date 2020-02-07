package com.learning.springboot.mockito.demo;

public class BusinessImplementation {
    private DataService dataService;

    public BusinessImplementation(DataService dataService){
        super();
        this.dataService = dataService;
    }

    int findTheGreatestFromAlData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value:data){
            if (value>greatest){
                greatest=value;
            }
        }
        return greatest;
    }
}
