package josem111.fraud.controller;

import josem111.fraud.response.FraudCheckResponse;
import josem111.fraud.service.FraudCheckService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-check")
public class FraudCheckController {
    // dependency injecting our service
    private final FraudCheckService fraudCheckService;

    //constructor (using lombok @AllArgsConstructor)
//    public FraudCheckController(FraudCheckService fraudCheckService) {
//        this.fraudCheckService = fraudCheckService;
//    }

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId) {
        boolean isFraudulent = fraudCheckService.isFraudulentCustomer(customerId);
        // logging customer `id`
        log.info("*. Fraud check request for customer: {}", customerId);

        // record class
        return new FraudCheckResponse(isFraudulent);
    }
}










