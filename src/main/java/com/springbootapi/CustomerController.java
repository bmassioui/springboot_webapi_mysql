package com.springbootapi;

import com.springbootapi.springboot_webapi_mysql.Model.Customer;
import com.springbootapi.springboot_webapi_mysql.Repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/api") // This means URL's start with /api (after Application path)
public class CustomerController {
    @Autowired

    private CustomerRepository customerRepository;

    /**
     * Add new Customer
     * 
     * @param fullName
     * @param age
     * @return
     */
    @PostMapping(path = "/add")
    public @ResponseBody String addCustomer(@RequestParam String fullName, @RequestParam Integer age) {

        Customer customerToAdd = new Customer();
        customerToAdd.setFullname(fullName);
        customerToAdd.setAge(age);

        customerRepository.save(customerToAdd);

        return "Customer saved successfully";
    }

    /**
     * Get Customers
     * 
     * @return
     */
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
