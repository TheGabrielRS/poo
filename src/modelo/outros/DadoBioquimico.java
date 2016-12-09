/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.outros;

/**
 *
 * @author marco
 */
public class DadoBioquimico {
    private String nome;
    private String valor;
    private String data;

    public DadoBioquimico(){}
    
    public DadoBioquimico(String nome, String valor, String data) {
        this.nome = nome;
        this.valor = valor;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
       
       
}
