package co.edu.icesi.trainer_microservice.repository;

import co.edu.icesi.trainer_microservice.model.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {
}
