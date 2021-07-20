package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    void insert(Customer customer);
    void delete(int id);
    Customer findById(int id);
    List<Customer> findAll();
}
