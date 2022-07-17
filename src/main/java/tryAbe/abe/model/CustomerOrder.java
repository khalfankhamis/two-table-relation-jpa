package tryAbe.abe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    @ManyToOne
    private Customer customer;
    private Date date;
    @OneToMany(mappedBy = "customerOrder")
    Set<OrderIterm> orderIterms;

}
