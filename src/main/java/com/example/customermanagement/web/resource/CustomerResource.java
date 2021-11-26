package com.example.customermanagement.web.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, November 2021
 * Time: 6:33 AM
 * Project: customer-management
 * Package Name: com.example.customermanagement.web.resource
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequestMapping("api/v1/customer")
public class CustomerResource {

    @GetMapping
    public ResponseEntity getAllCustomers(){
        return new ResponseEntity("Hello Customers!!!", HttpStatus.OK);
    }
}
