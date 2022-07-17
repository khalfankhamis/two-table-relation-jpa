package tryAbe.abe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tryAbe.abe.model.Product;
import tryAbe.abe.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product s){
        return productService.addProduct(s);
    }
    @GetMapping()
    public List<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/{proId}")
    public Optional<Product> getById(@PathVariable Long proId){
        return productService.findById(proId);
    }
    @PutMapping("/{proId}")
    public Product updateProduct(@RequestBody Product s,@PathVariable Long proId){
        s.setProID(proId);
        return productService.addProduct(s);
    }
    @DeleteMapping("/{proId}")
    public void deleteMe(@PathVariable Long proId){
        productService.deleteById(proId);
    }
}
