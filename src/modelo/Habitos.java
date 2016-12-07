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
public class Habitos {
    
    private String alergia;
    private int    qtdAgua;
    private boolean etilismo;
    private String descEtilismo;
    private boolean fumante;
    private boolean exFumante;
    private int     anosCigarros; //TODO método para popular corretamente conforme resposta anterior

    public Habitos() {
    }

    public Habitos(String alergia, int qtdAgua, boolean etilismo, String descEtilismo, boolean fumante, boolean exFumante, int anosCigarros) {
        this.alergia = alergia;
        this.qtdAgua = qtdAgua;
        this.etilismo = etilismo;
        this.descEtilismo = descEtilismo;
        this.fumante = fumante;
        this.exFumante = exFumante;
        this.anosCigarros = anosCigarros;
    }
    
    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public int getQtdAgua() {
        return qtdAgua;
    }

    public void setQtdAgua(int qtdAgua) {
        this.qtdAgua = qtdAgua;
    }

    public boolean isEtilismo() {
        return etilismo;
    }

    public void setEtilismo(boolean etilismo) {
        this.etilismo = etilismo;
    }

    public String getDescEtilismo() {
        return descEtilismo;
    }

    public void setDescEtilismo(String descEtilismo) {
        this.descEtilismo = descEtilismo;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public boolean isExFumante() {
        return exFumante;
    }

    public void setExFumante(boolean exFumante) {
        this.exFumante = exFumante;
    }

    public int getAnosCigarros() {
        return anosCigarros;
    }

    public void setAnosCigarros(int anosCigarros) {
        this.anosCigarros = anosCigarros;
    }
    
    
}
