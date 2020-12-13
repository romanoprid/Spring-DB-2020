package ua.lviv.iot.DB_Lab6.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.DB_Lab6.domain.implementation.User;
import ua.lviv.iot.DB_Lab6.repository.UserRepository;

@Service
public class UserService extends GeneralService<User> {

  @Autowired
  UserRepository userRepository;

  @Override
  public JpaRepository<User, Integer> getRepository() {
    return userRepository;
  }

}
