package co.edu.icesi.trainer_microservice.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Especializacion {
    private String tipo;
    private int experiencia;
}
