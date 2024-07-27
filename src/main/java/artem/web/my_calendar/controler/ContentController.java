package artem.web.my_calendar.controler;

import artem.web.my_calendar.model.Content;
import artem.web.my_calendar.repository.ContentCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }


    //request t fin al the pieces of content
    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }
}
