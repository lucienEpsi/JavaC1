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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 33676
 */
public class UtilFichier {
    public static void main(String[] args) {
        System.out.println("Lancement du programme de lecture ");
        //chemin du fichier
        String s = "C:\\Users\\33676\\Documents\\cours\\java base\\reseau\\fichier.txt";
        
        BufferedReader br;
        try {
            //try {
            br = new BufferedReader(new FileReader(s));
        
            while(br.ready()){
                String line = br.readLine();
                //System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UtilFichier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UtilFichier.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        //lire le fichier et extraire les infos
        String path = "C:\\Users\\33676\\Documents\\cours\\java base\\reseau\\personnes.txt";
        try {
            lireEtAfficher(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UtilFichier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UtilFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("***************************************");
        try {
            //lire le fichier et recuperer la collection de personnes et on ecrit dans un fichier html
            List<Personne> personnes = lireFichierReturnListP(path);
            /*
            <table>
            <tr><th>Prénom</th><th>Nom</th></tr>
            <tr><td>Camille</td><td>Lemaire</td></tr>
            </table>
            
            */
            System.out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"><table>\n" +
"            <tr><th>Prénom</th><th>Nom</th><th>Ville</th></tr>");
            for(Personne p : personnes){
                //System.out.println(p);
                System.out.println(
                        "<tr><td>"+p.getPrenom()+"</td><td>"+
                                p.getNom()+"</td><td>"+
                                p.getVille()+"</td></tr>");
            }
            System.out.println("</table>");
            String out="C:\\Users\\33676\\Documents\\cours\\java base\\reseau\\out.html";
            createHTML(out, personnes);
        } catch (IOException ex) {
            Logger.getLogger(UtilFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void createHTML(String out, List<Personne> personnes) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(out);
        pw.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"><table>\n" +
                "            <tr><th>Prénom</th><th>Nom</th><th>Ville</th></tr>");
        for(Personne p : personnes){
            //System.out.println(p);
            pw.println(
                    "<tr><td>"+p.getPrenom()+"</td><td>"+
                            p.getNom()+"</td><td>"+
                            p.getVille()+"</td></tr>");
        }
        pw.println("</table>");
        pw.close();
    }

    private static void lireEtAfficher(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        while (br.ready()){
            String line = br.readLine();
            String[] t = line.split(";");
            Personne p = new Personne(t[0], t[1], t[2]);
            //System.out.println(t[0]+" "+t[1]+" "+t[2]);
            System.out.println(p);
        }
        br.close();
    }

    private static List<Personne> lireFichierReturnListP(String path) throws IOException {
        List<Personne> personnes = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        while (br.ready()){
            String line = br.readLine();
            String[] t = line.split(";");
            Personne p = new Personne(t[0], t[1], t[2]);
            personnes.add(p);
        }
        br.close();
        return personnes;
    }
}
