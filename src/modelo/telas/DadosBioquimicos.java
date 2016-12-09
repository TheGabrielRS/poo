/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.telas;

import java.util.ArrayList;
import java.time.LocalDate;
import modelo.outros.DadoBioquimico;

/**
 *
 * @author GabrielRS
 */
public class DadosBioquimicos {
    
    private ArrayList<DadoBioquimico> dadosBioquimicos;

    public DadosBioquimicos() {
    }

    public DadosBioquimicos(ArrayList<DadoBioquimico> dadosBioquimicos) {
        this.dadosBioquimicos = dadosBioquimicos;
    }

    public ArrayList<DadoBioquimico>  getDadosBioquimicos() {
        return dadosBioquimicos;
    }

    public void setDadosBioquimicos(ArrayList<DadoBioquimico>  dadosBioquimicos) {
        this.dadosBioquimicos = dadosBioquimicos;
    }
    
    
    
}
