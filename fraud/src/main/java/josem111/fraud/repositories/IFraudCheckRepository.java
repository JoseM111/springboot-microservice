package josem111.fraud.repositories;

import josem111.fraud.entities.FraudCheckHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFraudCheckRepository extends
        JpaRepository<FraudCheckHistoryEntity, Integer> {
}
