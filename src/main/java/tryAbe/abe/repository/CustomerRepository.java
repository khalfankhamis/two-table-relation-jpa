package tryAbe.abe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tryAbe.abe.model.Customer;

public interface CustomerRepository extends JpaRepository <Customer,String>{
}
