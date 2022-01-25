/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 33676
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String chemin = "C:\\Travail\\essaiTab.txt";
        BufferedReader br = new BufferedReader(new FileReader(chemin));
        while (br.ready()) {
            String ligne = br.readLine();
            if (!ligne.equals("")) {
                
                String[] tab = ligne.split("\t");
                System.out.println(tab[0] + ";" + tab[1] + ";" + tab[2]);
            }
        }
        br.close();
    }
}
