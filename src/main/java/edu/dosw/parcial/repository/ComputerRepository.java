package edu.dosw.parcial.repository;

import edu.dosw.parcial.entity.ComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComputerRepository extends JpaRepository<ComputerEntity, Long> {

    Optional<ComputerEntity> findBySerial(String serial);

    boolean existsBySerial(String serial);
}