package artem.web.my_calendar.repository;

import artem.web.my_calendar.model.Content;
import artem.web.my_calendar.model.Status;
import artem.web.my_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }


    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }


    @PostConstruct
    private void init() {
        Content content = new Content(
                1,
                "My first piece of content",
                "first test content",
                Status.Idea,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );

        contentList.add(content);
    }

    public void delete( Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
