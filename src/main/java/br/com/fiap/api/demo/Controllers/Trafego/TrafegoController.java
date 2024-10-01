package br.com.fiap.api.demo.Controllers.Trafego;

import br.com.fiap.api.demo.Models.Trafego.Trafego;
import br.com.fiap.api.demo.Services.Trafego.TrafegoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("trafego")
public class TrafegoController {
    @Autowired
    private TrafegoService trafegoService;

    @PostMapping
    public ResponseEntity<Trafego> add(@RequestBody Trafego trafego) {
        Trafego aux = trafegoService.salvar(trafego);
        return ResponseEntity.ok(aux);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trafego> update(@PathVariable Integer id, @RequestBody Trafego trafego) {
        Trafego aux = trafegoService.atualizat(trafego,id);
        return ResponseEntity.ok(aux);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Trafego> delete(@PathVariable Integer id) {
        trafegoService.excluir(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trafego> buscarid(@PathVariable Integer id) {
        Trafego aux = trafegoService.buscar(id);
        return ResponseEntity.ok(aux);
    }

    @GetMapping("/buscarPorData/{data}")
    public ResponseEntity<List<Trafego>> buscar(@PathVariable LocalDateTime data) {
        List<Trafego> aux = trafegoService.buscarPorData(data);
        return ResponseEntity.ok(aux);
    }

    @GetMapping("/buscarPorCongestionamento/{congestionamento}")
    public ResponseEntity<List<Trafego>> buscarPorCongestionamento(@PathVariable Boolean congestionamento) {
        List<Trafego> aux = trafegoService.buscarPorCongestionamento(congestionamento);
        return ResponseEntity.ok(aux);
    }

}
