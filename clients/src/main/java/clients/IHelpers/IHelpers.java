package clients.IHelpers;

public interface IHelpers {

    static String toStrFormatter(Object... args) {
        return (
                """
                        =========================================================
                        NotificationClient: {
                          toCustomerId: %s
                          toCustomerName: %s
                          message: %s
                        }
                        =========================================================
                        """
        ).formatted(args);
    }
}
