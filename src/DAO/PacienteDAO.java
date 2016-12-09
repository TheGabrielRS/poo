/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.net.URL;
import modelo.outros.Paciente;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

/**
 *
 * @author GabrielRS
 */
public class PacienteDAO {
    
    public static final String URL = ValidaLogin.class.getProtectionDomain().getCodeSource().getLocation().getFile()+"/DAO/pacientes.csv";
    public static final File ARQUIVO = new File(URL);
    
    public static boolean salvaPaciente(Paciente p)
    {
        try{
            FileWriter pacientes = new FileWriter(ARQUIVO,true);
            BufferedWriter writer = new BufferedWriter(pacientes);
            System.out.println(p.toCSV());
            writer.write(p.toCSV());
            writer.newLine();
            writer.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
            return false;
        }
    }
    
    public Paciente buscaPaciente(String filtro)
    {
        try{
            FileReader arqPacientes = new FileReader(ARQUIVO);
            BufferedReader leitorPacientes = new BufferedReader(arqPacientes);
            String linha = null;
            String[] splitLinha = null;
            Paciente paciente = null;
            while((linha = leitorPacientes.readLine()) != null){
                splitLinha = linha.split(",");
                System.out.println("filtro: "+filtro);
                if(filtro.equals(splitLinha[0]))
                {
                    paciente = new Paciente();
                    paciente.setCpf(splitLinha[0]);
                    paciente.setNome(splitLinha[1]);
                    paciente.setSexo(splitLinha[2].charAt(0));
                    paciente.setDataNasc(splitLinha[3]);
                    paciente.setNaturalidade(splitLinha[4]);
                    paciente.setProfissao(splitLinha[5]);
                    paciente.setTrabalho(splitLinha[6]);
                    paciente.setTurnoTrabalho(splitLinha[7]);
                    return paciente;
                }
            }            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
            return null;
    }
    
}
