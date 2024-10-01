package br.com.fiap.api.demo.Services.Acidentes;

import br.com.fiap.api.demo.Models.Acidente.Acidente;
import br.com.fiap.api.demo.Repository.Acidente.AcidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
public class AcidentesService {
    @Autowired
    private AcidenteRepository acidenteRepository;

    public Acidente salvar(Acidente acidente) {
        return acidenteRepository.save(acidente);
    }


    public void remover(Integer id) {
        acidenteRepository.deleteById(id);
    }


    public Acidente buscar(Integer id) {
        return acidenteRepository.findById(id).get();
    }
    public List<Acidente> buscarGravidade(String gravidade) {
        return acidenteRepository.findByGravidade(gravidade);
    }

    public List<Acidente> listar() {
        return acidenteRepository.findAll();
    }
}
