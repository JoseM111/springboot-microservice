package josem111.customer.repository;

import josem111.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository
    extends JpaRepository<CustomerEntity, Integer> {

}











