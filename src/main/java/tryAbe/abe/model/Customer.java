package tryAbe.abe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    private String custID;
    private String custName;
    private String custAddress;
    private String custPhone;
    private String custEmail;

}
