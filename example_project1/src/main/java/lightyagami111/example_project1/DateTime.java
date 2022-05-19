package lightyagami111.example_project1;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        String strDateTime = "2022-02-21T22:35:59.701";
//        OffsetDateTime offsetDateTime = parseISOOffset(strDateTime);
//        System.out.println(offsetDateTime);
//        System.out.println(offsetDateTime.toInstant());
//        System.out.println(offsetDateTime.toInstant().toEpochMilli());

        LocalDateTime localDateTime = parseISOOLocal(strDateTime);
        System.out.println(localDateTime);
        System.out.println(localDateTime.toInstant(ZoneOffset.UTC));
        System.out.println(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

    }

    public static OffsetDateTime parseISOOffset(String strDateTime) {
        OffsetDateTime parsed = null;

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        parsed = OffsetDateTime.parse(strDateTime, formatter);

        return parsed;
    }

    public static LocalDateTime parseISOOLocal(String strDateTime) {
        LocalDateTime parsed = null;

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        parsed = LocalDateTime.parse(strDateTime, formatter);

        return parsed;
    }

}
