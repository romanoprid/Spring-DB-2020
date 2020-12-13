package ua.lviv.iot.DB_Lab6.controller;



import ua.lviv.iot.DB_Lab6.service.IGeneralService;

import java.util.List;


public interface IGeneralController<T> {

    IGeneralService<T> getService();
    List<T> findAll();
    T findById(Integer id);
    void create(T t);
    void update(Integer id, T t);
    void delete(Integer id);
}