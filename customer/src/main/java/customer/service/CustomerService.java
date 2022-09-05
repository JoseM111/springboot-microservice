package customer.service;

import clients.fraud.iclient.IFraudClient;
import clients.fraud.response.FraudCheckResponse;
import clients.notification.INotificationClient;
import clients.notification.request_dto.NotificationRequestDto;
import customer.entity.CustomerEntity;
import customer.repository.ICustomerRepository;
import customer.request_dto.CustomerRegistrationRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerService {
    // dependency injecting properties
    private final ICustomerRepository customerRepository;
    private final INotificationClient notificationClient;
    private final IFraudClient fraudClient;

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
        FraudCheckResponse fraudCheckResponse = fraudClient
                .isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("[FRAUDSTER DETECTED]");
        }

        // TODO: send notification
        notificationClient.sendNotification(
                new NotificationRequestDto(
                        customer.getId(),
                        customer.getEmail(),
                        String.format(
                                "Welcome to the terror DOME: %s",
                                customer.getFirstName()
                        )));
    }
}

























