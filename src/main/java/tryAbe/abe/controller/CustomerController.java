package tryAbe.abe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tryAbe.abe.model.Customer;
import tryAbe.abe.service.CustomerService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer s){
        return customerService.addCustomer(s);
    }
    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @GetMapping("/{custID}")
    public Optional<Customer> getById(@PathVariable String custID){
        return customerService.findById(custID);
    }

    @PutMapping("/{custID}")
    public Customer updateCustomer(@RequestBody Customer s,@PathVariable String custID){
        s.setCustID(custID);
        return customerService.addCustomer(s);
    }

    @DeleteMapping("/{custID}")
    public void deleteMe(@PathVariable String custID){
        customerService.deleteById(custID);
    }

}
