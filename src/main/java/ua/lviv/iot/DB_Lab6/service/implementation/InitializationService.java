package ua.lviv.iot.DB_Lab6.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.DB_Lab6.domain.implementation.Initialization;
import ua.lviv.iot.DB_Lab6.repository.InitializationRepository;

@Service
public class InitializationService extends GeneralService<Initialization> {

  @Autowired
  InitializationRepository initializationRepository;

  @Override
  public JpaRepository<Initialization, Integer> getRepository() {
    return initializationRepository;
  }

}
