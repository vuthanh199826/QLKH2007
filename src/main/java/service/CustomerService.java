package service;

import model.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Transactional
public class CustomerService implements ICustomerService{
    public CustomerService() {
    }

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c",Customer.class);
        return query.getResultList();
    }
}
