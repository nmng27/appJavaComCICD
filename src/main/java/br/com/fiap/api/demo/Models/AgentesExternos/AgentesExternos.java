package br.com.fiap.api.demo.Models.AgentesExternos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_clima")
public class AgentesExternos {
    @Id
    private Integer id;
    private Integer trafego_id;
    private String intensidade;

    public AgentesExternos(Integer id, Integer trafego_id, String intensidade) {
        this.id = id;
        this.trafego_id = trafego_id;
        this.intensidade = intensidade;
    }

    public AgentesExternos() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrafego_id() {
        return trafego_id;
    }

    public void setTrafego_id(Integer trafego_id) {
        this.trafego_id = trafego_id;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }
}
