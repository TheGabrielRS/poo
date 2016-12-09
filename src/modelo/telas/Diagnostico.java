/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.telas;

/**
 *
 * @author GabrielRS
 */
public class Diagnostico {
    
    private String diagnostico;
    private char   verduras;
    private char   frutas;
    private char   refrigerante;
    private char   doces;
    private char   frituras;
    private char   paes;
    private char   fastFood;

    public Diagnostico() {
    }
    
    public Diagnostico(String diagnostico, char verduras, char frutas, char refrigerante, char doces, char frituras, char paes, char fastFood) {
        this.diagnostico = diagnostico;
        this.verduras = verduras;
        this.frutas = frutas;
        this.refrigerante = refrigerante;
        this.doces = doces;
        this.frituras = frituras;
        this.paes = paes;
        this.fastFood = fastFood;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public char getVerduras() {
        return verduras;
    }

    public void setVerduras(char verduras) {
        this.verduras = verduras;
    }

    public char getFrutas() {
        return frutas;
    }

    public void setFrutas(char frutas) {
        this.frutas = frutas;
    }

    public char getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(char refrigerante) {
        this.refrigerante = refrigerante;
    }

    public char getDoces() {
        return doces;
    }

    public void setDoces(char doces) {
        this.doces = doces;
    }

    public char getFrituras() {
        return frituras;
    }

    public void setFrituras(char frituras) {
        this.frituras = frituras;
    }

    public char getPaes() {
        return paes;
    }

    public void setPaes(char paes) {
        this.paes = paes;
    }

    public char getFastFood() {
        return fastFood;
    }

    public void setFastFood(char fastFood) {
        this.fastFood = fastFood;
    }
    
    
    
}
