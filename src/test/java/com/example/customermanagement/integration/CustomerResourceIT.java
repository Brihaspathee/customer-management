package com.example.customermanagement.integration;

import com.example.customermanagement.domain.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 26, November 2021
 * Time: 7:49 AM
 * Project: customer-management
 * Package Name: com.example.customermanagement.integration
 * To change this template use File | Settings | File and Code Template
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class CustomerResourceIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testGetAllCustomers(){
        List customerlist = customerRepository.findAll();
        log.info("Customer List: {}", customerlist);
    }
}
