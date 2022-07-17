package tryAbe.abe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tryAbe.abe.model.Customer;
import tryAbe.abe.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository;

    public Customer addCustomer(Customer s){
        return customerRepository.save(s);
    }
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }
    public Optional<Customer> findById(String custID){
        return customerRepository.findById(custID);
    }
    public void deleteById(String custID){
        customerRepository.deleteById(custID);
    }

}
