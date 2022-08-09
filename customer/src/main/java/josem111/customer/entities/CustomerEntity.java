package josem111.customer.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "customerBuilder", setterPrefix = "with")
public class CustomerEntity {
    
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}














