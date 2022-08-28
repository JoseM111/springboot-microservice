package customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Configuration:
 * Indicates that a class declares one or more @Bean methods
 * * and may be processed by the Spring container to generate
 * * bean definitions and service requests for those beans at runtime
 */
@Configuration
public class CustomerConfig {

    @Bean
    /**
     * @LoadBalanced:
     * The Spring Cloud Load Balancer library allows us to create applications that
     * communicate with other applications in a load-balanced fashion. Using any
     * algorithm we want, we can easily implement load balancing when making remote
     * service calls.
     */
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}










