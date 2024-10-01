package br.com.fiap.api.demo.Services.Trafego;

import br.com.fiap.api.demo.Models.Trafego.Trafego;
import br.com.fiap.api.demo.Repository.Trafego.TrafegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TrafegoService {
    @Autowired
    private TrafegoRepository trafegoRepository;

    public Trafego salvar(Trafego trafego) {
        return trafegoRepository.save(trafego);
    }

    public Trafego atualizat(Trafego trafego, Integer id){
        Trafego aux = trafegoRepository.findById(id).get();
        aux.setData(trafego.getData());
        aux.setVolume(trafego.getVolume());
        aux.setVelocidade(trafego.getVelocidade());
        aux.setCongestionamento(trafego.getCongestionamento());
        aux.setLocalizacao(trafego.getLocalizacao());
        return trafegoRepository.save(aux);
    }

    public void excluir(Integer id){
        trafegoRepository.deleteById(id);
    }

    public Trafego buscar(Integer id){
        return trafegoRepository.findById(id).get();
    }
    public List<Trafego> buscarPorData(LocalDateTime data){
        return trafegoRepository.findByData(data);
    }

    public List<Trafego> buscarPorCongestionamento(Boolean congestionamento){
        return trafegoRepository.findByCongestionamento(congestionamento);
    }

}
