package tryAbe.abe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tryAbe.abe.model.CustomerOrder;
import tryAbe.abe.repository.CustomerOrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerOrderService {
    @Autowired
    public CustomerOrderRepository customerOrderRepository;

    public CustomerOrder addCustomerOrder(CustomerOrder s){
        return customerOrderRepository.save(s);
    }
    public List<CustomerOrder> getAll(){
        return customerOrderRepository.findAll();
    }
    public Optional<CustomerOrder> findById(Long orderID){
        return customerOrderRepository.findById(orderID);
    }
    public void deleteById(Long orderId){
        customerOrderRepository.deleteById(orderId);
    }

}
