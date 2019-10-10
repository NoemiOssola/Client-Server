/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author pc15
 */
public class PrimoServer {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
      try{
          for(;;){
          ServerSocket ss = new ServerSocket(1234);
          Socket s = ss.accept();
          
          int datoIntero = s.getInputStream().read();
              System.out.println("il server ha ricevuto:"+ datoIntero);
              s.close();
                  }
      }catch(Exception r){
          
      }
        
    }
    
}
    

