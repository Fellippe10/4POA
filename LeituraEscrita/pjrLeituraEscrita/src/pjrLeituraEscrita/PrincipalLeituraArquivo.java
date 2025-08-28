package pjrLeituraEscrita;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLeituraArquivo {
    public static void main(String[] args) {
        try {
           
            FileReader leitura = new FileReader("C:\\Users\\felipe\\Documents\\linguagens\\java\\arq.txt");
            BufferedReader brLeitura = new BufferedReader(leitura);

            System.out.println("--- Conteúdo da Agenda ---");

          
            while (brLeitura.ready()) {
                String linha = brLeitura.readLine();
                System.out.println(linha);
            }

            brLeitura.close();
            leitura.close();

        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado! Verifique o caminho.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}