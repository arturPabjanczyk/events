package pl.artapps.events.event;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EventDTO {

    private Long id;
    private String name;
    private LocalDateTime date;
    private String type;

}
