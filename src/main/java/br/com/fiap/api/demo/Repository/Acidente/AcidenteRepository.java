package br.com.fiap.api.demo.Repository.Acidente;

import br.com.fiap.api.demo.Models.Acidente.Acidente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcidenteRepository extends JpaRepository<Acidente,Integer> {
    public List<Acidente> findByGravidade(String gravidade);
}
