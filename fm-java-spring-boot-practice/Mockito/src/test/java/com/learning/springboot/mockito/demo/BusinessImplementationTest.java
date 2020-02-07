package com.learning.springboot.mockito.demo;

import org.junit.jupiter.api.Test;

public class BusinessImplementationTest {

    @Test
    public void testFindTheGreatestFromAllData(){
        BusinessImplementation businessImplementation = new BusinessImplementation(new DataService());
        businessImplementation.findTheGreatestFromAlData();

    }
}
