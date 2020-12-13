package ua.lviv.iot.DB_Lab6.service.implementation;



import org.springframework.transaction.annotation.Transactional;
import ua.lviv.iot.DB_Lab6.service.IGeneralService;
import java.util.LinkedList;
import java.util.List;

public abstract class GeneralService<T> implements IGeneralService<T> {

  @Override
  public List<T> findAll() {
    List<T> ts = new LinkedList<>(getRepository().findAll());
    if (ts.isEmpty()) {
      return null;
    }
    return ts;
  }

  @Override
  public T find(Integer id) {
    if (getRepository().findById(id).isPresent()) {
      return getRepository().findById(id).get();
    } else {
      return null;
    }
  }

  @Override
  @Transactional
  public void create(T t) {
    if (t != null) {
      getRepository().save(t);
    }
  }

  @Override
  @Transactional
  public void update(T t) {
    getRepository().save(t);
  }

  @Override
  @Transactional
  public void delete(Integer id) {
    if (getRepository().findById(id).isPresent()) {
      getRepository().deleteById(id);
    }
  }
}