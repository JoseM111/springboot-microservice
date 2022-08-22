package josem111.fraud.services;

import josem111.fraud.entities.FraudCheckHistoryEntity;
import josem111.fraud.repositories.IFraudCheckRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class FraudCheckService {
    private final IFraudCheckRepository fraudCheckRepo;

    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckRepo.save(
                FraudCheckHistoryEntity.fraudBuilder()
                        .withCustomerId(customerId)
                        .withIsFraudster(false)
                        .withCreatedAt(LocalDateTime.now())
                        .build()
        );

        return false;
    }
}























