/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalFichier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class LectureEcritureHTML {
    private String chemin = "C:\\Users\\33676\\Documents\\cours\\java base\\consommation.csv";
    private String cheminSortie = "C:\\Users\\33676\\Documents\\cours\\java base\\consommation.html";
        
    public void execute() throws IOException{
        //lecture du fichier afin de recupérer les differentes lignes
        
        //on va stocker les classes issues des ligne dans une collection de type List
        List<Conso> consos = lire(chemin); 
        
        ecrireHTML(consos);
        
        
    }

    private void ecrireHTML(List<Conso> consos) throws FileNotFoundException {
        //ecriture du fichier
        PrintWriter pw = new PrintWriter(cheminSortie);
        //fichier HTML
        String entete = "<HTML><HEAD><TITLE>Ma page</TITLE></HEAD><BODY>";
        String tableau ="<TABLE>";
        String piedDePage = "</BODY></HTML>";
        pw.println(entete);
        pw.println("Lucien Martos");
        pw.println(tableau);
        int total = 0;
        for(Conso co : consos){
            total+=co.getNombre();
            pw.println("<TR>");
            pw.println("<TD>"+ co.getId()+"</td><td> "+co.getDate()+"</td><td>"+co.getConsommateur()+"</td><td>"+co.getNombre()+"</td>");
            pw.println("</TR>");
        }
        pw.println("<TR><TD></TD><TD></TD><TD></TD><TD>"+total+"</TD>");
        pw.println("<TABLE>");
        
        
        pw.println(piedDePage);
        pw.flush();
        pw.close();
    }

    private List<Conso> lire(String chemin) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new FileReader(chemin));
        List<Conso> consos = new ArrayList<>();        
        //lecture du fichier
        //CAD;Thu Sep 30 11:49:16 CEST 2021;Lucien Martos;52
        //ligne d'entete
        //String ligne = br.readLine();
        while(br.ready()){
            String ligne = br.readLine();
            String[] tab = ligne.split(";");
            //alternative a la lecture de la premiere ligne
            if(!tab[0].equals("Id")){
                consos.add(new Conso(tab[0],tab[1],tab[2],Integer.parseInt(tab[3])));
            }
        }
        //on ferme le fichier
        br.close();
        //on renvoie une liste de Conso
        return consos;
    }
}
