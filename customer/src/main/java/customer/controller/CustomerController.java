package customer.controller;

import customer.request_dto.CustomerRegistrationRequestDto;
import customer.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping(path = "api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequestDto customerRegistrationRequest) {
        // logging the new customer
        log.info("*. Registering new customer: {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}








