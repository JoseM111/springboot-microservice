package customer.service;

import customer.entity.CustomerEntity;
import customer.repository.ICustomerRepository;
import customer.request_dto.CustomerRegistrationRequestDto;
import customer.response.FraudCheckResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@AllArgsConstructor
@Service
public class CustomerService {
    // dependency injecting properties
    private final ICustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRegistrationRequestDto request) {
        CustomerEntity customer = CustomerEntity.customerBuilder()
                .withFirstName(request.firstName())
                .withLastName(request.lastName())
                .withEmail(request.email())
                .build();

        // TODO: check if email is valid
        // TODO: check if email is not taken
        // TODO: store customer in database
        /**
         * @saveAndFlush:
         * If we do-not save & flush the ID would be null *
         * Unlike save(), the saveAndFlush() method flushes the
         * data immediately during the execution. This method
         * belongs to the JpaRepository interface of Spring Data JPA.
         * Normally, we use this method when our business logic needs
         * to read the saved changes at a later point during the same
         * transaction, but before the commit. For instance, imagine a
         * * scenario where we have to execute a stored procedure that
         * * expects a property of the entity that we're going to save.
         * * In this case, the save() method won't work, since the changes
         * * aren't in sync with the DB and the stored procedure doesn't
         * * know about the changes. The saveAndFlush() method is perfectly
         * * suited for this kind of scenario.
         */
        customerRepository.saveAndFlush(customer);

        // TODO: if fraudster
        /**
         * @getForObject:
         * Retrieve a representation by doing a GET on the specified URL.
         * * The response (if any) is converted and returned.
         * URI Template variables are expanded using the given
         * * URI variables, if any.
         */
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://localhost:8081/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );

        if (!Objects.requireNonNull(fraudCheckResponse).isFraudster()) return;
        throw new IllegalStateException("[FRAUDSTER DETECTED]");

        // TODO: send notification
    }
}
