/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author GabrielRS
 */
public class CondutaNutricional {
    
    private String conduta;
    private float valorEnergeticoTotal;
    private String orientacoes;

    public CondutaNutricional() {
    }

    public CondutaNutricional(String conduta, float valorEnergeticoTotal, String orientacoes) {
        this.conduta = conduta;
        this.valorEnergeticoTotal = valorEnergeticoTotal;
        this.orientacoes = orientacoes;
    }
    
    public String getConduta() {
        return conduta;
    }

    public void setConduta(String conduta) {
        this.conduta = conduta;
    }

    public float getValorEnergeticoTotal() {
        return valorEnergeticoTotal;
    }

    public void setValorEnergeticoTotal(float valorEnergeticoTotal) {
        this.valorEnergeticoTotal = valorEnergeticoTotal;
    }

    public String getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(String orientacoes) {
        this.orientacoes = orientacoes;
    }
    
    
    
}
