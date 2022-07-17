package tryAbe.abe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proID;
    private String proName;
    private Long unitPrice;
    private Long proQuantity;

    @OneToMany(mappedBy = "product")
    Set<OrderIterm> orderIterms;

}
