package josem111.customer.config;

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
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}










