/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noemi Ossola
 */
public class PrimoServer {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
      try{
          for(;;){ // per far restare il server sempre attivo, cicla all' infinito
          ServerSocket ss = new ServerSocket(3333); // istanzio il server
          Socket s = ss.accept(); //accendo la comunicazione
          
          int datoIntero = s.getInputStream().read(); // lettura del dato [intero]
              System.out.println("il server ha ricevuto:"+ datoIntero); //stampo dato ricevuto, che è stato scritto dal client
              ss.close(); // chiudo la comunicazione, il server aspetterà che un altro client invia un' altro dato intero
                  }
      }catch(Exception r){
          
      }
        
    }
    
}
    

