package clients.notification.request_dto;

import clients.IHelpers.IHelpers;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public record NotificationRequestDto(
        Integer toCustomerId,
        String toCustomerName,
        String message) {

    @Override
    public String toString() {
        String result = IHelpers.toStrFormatter(
                toCustomerId,
                toCustomerName,
                message
        );

        log.info(result);
        return result;
    }
}






