/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author GabrielRS
 */
public class AtividadeFísica {
    
    private ArrayList<String> tipo;
    private ArrayList<String> turno;

    public AtividadeFísica() {
    }

    public AtividadeFísica(ArrayList<String> tipo, ArrayList<String> turno) {
        this.tipo = tipo;
        this.turno = turno;
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getTurno() {
        return turno;
    }

    public void setTurno(ArrayList<String> turno) {
        this.turno = turno;
    }
    
    
}
