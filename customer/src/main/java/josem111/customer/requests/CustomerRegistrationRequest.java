package josem111.customer.requests;

import josem111.customer.IHelpers.IHelpers;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email
) {
    @Override
    public String toString() {
        return IHelpers.toStrFormatter(
            firstName,
            lastName,
            email
        );
    }
}











