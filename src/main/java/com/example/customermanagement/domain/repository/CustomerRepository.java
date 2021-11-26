package com.example.customermanagement.domain.repository;

import com.example.customermanagement.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 26, November 2021
 * Time: 7:36 AM
 * Project: customer-management
 * Package Name: com.example.customermanagement.domain.repository
 * To change this template use File | Settings | File and Code Template
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
