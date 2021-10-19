package com.customer.service.customer;

import com.customer.model.Customer;
import com.customer.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findByNameContaining(String name, Pageable pageable);

}
