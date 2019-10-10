/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoclient;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class PrimoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        try {
            
            // Creo la connessione con il server
            // Invio un numero

            Socket s = new Socket("10.103.0.27",1050); //istanzio socket [indirizzo ip + porta del server che mi offre servizio]
            s.getOutputStream().write(7); //invio dato [intero]
            s.close(); // chiudo la comunicazione
        } catch (IOException ex) {
            Logger.getLogger(PrimoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
