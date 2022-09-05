package clients.fraud.iclient;

import clients.fraud.response.FraudCheckResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("fraud")
public interface IFraudClient {
    String FRAUD_CHECK_URL = "api/v1/fraud-check/{customerId}";

    /**
     * @getForObject: Retrieve a representation by doing a GET on the specified URL.
     * * The response (if any) is converted and returned.
     * URI Template variables are expanded using the given
     * * URI variables, if any.
     * http://FRAUD: is the eureka-server reference for the application name
     */
    @GetMapping(path = FRAUD_CHECK_URL)
    FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId
    );
}












