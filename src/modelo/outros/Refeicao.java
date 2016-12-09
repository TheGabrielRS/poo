/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.outros;

import java.time.LocalTime;

/**
 *
 * @author GabrielRS
 */
public class Refeicao {
    
    private String descricao;
    private String horario;

    public Refeicao() {
    }

    public Refeicao(String descricao, String horario) {
        this.descricao = descricao;
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
