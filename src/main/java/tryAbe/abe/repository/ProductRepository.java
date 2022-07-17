package tryAbe.abe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tryAbe.abe.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
