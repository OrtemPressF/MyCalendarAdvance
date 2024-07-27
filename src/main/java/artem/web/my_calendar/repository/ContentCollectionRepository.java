package artem.web.my_calendar.repository;

import artem.web.my_calendar.model.Content;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {
    }
    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id){
        return content.stream().filter(c->c.id().equals(id)).findFirst();
    }
}