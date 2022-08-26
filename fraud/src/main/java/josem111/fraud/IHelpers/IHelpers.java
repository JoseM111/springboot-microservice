package josem111.fraud.IHelpers;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public interface IHelpers {

    static ZonedDateTime format(ZonedDateTime zonedDateTime, String pattern) {
        zonedDateTime.format(DateTimeFormatter.ofPattern(pattern));
        return zonedDateTime;
    }
}
