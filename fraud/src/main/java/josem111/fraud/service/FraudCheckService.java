package josem111.fraud.service;

import josem111.fraud.entity.FraudCheckHistoryEntity;
import josem111.fraud.repository.IFraudCheckRepository;
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
                        .withCreatedAt(getDateRightNow())
                        .build()
        );

        return false;
    }

    private static LocalDateTime getDateRightNow() {
        return LocalDateTime.now();
    }
}























