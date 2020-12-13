package ua.lviv.iot.DB_Lab6.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.DB_Lab6.domain.implementation.SaveOnTop;
import ua.lviv.iot.DB_Lab6.repository.SaveOnTopRepository;

@Service
public class SaveOnTopService extends GeneralService<SaveOnTop> {

  @Autowired
  SaveOnTopRepository saveOnTopRepository;

  @Override
  public JpaRepository<SaveOnTop, Integer> getRepository() {
    return saveOnTopRepository;
  }

}
