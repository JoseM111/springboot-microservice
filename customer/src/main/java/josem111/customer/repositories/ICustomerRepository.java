package josem111.customer.repositories;

import josem111.customer.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository
    extends JpaRepository<CustomerEntity, Integer> {

}











