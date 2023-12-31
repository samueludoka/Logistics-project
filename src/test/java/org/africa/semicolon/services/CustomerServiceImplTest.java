package org.africa.semicolon.services;

import org.africa.semicolon.data.repositories.ServiceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.security.Provider;

@SpringBootTest
class CustomerServiceImplTest {
    @Autowired
    private ServiceRepository serviceRepository;


    @Test
    public void makeOneOrder_countIsOne(){
        serviceRepository.saveOrder();
    }


}