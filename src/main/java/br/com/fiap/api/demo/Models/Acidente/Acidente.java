package br.com.fiap.api.demo.Models.Acidente;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_acidentes")
public class Acidente {
    @Id
    private Integer id;
    private String gravidade;
    private Integer trafego_id;

    public Acidente() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public Integer getTrafego_id() {
        return trafego_id;
    }

    public void setTrafego_id(Integer trafego_id) {
        this.trafego_id = trafego_id;
    }

    public Acidente(Integer id, String gravidade, Integer trafego_id) {
        this.id = id;
        this.gravidade = gravidade;
        this.trafego_id = trafego_id;
    }
}
