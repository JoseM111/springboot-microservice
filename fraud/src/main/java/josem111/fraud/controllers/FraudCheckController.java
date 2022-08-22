package josem111.fraud.controllers;

import josem111.fraud.responses.FraudCheckResponse;
import josem111.fraud.services.FraudCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
            @PathVariable("customerId") Integer customerId
    ) {
        boolean isFraudulent = fraudCheckService.isFraudulentCustomer(customerId);
        // record class
        return new FraudCheckResponse(isFraudulent);
    }
}










