package customer.IHelpers;

public interface IHelpers {

    static String toStrFormatter(Object... args) {
        return (
                """
                        \n=========================================================
                        CustomerEntity: {
                          firstName: %s
                          lastName: %s
                          email: %s
                        }
                        =========================================================
                        """
        ).formatted(args);
    }
}
