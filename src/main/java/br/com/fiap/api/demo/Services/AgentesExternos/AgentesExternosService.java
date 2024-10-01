package br.com.fiap.api.demo.Services.AgentesExternos;

import br.com.fiap.api.demo.Models.AgentesExternos.AgentesExternos;
import br.com.fiap.api.demo.Repository.AgentesExternos.AgentesExternosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentesExternosService {
    @Autowired
    private AgentesExternosRepository agentesExternosRepository;
    public AgentesExternos salvar(AgentesExternos agentesExternos) {
        return agentesExternosRepository.save(agentesExternos);
    }

    public void deletar(Integer id){
        agentesExternosRepository.deleteById(id);

    }

    public AgentesExternos buscarPorId(Integer id){
        return agentesExternosRepository.findById(id).get();
    }

    public List<AgentesExternos> listar(){
        return agentesExternosRepository.findAll();
    }
}
