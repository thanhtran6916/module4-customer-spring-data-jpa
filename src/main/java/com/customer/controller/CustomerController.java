package com.customer.controller;

import com.customer.model.Customer;
import com.customer.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public ModelAndView showAll(@RequestParam("q") Optional<String> q, @PageableDefault(size = 3, page = 1) Pageable pageable) {
        Page<Customer> customers = null;
        if (q.isPresent()) {
            String name = q.get();
            customers = customerService.findByNameContaining(name, pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }


}
