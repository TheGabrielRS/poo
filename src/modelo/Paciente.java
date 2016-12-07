/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/** 
*
 * @author GabrielRS
 */
public class Paciente {
    
    //Dados pessoais
    private String cpf; //TODO valida CPF
    private String nome;
    private char sexo;
    private LocalDate dataNasc; //TODO método para calcular idade
    private String naturalidade;
    private String profissao;
    private String trabalho;
    private String turnoTrabalho;
    private float peso;
    private float altura;
    private float bia;
    private float imc; //TODO método para calcular IMC
    private float pu; //Peso Usual
    private float pp; //percentual de perda de peso
    private float cb; //circunferência do braço
    private float dcs; //dobra cutânea subescapular
    private float dct; //dobra cutânea tricipital
    
    //Demais informações
    private Alimentacao         alimentacao;
    private AtividadeFísica     atividadeFísica;
    private DadosBioquimicos    dadosBioquimicos;
    private DadosClinicos       dadosClinicos;
    private Habitos             habitos;
    private Diagnostico         diagnostico;
    private GastoEnergetico     gastoEnergetico;
    private CondutaNutricional  condutaNutricional;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBia() {
        return bia;
    }

    public void setBia(float bia) {
        this.bia = bia;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public float getPu() {
        return pu;
    }

    public void setPu(float pu) {
        this.pu = pu;
    }

    public float getPp() {
        return pp;
    }

    public void setPp(float pp) {
        this.pp = pp;
    }

    public float getCb() {
        return cb;
    }

    public void setCb(float cb) {
        this.cb = cb;
    }

    public float getDcs() {
        return dcs;
    }

    public void setDcs(float dcs) {
        this.dcs = dcs;
    }

    public float getDct() {
        return dct;
    }

    public void setDct(float dct) {
        this.dct = dct;
    }
    
}
