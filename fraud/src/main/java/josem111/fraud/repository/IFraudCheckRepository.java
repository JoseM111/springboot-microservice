package josem111.fraud.repository;

import josem111.fraud.entity.FraudCheckHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFraudCheckRepository extends
        JpaRepository<FraudCheckHistoryEntity, Integer> {
}
