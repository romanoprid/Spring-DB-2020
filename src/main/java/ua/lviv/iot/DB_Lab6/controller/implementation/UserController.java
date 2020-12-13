package ua.lviv.iot.DB_Lab6.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DB_Lab6.domain.implementation.User;
import ua.lviv.iot.DB_Lab6.service.IGeneralService;
import ua.lviv.iot.DB_Lab6.service.implementation.UserService;

@RestController
@RequestMapping("user")
public class UserController extends GeneralController<User> {

    @Autowired
    UserService userService;

    @Override
    public final IGeneralService<User> getService() {
        return userService;
    }
}
