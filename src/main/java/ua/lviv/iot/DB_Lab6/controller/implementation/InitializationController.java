package ua.lviv.iot.DB_Lab6.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DB_Lab6.domain.implementation.Initialization;
import ua.lviv.iot.DB_Lab6.service.IGeneralService;
import ua.lviv.iot.DB_Lab6.service.implementation.InitializationService;


@RestController
@RequestMapping("initialization")
public class InitializationController extends GeneralController<Initialization> {

    @Autowired
    InitializationService initializationService;

    @Override
    public final IGeneralService<Initialization> getService() {
        return initializationService;
    }
}
