package br.com.fiap.api.demo.Controllers.Acidentes;

import br.com.fiap.api.demo.Models.Acidente.Acidente;
import br.com.fiap.api.demo.Services.Acidentes.AcidentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("acidentes")
public class AcidentesController {
    @Autowired
    private AcidentesService acidentesService;

    @PostMapping
    public ResponseEntity<Acidente> salvar(@RequestBody Acidente acidente) {
        Acidente aux = acidentesService.salvar(acidente);
        return ResponseEntity.ok(aux);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Acidente> excluir(@PathVariable Integer id) {
        acidentesService.remover(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Acidente> buscar(@PathVariable Integer id) {
        Acidente acidente = acidentesService.buscar(id);
        return ResponseEntity.ok(acidente);
    }

    @GetMapping("/")
    public ResponseEntity<List<Acidente>> listar() {
        List<Acidente> acidentes = acidentesService.listar();
        return ResponseEntity.ok(acidentes);
    }

    @GetMapping("/{gravidade}")
    public ResponseEntity<List<Acidente>> buscarGravidade(@PathVariable String gravidade) {
        List<Acidente> acidente = acidentesService.buscarGravidade(gravidade);
        return ResponseEntity.ok(acidente);
    }
}
