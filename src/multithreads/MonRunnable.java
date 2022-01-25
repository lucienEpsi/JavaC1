/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javac1.Personne;

/**
 *
 * @author 33676
 */
public class MonRunnable extends Personne implements Runnable{
    private boolean actif;
    private String nom;
    public MonRunnable(String n){
        nom=n;
    }
    @Override
    public void run() {
        actif=true;
        while(actif){
            System.out.println("MonRunnable s'affiche "+nom);
            
        }
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
    
    
}
