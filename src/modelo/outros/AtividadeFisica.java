/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.outros;

/**
 *
 * @author marco
 */
public class AtividadeFisica {
    String tipo;
    String horario;
    String frequencia;
    String tempo;

    
    public AtividadeFisica(){}
    
    public AtividadeFisica(String tipo, String horario, String frequencia, String tempo) {
        this.tipo = tipo;
        this.horario = horario;
        this.frequencia = frequencia;
        this.tempo = tempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
