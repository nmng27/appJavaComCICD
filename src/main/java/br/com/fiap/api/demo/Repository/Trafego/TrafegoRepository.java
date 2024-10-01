package br.com.fiap.api.demo.Repository.Trafego;

import br.com.fiap.api.demo.Models.Trafego.Trafego;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TrafegoRepository extends JpaRepository<Trafego,Integer> {
    public List<Trafego> findByData(LocalDateTime data);
    public List<Trafego> findByCongestionamento(Boolean congestionamento);


}
