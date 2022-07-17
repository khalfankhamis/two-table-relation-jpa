package tryAbe.abe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tryAbe.abe.model.Product;
import tryAbe.abe.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public Product addProduct(Product s){
        return productRepository.save(s);
    }
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public Optional<Product> findById(Long proID){
        return productRepository.findById(proID);
    }
    public void deleteById(Long proID){
        productRepository.deleteById(proID);
    }
}
