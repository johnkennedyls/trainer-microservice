package co.edu.icesi.trainer_microservice.service;

import co.edu.icesi.trainer_microservice.model.Entrenador;
import co.edu.icesi.trainer_microservice.repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public Entrenador agregarEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public List<Entrenador> obtenerTodosEntrenadores() {
        return entrenadorRepository.findAll();
    }

    public Entrenador actualizarEntrenador(Long id, Entrenador entrenadorActualizado) {
        Entrenador entrenadorExistente = entrenadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entrenador no encontrado"));

        entrenadorExistente.setNombre(entrenadorActualizado.getNombre());
        entrenadorExistente.setEspecializacion(entrenadorActualizado.getEspecializacion());
        entrenadorExistente.setDisponibilidad(entrenadorActualizado.getDisponibilidad());
        return entrenadorRepository.save(entrenadorExistente);
    }

    public void eliminarEntrenador(Long id) {
        entrenadorRepository.deleteById(id);
    }
}
