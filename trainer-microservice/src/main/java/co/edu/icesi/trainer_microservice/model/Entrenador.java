package co.edu.icesi.trainer_microservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Embedded
    private Especializacion especializacion;

    @Embedded
    private Disponibilidad disponibilidad;
}
