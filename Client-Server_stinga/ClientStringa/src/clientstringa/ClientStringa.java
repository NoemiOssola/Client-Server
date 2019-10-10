/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientstringa;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ClientStringa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket s = new Socket("localhost", 1050); //istanzio socket
            PrintWriter p = new PrintWriter(s.getOutputStream(), true); //stampa 
            p.println("Test"); //stringa che verrà spedita al server
            s.close(); // chiusura comunicazione
        } catch (IOException ex) {
            Logger.getLogger(ClientStringa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
