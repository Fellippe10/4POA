package pjrLeituraEscrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class PrincipalEscritaArquivo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
          
            FileWriter escrita = new FileWriter("C:\\Users\\felipe\\Documents\\linguagens\\java\\arq.txt", true);
            BufferedWriter bwEscrita = new BufferedWriter(escrita);

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

        
            System.out.print("Digite o email: ");
            String email = scanner.nextLine();

            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();


            bwEscrita.write("Nome: " + nome);
            bwEscrita.newLine();
            bwEscrita.write("Email: " + email);
            bwEscrita.newLine();
            bwEscrita.write("Telefone: " + telefone);
            bwEscrita.newLine();
            bwEscrita.newLine(); 

   
            bwEscrita.close();
            escrita.close();

            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}