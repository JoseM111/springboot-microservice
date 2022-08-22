package josem111.customer.services;

import josem111.customer.entities.CustomerEntity;
import josem111.customer.repositories.ICustomerRepository;
import josem111.customer.requests.CustomerRegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerService {
    private ICustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        CustomerEntity customer = CustomerEntity.customerBuilder()
                .withFirstName(request.firstName())
                .withLastName(request.lastName())
                .withEmail(request.email())
                .build();

        // TODO: check if email is valid
        // TODO: check if email is not taken
        // TODO: store customer in database
        customerRepository.save(customer);
    }
}
