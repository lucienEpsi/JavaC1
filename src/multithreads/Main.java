/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreads;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        
        //liste de Threads qui seront instancies et lance
        List<MonThread> mts = new ArrayList<>();
        for(int i = 0; i< 10; i++){
            mts.add(new MonThread("T"+i));
        }
        //lancement des Threads par la methode start qui appelle la methode run
        for(MonThread mt : mts){
            mt.start();
        }
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //arret du Thread avec un boolean (stop est deprecie)
        for(MonThread mt : mts){
            mt.setActif(false);
        }
        
        System.out.println("Programme de Thread est fini");
        
    }
    public static void mainRunnable(String[] args) {
        List<MonRunnable> lmr = new ArrayList<>();
        for(int i = 0; i< 10; i++){
            MonRunnable mr = new MonRunnable("R"+i);
            lmr.add(mr);
        }
        List<Thread> ts = new ArrayList<>();
        for(int i = 0; i< 10; i++){
            
            ts.add(new Thread(lmr.get(i)));
        }
        for(Thread t : ts){
            t.start();
        }
       // MonRunnable mr = new MonRunnable("R1");
       // Thread mt = new Thread(mr);
        
       // mt.start();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(MonRunnable mr :lmr){
            mr.setActif(false);
        }
        
        System.out.println("C'est fini");
    }
}
