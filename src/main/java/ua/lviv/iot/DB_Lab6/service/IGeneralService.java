package ua.lviv.iot.DB_Lab6.service;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IGeneralService<T> {
  JpaRepository<T, Integer> getRepository();
  List<T> findAll();
  T find(Integer id);
  @Transactional
  void create(T t);
  @Transactional
  void update(T t);
  @Transactional
  void delete(Integer id);
}