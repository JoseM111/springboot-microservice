package notification.repository;

import notification.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotificationRepository
        extends JpaRepository<NotificationEntity, Integer> {
}
