package notification.service;

import clients.notification.request_dto.NotificationRequestDto;
import lombok.AllArgsConstructor;
import notification.entity.NotificationEntity;
import notification.repository.INotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class NotificationService {
    private final INotificationRepository notificationRepository;

    public void send(NotificationRequestDto notificationRequestDto) {
        notificationRepository.save(
                NotificationEntity.notificationBuilder()
                        .withToCustomerId(notificationRequestDto.toCustomerId())
                        .withToCustomerEmail(notificationRequestDto.toCustomerName())
                        .withSender("AliasOne11")
                        .withSentAt(LocalDateTime.now())
                        .build()
        );
    }
}







