package pjrSerializacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrincipalSerializacao {
    public static void main(String[] args) {
        Colaborador c = new Colaborador("Pedro", 22, 7500.50);
        
        try {
            File f = new File("c:/a/");
            if(!f.exists()) f.mkdir();
            
            FileOutputStream arqOSer = new FileOutputStream("c:/a/colaborador.ser");
            ObjectOutputStream oOSer = new ObjectOutputStream(arqOSer);
            
            oOSer.writeObject(c);
            oOSer.close();
            
       
            System.out.println("---------------Antes de alterar salário-------------");
            System.out.println(c);
            
            c.setSalario(9250.75);
     
            System.out.println("---------------Depois de alterar salário-------------");
            System.out.println(c);
            
            FileInputStream arqISer = new FileInputStream("c:/a/colaborador.ser");
            ObjectInputStream iOSer = new ObjectInputStream(arqISer);
            
          
            c = (Colaborador) iOSer.readObject();
            iOSer.close();
            
            System.out.println("---------------Depois de recuperar os valores-------------");
            System.out.println(c);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}