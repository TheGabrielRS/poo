/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.telas;

import java.util.ArrayList;

/**
 *
 * @author GabrielRS
 */
public class DadosClinicos {
    
    private String historia;
    private String interferencia;
    private String atitudes;
    private String patologias;
    private ArrayList<String> alteracoesGastrointestinais; //TODO verificação para popular corretamente
    private String gastroObs;
    private boolean consistencia;
    private String motivoConsistencia;
    private String apetite;
    private String apetiteRazao;

    public DadosClinicos() {
    }
    
    public DadosClinicos(String historia, String interferencia, String atitudes, String patologias, ArrayList<String> alteracoesGastrointestinais, String gastroObs, boolean consistencia, String motivoConsistencia, String apetite, String apetiteRazao) {
        this.historia = historia;
        this.interferencia = interferencia;
        this.atitudes = atitudes;
        this.patologias = patologias;
        this.alteracoesGastrointestinais = alteracoesGastrointestinais;
        this.gastroObs = gastroObs;
        this.consistencia = consistencia;
        this.motivoConsistencia = motivoConsistencia;
        this.apetite = apetite;
        this.apetiteRazao = apetiteRazao;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getInterferencia() {
        return interferencia;
    }

    public void setInterferencia(String interferencia) {
        this.interferencia = interferencia;
    }

    public String getAtitudes() {
        return atitudes;
    }

    public void setAtitudes(String atitudes) {
        this.atitudes = atitudes;
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public ArrayList<String> getAlteracoesGastrointestinais() {
        return alteracoesGastrointestinais;
    }

    public void setAlteracoesGastrointestinais(ArrayList<String> alteracoesGastrointestinais) {
        this.alteracoesGastrointestinais = alteracoesGastrointestinais;
    }

    public String getGastroObs() {
        return gastroObs;
    }

    public void setGastroObs(String gastroObs) {
        this.gastroObs = gastroObs;
    }

    public boolean isConsistencia() {
        return consistencia;
    }

    public void setConsistencia(boolean consistencia) {
        this.consistencia = consistencia;
    }

    public String getMotivoConsistencia() {
        return motivoConsistencia;
    }

    public void setMotivoConsistencia(String motivoConsistencia) {
        this.motivoConsistencia = motivoConsistencia;
    }

    public String getApetite() {
        return apetite;
    }

    public void setApetite(String apetite) {
        this.apetite = apetite;
    }

    public String getApetiteRazao() {
        return apetiteRazao;
    }

    public void setApetiteRazao(String apetiteRazao) {
        this.apetiteRazao = apetiteRazao;
    }
    
    
}
