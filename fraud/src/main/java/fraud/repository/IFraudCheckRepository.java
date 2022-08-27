package fraud.repository;

import fraud.entity.FraudCheckHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFraudCheckRepository extends
        JpaRepository<FraudCheckHistoryEntity, Integer> {
}
