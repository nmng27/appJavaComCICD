package br.com.fiap.api.demo.Controllers.Semaforo;

import br.com.fiap.api.demo.Models.Semaforo.Semaforo;
import br.com.fiap.api.demo.Services.Semaforo.SemaforoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("semaforo")
public class SemaforoController {
    @Autowired
    private SemaforoService semaforoService;

    @PostMapping
    public ResponseEntity<Semaforo> add(@RequestBody Semaforo semaforo) {
        Semaforo aux = semaforoService.add(semaforo);
        return ResponseEntity.ok(aux);
    }

    @PutMapping("{id}")
    public ResponseEntity<Semaforo> upd(@PathVariable Integer id, @RequestBody Semaforo semaforo) {
        Semaforo aux = semaforoService.update(semaforo, id);
        return ResponseEntity.ok(aux);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Semaforo> del(@PathVariable Integer id) {
        semaforoService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/buscarPorId/{id}")
    public ResponseEntity<Semaforo> buscarId(@PathVariable Integer id) {
        Semaforo aux = semaforoService.buscarId(id);
        return ResponseEntity.ok(aux);
    }

    @GetMapping("/listarPorManutencao/{precisaManutencao}")
    public ResponseEntity<List<Semaforo>> listar(@PathVariable Boolean precisaManutencao) {
        List<Semaforo> lista = semaforoService.buscarManutencao(precisaManutencao);
        return ResponseEntity.ok(lista);
    }
}
