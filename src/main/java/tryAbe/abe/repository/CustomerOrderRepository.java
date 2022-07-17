package tryAbe.abe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tryAbe.abe.model.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Long> {
}
