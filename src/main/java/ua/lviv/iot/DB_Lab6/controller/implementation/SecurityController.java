package ua.lviv.iot.DB_Lab6.controller.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DB_Lab6.domain.implementation.Security;
import ua.lviv.iot.DB_Lab6.service.IGeneralService;
import ua.lviv.iot.DB_Lab6.service.implementation.SecurityService;

@RestController
@RequestMapping("security")
public class SecurityController extends GeneralController<Security> {

    @Autowired
    SecurityService securityService;

    @Override
    public final IGeneralService<Security> getService() {
        return securityService;
    }
}
