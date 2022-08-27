package customer.repository;

import customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository
    extends JpaRepository<CustomerEntity, Integer> {

}











