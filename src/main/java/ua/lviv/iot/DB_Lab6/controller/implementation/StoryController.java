package ua.lviv.iot.DB_Lab6.controller.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DB_Lab6.domain.implementation.Story;
import ua.lviv.iot.DB_Lab6.service.IGeneralService;
import ua.lviv.iot.DB_Lab6.service.implementation.StoryService;

@RestController
@RequestMapping("story")
public class StoryController extends GeneralController<Story> {

    @Autowired
    StoryService storyService;

    @Override
    public final IGeneralService<Story> getService() {
        return storyService;
    }
}

