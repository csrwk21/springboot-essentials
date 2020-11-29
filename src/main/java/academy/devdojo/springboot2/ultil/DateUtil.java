package academy.devdojo.springboot2.ultil;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
public class DateUtil {
    public String formatLocalDateToDatebaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(localDateTime);
    }
}
