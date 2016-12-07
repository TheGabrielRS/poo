/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author GabrielRS
 */
public class DadosBioquimicos {
    
    private ArrayList<String> parametro;
    private ArrayList<LocalDate> data; //TODO método para consistência dos dados entre os arrays

    public DadosBioquimicos() {
    }

    public DadosBioquimicos(ArrayList<String> parametro, ArrayList<LocalDate> data) {
        this.parametro = parametro;
        this.data = data;
    }

    public ArrayList<String> getParametro() {
        return parametro;
    }

    public void setParametro(ArrayList<String> parametro) {
        this.parametro = parametro;
    }

    public ArrayList<LocalDate> getData() {
        return data;
    }

    public void setData(ArrayList<LocalDate> data) {
        this.data = data;
    }
    
    
    
}
