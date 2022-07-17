package tryAbe.abe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tryAbe.abe.model.CustomerOrder;
import tryAbe.abe.service.CustomerOrderService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customerOrder")
public class CustomerOrderController {
    @Autowired
    public CustomerOrderService customerOrderService;

    @PostMapping
    public CustomerOrder addCustomerOrder(@RequestBody CustomerOrder s){
        return customerOrderService.addCustomerOrder(s);
    }
    @GetMapping
    public List<CustomerOrder> getAll(){
        return customerOrderService.getAll();
    }
    @GetMapping("/{orderId}")
    public Optional<CustomerOrder> getById(@PathVariable Long orderID){
        return customerOrderService.findById(orderID);
    }
}
