package tryAbe.abe.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable

public class OrderKey implements Serializable {
    private Long orderID;
    private  Long proID;

}
