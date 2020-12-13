package ua.lviv.iot.DB_Lab6.controller.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DB_Lab6.domain.implementation.SaveOnTop;
import ua.lviv.iot.DB_Lab6.service.IGeneralService;
import ua.lviv.iot.DB_Lab6.service.implementation.SaveOnTopService;

@RestController
@RequestMapping("save_on_top")
public class SaveOnTopController extends GeneralController<SaveOnTop> {

    @Autowired
    SaveOnTopService saveOnTopService;

    @Override
    public final IGeneralService<SaveOnTop> getService() {
        return saveOnTopService;
    }
}
