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
import modelo.telas.AtividadesFisicas;
import modelo.telas.Diagnostico;
/** 
*
 * @author GabrielRS
 */
public class Paciente {
    
    //Dados pessoais
    private String cpf;
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
    private AtividadesFisicas   atividadeFísica;
    private DadosBioquimicos    dadosBioquimicos;
    private DadosClinicos       dadosClinicos;
    private Habitos             habitos;
    private Diagnostico         diagnostico;
    private GastoEnergetico     gastoEnergetico;
    private CondutaNutricional  condutaNutricional;

    public Paciente() {
    }
    
    
    public Paciente(String cpf, String nome, char sexo, String dataNasc, String naturalidade, String profissao, String trabalho, String turnoTrabalho, float peso, float altura, float bia, float imc, float pu, float pp, float cb, float dcs, float dct, Alimentacao alimentacao, AtividadesFisicas atividadeFísica, DadosBioquimicos dadosBioquimicos, DadosClinicos dadosClinicos, Habitos habitos, Diagnostico diagnostico, GastoEnergetico gastoEnergetico, CondutaNutricional condutaNutricional) {
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

    
    public String toCSV()
    {
        String tmpAlimentacao = "";
        for(AtividadeFisica a: this.atividadeFísica.getAtividadesFisicas()){
            tmpAlimentacao += a.getTipo() + ",";
            tmpAlimentacao += a.getHorario()+ ",";
            tmpAlimentacao += a.getFrequencia()+ ",";
            tmpAlimentacao += a.getTempo();
            tmpAlimentacao += ",";
        }
        
        String tmpDadosBioquimicos = "";
        for(DadoBioquimico db: this.dadosBioquimicos.getDadosBioquimicos()){
            tmpDadosBioquimicos += db.getNome() + ",";
            tmpDadosBioquimicos += db.getValor() + ",";
            tmpDadosBioquimicos += db.getData() + ",";
            tmpDadosBioquimicos += ",";
        }
        
        
        String csv ="";
        csv += "dados pessoais,"+
               this.cpf + "," + 
               this.nome + "," + 
               this.sexo + "," + 
               this.dataNasc + "," + 
               this.naturalidade + "," + 
               this.profissao + "," + 
               this.trabalho + "," + 
               this.turnoTrabalho + "," + 
               this.peso + "," + 
               this.altura + "," + 
               this.bia + "," + 
               this.imc + "," + 
               this.pu + "," + 
               this.pp + "," + 
               this.cb + "," + 
               this.dcs + "," + 
               this.dct + "," + 
                
               //ALIMENTACAO
               "alimentação,"+
               this.alimentacao.getDesjejum().getDescricao() + "," + 
               this.alimentacao.getDesjejum().getHorario() + "," + 
                
               this.alimentacao.getLanche().getDescricao() + "," +
               this.alimentacao.getLanche().getHorario() + "," + 
                
               this.alimentacao.getColacao().getDescricao() + "," + 
               this.alimentacao.getColacao().getHorario() + "," + 

               this.alimentacao.getJantar().getDescricao() + "," + 
               this.alimentacao.getJantar().getHorario() + "," + 

               this.alimentacao.getAlmoco().getDescricao() + "," + 
               this.alimentacao.getAlmoco().getHorario() + "," + 

               this.alimentacao.getCeia().getDescricao() + "," + 
               this.alimentacao.getCeia().getHorario() + "," + 
                
               this.alimentacao.getObservacoes() + "," + 
               this.alimentacao.getGosta() + "," + 
               this.alimentacao.getNaoGosta() + "," + 
                
               //Atividades físicas
               "atividades físicas,"+
               tmpAlimentacao + "," +
                
               //Dados Bioquimicos
               "dados bioquimicos," + 
               tmpDadosBioquimicos + "," +
                
               //Dados Clínicos
               "dados clínicos," + 
               this.dadosClinicos.getHistoria() + "," +
               this.dadosClinicos.getInterferencia() + "," +
               this.dadosClinicos.getAtitudes() + "," +
               this.dadosClinicos.getPatologias() +
               ",alteracões gastro," + 
               this.dadosClinicos.getAlteracoesGastrointestinais().toString() +
               ",obs," + 
               this.dadosClinicos.getGastroObs() + 
               ",mudanças consistência," +
               this.dadosClinicos.isConsistencia() + "," +
               this.dadosClinicos.getMotivoConsistencia() + "," +
               ",apetite," + 
               this.dadosClinicos.getApetite() + "," +
               this.dadosClinicos.getApetiteRazao() + "," +
                
               //Hábitos
               "hábitos," + 
               this.habitos.getAlergia() + "," +
               this.habitos.getQtdAgua() + "," +
               this.habitos.isEtilismo() + "," +
               this.habitos.getDescEtilismo() + "," +
               this.habitos.isFumante() + "," +
               this.habitos.isExFumante() + "," +
               this.habitos.getAnosCigarros() + "," +
               this.habitos.getDescSono() + "," + 
                
               //Diagnóstico
               "diagnostico," + 
               this.diagnostico.getDiagnostico() + "," +
               this.diagnostico.getVerduras() + "," +
               this.diagnostico.getFrutas() + "," +
               this.diagnostico.getRefrigerante() + "," +
               this.diagnostico.getDoces() + "," +
               this.diagnostico.getPaes() + "," +
               this.diagnostico.getFrituras() + "," +
               this.diagnostico.getFastFood() + "," +
                
               //Gasto energético
               "gasto energético," +
               this.gastoEnergetico.getGeb() + "," +
               this.gastoEnergetico.getGet() + "," +
                
               //Conduta Nutricional
               "conduta nutricional,"+
               this.condutaNutricional.getValorEnergeticoTotal() + "," + 
               this.condutaNutricional.getConduta() + "," +
               this.condutaNutricional.getOrientacoes();
        
        return csv;
    }
    
    public String toConsulta()
    {
        String consulta = "CPF: "+cpf+"\n Nome: "+nome+"\n Sexo: "+sexo+"\n Data de nascimento: "+dataNasc+"\n Naturalidade: "+naturalidade+"\n Profissão: "+profissao+"\n Turno de trabalho: "+turnoTrabalho;
        return consulta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public AtividadesFisicas getAtividadeFísica() {
        return atividadeFísica;
    }

    public void setAtividadeFísica(AtividadesFisicas atividadeFísica) {
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

    public DadosBioquimicos getDadosBioquimicos() {
        return dadosBioquimicos;
    }

    public void setDadosBioquimicos(DadosBioquimicos dadosBioquimicos) {
        this.dadosBioquimicos = dadosBioquimicos;
    }
    
    
    
    
}
