package br.com.fiap.api.demo.Models.Semaforo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity(name = "tb_semaforo")
public class Semaforo {
    @Id
    private Integer id;
    private String cor;
    private LocalDateTime data;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    private Integer trafego_id;
    @Column(name = "precisa_manutencao")
    private Boolean manutencao;

    public Semaforo(Integer id, String cor, LocalDateTime data, Integer trafego_id, Boolean manutencao) {
        this.id = id;
        this.cor = cor;
        this.data = data;
        this.trafego_id = trafego_id;
        this.manutencao = manutencao;
    }

    public Semaforo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getTrafego_id() {
        return trafego_id;
    }

    public void setTrafego_id(Integer trafego_id) {
        this.trafego_id = trafego_id;
    }

    public Boolean getManutencao() {
        return manutencao;
    }

    public void setManutencao(Boolean manutencao) {
        this.manutencao = manutencao;
    }
}
