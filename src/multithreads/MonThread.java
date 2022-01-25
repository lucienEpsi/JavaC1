/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 33676
 */
public class MonThread extends Thread {

    private String nom;
    private boolean actif;

    public MonThread(String n) {
        nom = n;
    }

    public void run() {
        actif = true;
        while (actif) {
            System.out.println("MonThread s'affiche " + nom);
            /*try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(MonThread.class.getName()).log(Level.SEVERE, null, ex);
            }*/

            String chemin = "C:\\Travail\\essaiTab.txt";
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(chemin));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MonThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (br.ready()) {
                    String ligne = br.readLine();
                    if (!ligne.equals("")) {

                        String[] tab = ligne.split("\t");
                        System.out.println(tab[0] + ";" + tab[1] + ";" + tab[2]);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(MonThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(MonThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

}
