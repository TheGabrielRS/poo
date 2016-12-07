/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;

/**
 *
 * @author GabrielRS
 */
public class Alimentacao {
    
    private Refeicao desjejum;
    private Refeicao lanche;
    private Refeicao colacao;
    private Refeicao jantar;
    private Refeicao almoco;
    private Refeicao ceia;
    private String observacoes;
    private String gosta;
    private String naoGosta;

    public Alimentacao() {
    }
    
    public Alimentacao(Refeicao desjejum, Refeicao lanche, Refeicao colacao, Refeicao jantar, Refeicao almoco, Refeicao ceia, String observacoes, String gosta, String naoGosta) {
        this.desjejum = desjejum;
        this.lanche = lanche;
        this.colacao = colacao;
        this.jantar = jantar;
        this.almoco = almoco;
        this.ceia = ceia;
        this.observacoes = observacoes;
        this.gosta = gosta;
        this.naoGosta = naoGosta;
    }

    public Refeicao getDesjejum() {
        return desjejum;
    }

    public void setDesjejum(Refeicao desjejum) {
        this.desjejum = desjejum;
    }

    public Refeicao getLanche() {
        return lanche;
    }

    public void setLanche(Refeicao lanche) {
        this.lanche = lanche;
    }

    public Refeicao getColacao() {
        return colacao;
    }

    public void setColacao(Refeicao colacao) {
        this.colacao = colacao;
    }

    public Refeicao getJantar() {
        return jantar;
    }

    public void setJantar(Refeicao jantar) {
        this.jantar = jantar;
    }

    public Refeicao getAlmoco() {
        return almoco;
    }

    public void setAlmoco(Refeicao almoco) {
        this.almoco = almoco;
    }

    public Refeicao getCeia() {
        return ceia;
    }

    public void setCeia(Refeicao ceia) {
        this.ceia = ceia;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getGosta() {
        return gosta;
    }

    public void setGosta(String gosta) {
        this.gosta = gosta;
    }

    public String getNaoGosta() {
        return naoGosta;
    }

    public void setNaoGosta(String naoGosta) {
        this.naoGosta = naoGosta;
    }
    
    
    
}
