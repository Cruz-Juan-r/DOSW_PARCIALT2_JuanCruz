package edu.dosw.parcial.repository;

import edu.dosw.parcial.entity.CollaboratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CollaboratorRepository extends JpaRepository<CollaboratorEntity, Long> {

    Optional<CollaboratorEntity> findByEmail(String email);

    boolean existsByEmail(String email);
}