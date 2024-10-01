package br.com.fiap.api.demo.Models.Trafego;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity(name = "TB_TRAFEGO")
public class Trafego {
    @Id
    private Integer id;
    private LocalDateTime data;
    private String localizacao;
    private Integer volume;
    private Integer velocidade;
    private Boolean congestionamento;

    public Trafego(Integer id, LocalDateTime data, String localizacao, Integer volume, Integer velocidade, Boolean congestionamento) {
        this.id = id;
        this.data = data;
        this.localizacao = localizacao;
        this.volume = volume;
        this.velocidade = velocidade;
        this.congestionamento = congestionamento;
    }

    public Trafego() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Boolean getCongestionamento() {
        return congestionamento;
    }

    public void setCongestionamento(Boolean congestionamento) {
        this.congestionamento = congestionamento;
    }
}
