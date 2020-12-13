package ua.lviv.iot.DB_Lab6.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.DB_Lab6.domain.implementation.Story;
import ua.lviv.iot.DB_Lab6.repository.StoryRepository;

@Service
public class StoryService extends GeneralService<Story> {

  @Autowired
  StoryRepository storyRepository;

  @Override
  public JpaRepository<Story, Integer> getRepository() {
    return storyRepository;
  }

}
