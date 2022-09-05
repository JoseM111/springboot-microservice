package clients.notification;

import clients.notification.request_dto.NotificationRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("notification")
public interface INotificationClient {

    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequestDto notificationRequestDto);
}
