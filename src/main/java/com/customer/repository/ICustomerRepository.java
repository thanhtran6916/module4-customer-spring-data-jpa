package com.customer.repository;

import com.customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    Page<Customer> findCustomerByNameContaining(String name, Pageable pageable);

}
