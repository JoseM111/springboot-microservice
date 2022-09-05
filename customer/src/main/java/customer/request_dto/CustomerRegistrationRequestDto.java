package customer.request_dto;

import customer.IHelpers.IHelpers;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public record CustomerRegistrationRequestDto(
        String firstName,
        String lastName,
        String email) {

    @Override
    public String toString() {
        String result = IHelpers.toStrFormatter(
                firstName,
                lastName,
                email
        );

        log.info(result);
        return result;
    }
}
