package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by GabrielRS on 04/12/2016.
 */
public class BuscaArquivo {

    public LinkedList leArquivo(String nomeArquivo)
    {
        try{
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha;
            LinkedList<ArrayList> dados = new LinkedList<ArrayList>();

            while((linha = leitor.readLine()) != null)
            {
                String[] paciente = linha.split(",");
                ArrayList<String> listaDados = new ArrayList<String>();
                for(String valor : paciente)
                {
                    listaDados.add(valor);
                }
                dados.add(listaDados);
            }

            return dados;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }


}
