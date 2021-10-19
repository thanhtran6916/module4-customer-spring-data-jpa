package com.customer.service;

import com.customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralService<T> {
    Page<Customer> findAll(Pageable pageable);

    void save(T t);

    void delete(Long id);

    Optional<T> findById(Long id);

}
