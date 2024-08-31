package co.edu.icesi.trainer_microservice.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Disponibilidad {
    private String diasDisponibles;
    private String horasDisponibles;
}
