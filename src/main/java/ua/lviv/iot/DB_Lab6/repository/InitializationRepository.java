package ua.lviv.iot.DB_Lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.DB_Lab6.domain.implementation.Initialization;

@Repository
public interface InitializationRepository extends JpaRepository<Initialization, Integer> {

}
