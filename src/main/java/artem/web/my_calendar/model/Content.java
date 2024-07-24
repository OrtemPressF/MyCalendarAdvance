package artem.web.my_calendar.model;

import jdk.jshell.Snippet;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
        )

{


}
