/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.telas;

import java.util.ArrayList;
import modelo.outros.AtividadeFisica;

/**
 *
 * @author GabrielRS
 */
public class AtividadesFisicas {
    
    private ArrayList<AtividadeFisica> atividadesFisicas;

    public AtividadesFisicas() {
    }

    public AtividadesFisicas(ArrayList<AtividadeFisica> atividadesFisicas) {
        this.atividadesFisicas = atividadesFisicas;
    }

    public ArrayList<AtividadeFisica> getAtividadesFisicas() {
        return atividadesFisicas;
    }

    public void setAtividadesFisicas(ArrayList<AtividadeFisica> tipo) {
        this.atividadesFisicas = tipo;
    }
    
    
}
