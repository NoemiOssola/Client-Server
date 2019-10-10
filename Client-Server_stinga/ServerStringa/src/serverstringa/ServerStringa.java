/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverstringa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ServerStringa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for(;;)
            {
                ServerSocket ss = new ServerSocket(8888); // istanzio il server, definendo la porta
                Socket s = ss.accept(); // accetto la comunicazione
                InputStreamReader isr = new InputStreamReader(s.getInputStream()); //lattura dato [stringa]
                BufferedReader b = new BufferedReader(isr); // utilizzo il buffer, così si leggera una riga intera
                System.out.println("Il server ha ricevuto: " + b.readLine()); //stampo dato ricevuto
                ss.close(); // chiudo comunicazione
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerStringa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
