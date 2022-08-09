package josem111.customer.IHelpers;

public interface IHelpers {
    static String toStrFormatter(Object... args) {
        return (
            """
            =========================================================
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
