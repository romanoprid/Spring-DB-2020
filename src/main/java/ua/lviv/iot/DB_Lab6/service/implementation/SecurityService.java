package ua.lviv.iot.DB_Lab6.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.DB_Lab6.domain.implementation.Security;
import ua.lviv.iot.DB_Lab6.repository.SecurityRepository;

@Service
public class SecurityService extends GeneralService<Security> {

  @Autowired
  SecurityRepository securityRepository;

  @Override
  public JpaRepository<Security, Integer> getRepository() {
    return securityRepository;
  }

}