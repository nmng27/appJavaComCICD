package br.com.fiap.api.demo.Controllers.AgentesExternos;

import br.com.fiap.api.demo.Models.AgentesExternos.AgentesExternos;
import br.com.fiap.api.demo.Services.AgentesExternos.AgentesExternosService;
import org.aspectj.weaver.loadtime.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clima")
public class AgentesExternosController {
    @Autowired
    private AgentesExternosService agentesExternosService;

    @PostMapping
    public ResponseEntity<AgentesExternos> add(@RequestBody AgentesExternos agentesExternos) {
        AgentesExternos ag = agentesExternosService.salvar(agentesExternos);
        return ResponseEntity.ok(ag);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AgentesExternos> excluir(@PathVariable Integer id) {
        agentesExternosService.deletar(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgentesExternos> buscar(@PathVariable Integer id) {
        AgentesExternos ag = agentesExternosService.buscarPorId(id);
        return ResponseEntity.ok(ag);
    }

    @GetMapping
    public ResponseEntity<List<AgentesExternos>> listar() {
        List<AgentesExternos> ag = agentesExternosService.listar();
        return ResponseEntity.ok(ag);
    }


}
