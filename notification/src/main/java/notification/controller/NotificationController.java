package notification.controller;

import clients.notification.request_dto.NotificationRequestDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import notification.service.NotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping(path = "api/v1/notification")
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping
    public void sendNotification(
            @RequestBody NotificationRequestDto notificationRequestDto) {
        log.info("New notification: {}", notificationRequestDto);
        notificationService.send(notificationRequestDto);
    }
}








