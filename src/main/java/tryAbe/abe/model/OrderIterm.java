package tryAbe.abe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderIterm {
    @EmbeddedId
    private OrderKey orderKey;
    @ManyToOne
    @MapsId("orderID")
    CustomerOrder customerOrder;
    @ManyToOne
    @MapsId("proID")
    Product product;

    private Long orderQuantity;

}
