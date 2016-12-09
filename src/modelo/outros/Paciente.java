/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.outros;
import modelo.telas.Habitos;
import modelo.telas.DadosClinicos;
import modelo.telas.Alimentacao;
import modelo.telas.GastoEnergetico;
import modelo.telas.DadosBioquimicos;
import modelo.telas.CondutaNutricional;
import modelo.telas.AtividadeFísica;
import modelo.telas.Diagnostico;
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
    private String dataNasc; //TODO método para calcular idade
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

    public Paciente(String cpf, String nome, char sexo, String dataNasc, String naturalidade, String profissao, String trabalho, String turnoTrabalho, float peso, float altura, float bia, float imc, float pu, float pp, float cb, float dcs, float dct, Alimentacao alimentacao, AtividadeFísica atividadeFísica, DadosBioquimicos dadosBioquimicos, DadosClinicos dadosClinicos, Habitos habitos, Diagnostico diagnostico, GastoEnergetico gastoEnergetico, CondutaNutricional condutaNutricional) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.trabalho = trabalho;
        this.turnoTrabalho = turnoTrabalho;
        this.peso = peso;
        this.altura = altura;
        this.bia = bia;
        this.imc = imc;
        this.pu = pu;
        this.pp = pp;
        this.cb = cb;
        this.dcs = dcs;
        this.dct = dct;
        this.alimentacao = alimentacao;
        this.atividadeFísica = atividadeFísica;
        this.dadosBioquimicos = dadosBioquimicos;
        this.dadosClinicos = dadosClinicos;
        this.habitos = habitos;
        this.diagnostico = diagnostico;
        this.gastoEnergetico = gastoEnergetico;
        this.condutaNutricional = condutaNutricional;
    }

    
    
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
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

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public AtividadeFísica getAtividadeFísica() {
        return atividadeFísica;
    }

    public void setAtividadeFísica(AtividadeFísica atividadeFísica) {
        this.atividadeFísica = atividadeFísica;
    }

    public DadosClinicos getDadosClinicos() {
        return dadosClinicos;
    }

    public void setDadosClinicos(DadosClinicos dadosClinicos) {
        this.dadosClinicos = dadosClinicos;
    }

    public Habitos getHabitos() {
        return habitos;
    }

    public void setHabitos(Habitos habitos) {
        this.habitos = habitos;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public GastoEnergetico getGastoEnergetico() {
        return gastoEnergetico;
    }

    public void setGastoEnergetico(GastoEnergetico gastoEnergetico) {
        this.gastoEnergetico = gastoEnergetico;
    }

    public CondutaNutricional getCondutaNutricional() {
        return condutaNutricional;
    }

    public void setCondutaNutricional(CondutaNutricional condutaNutricional) {
        this.condutaNutricional = condutaNutricional;
    }
    
    
    
}
