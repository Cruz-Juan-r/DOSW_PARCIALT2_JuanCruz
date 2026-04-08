package edu.dosw.parcial.repository;

import edu.dosw.parcial.entity.PeripheralEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface PeripheralRepository extends JpaRepository<PeripheralEntity, Long> {

        Optional<PeripheralEntity> findByEmail(String type);

        boolean existsByType(String type);
}
