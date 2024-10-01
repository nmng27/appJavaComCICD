package br.com.fiap.api.demo.Services.Semaforo;

import br.com.fiap.api.demo.Models.Semaforo.Semaforo;
import br.com.fiap.api.demo.Repository.Semaforo.SemaforoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemaforoService {
    @Autowired
    private SemaforoRepository semaforoRepository;

    public Semaforo add(Semaforo semaforo) {
        return semaforoRepository.save(semaforo);
    }

    public Semaforo update(Semaforo semaforo, int id) {
        Semaforo aux = semaforoRepository.findById(id).get();
        semaforo.setCor(aux.getCor());
        semaforo.setManutencao(aux.getManutencao());
        return semaforoRepository.save(semaforo);
    }

    public void delete(int id) {
        semaforoRepository.deleteById(id);
    }

    public Semaforo buscarId(int id) {
        Semaforo semaforo = semaforoRepository.findById(id).get();
        return semaforo;
    }

    public List<Semaforo> buscarManutencao(Boolean Manutencao){
        List<Semaforo> lista = semaforoRepository.findByManutencao(Manutencao);
        return lista;
    }


}
