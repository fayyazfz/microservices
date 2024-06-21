package com.application.customer;

import com.application.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

   @Autowired
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(String id) {
        return customerRepository.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(String id, Customer customerDetails) {
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isPresent()) {
            Customer updatedCustomer = customer.get();
            updatedCustomer.setFirstName(customerDetails.getFirstName());
            updatedCustomer.setLastName(customerDetails.getLastName());
            updatedCustomer.setEmail(customerDetails.getEmail());
            return customerRepository.save(updatedCustomer);
        } else {
            return null;
        }
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
