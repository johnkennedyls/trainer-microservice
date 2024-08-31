package co.edu.icesi.trainer_microservice.controller;

import co.edu.icesi.trainer_microservice.model.Entrenador;
import co.edu.icesi.trainer_microservice.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @PostMapping("/agregar")
    public Entrenador agregarEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.agregarEntrenador(entrenador);
    }

    @GetMapping("/todos")
    public List<Entrenador> obtenerTodosEntrenadores() {
        return entrenadorService.obtenerTodosEntrenadores();
    }

    @PutMapping("/actualizar/{id}")
    public Entrenador actualizarEntrenador(@PathVariable Long id, @RequestBody Entrenador entrenador) {
        return entrenadorService.actualizarEntrenador(id, entrenador);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarEntrenador(@PathVariable Long id) {
        entrenadorService.eliminarEntrenador(id);
    }
}
