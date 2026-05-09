package utilDate;

import java.time.Instant;
import java.time.ZoneId;

public class useDateZone {
    static void main() {
        ZoneId zoneId = ZoneId.systemDefault();
        IO.println(ZoneId.getAvailableZoneIds());
        Instant now = Instant.now();
    }
}
