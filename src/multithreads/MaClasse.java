/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreads;

import javac1.Personne;

/**
 *
 * @author 33676
 */
public class MaClasse extends  Personne{
    public void affiche() throws InterruptedException{
        for(;;){
            System.out.println("MaClasse s'affiche");
            Thread.sleep(100);
        }
        
    }
}
