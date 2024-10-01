package br.com.fiap.api.demo.Repository.Semaforo;


import br.com.fiap.api.demo.Models.Semaforo.Semaforo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SemaforoRepository extends JpaRepository<Semaforo, Integer> {
    public List<Semaforo> findByManutencao(Boolean manutencao);
}
