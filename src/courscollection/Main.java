/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courscollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javac1.Personne;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] a){
        List<Personne> c = new ArrayList<Personne>();
        String s = "Amalvy Theo 170;Cabrer Alois 181;Clerc Thomas 170;Artosimus Machis 60";
        
        String[] t = s.split(";");
        for(int i = 0; i< t.length;i++){
            String d = t[i];
            String[] td = d.split(" ");
            Personne p = new Personne();
            p.setNom(td[0]);
            p.setPrenom(td[1]);
            p.setTaille( Integer.parseInt(td[2]));
            c.add(p);
        }
        //parcours classique
        for(Personne p : c){
            System.out.println(p);
        }        
        //parcours forEach avec lambda a partir du Java8
        c.forEach(p -> {
            System.out.println(p);
        });
        
        String[] chiffres = {"un", "deux", "trois","quatre", "cinq", "six"};
        //ordre lexycographique 
        // cinq , deux , quatre , six , trois , un
        List<String> listeS = new ArrayList<>();
        for(String cs : chiffres){
            listeS.add(cs);
        }
        
        //affichage de la liste initiale
        listeS.forEach(lss -> {
            System.out.println(lss);
        });
        
        Collections.sort(listeS);
        //affichage de la liste triée
        System.out.println("Liste Triée");
        listeS.forEach(lss -> {
            System.out.println(lss);
        });
        
        //trie des personnes
        Collections.sort(c);
        System.out.println("Affichage des personnes triés par nom");
        c.forEach(p -> {
            System.out.println(p);
        });
        
        System.out.println("Trie par taille");
        //ecriture classique
        Collections.sort(c, new Comparator<Personne>() {
            @Override
            public int compare(Personne o1, Personne o2) {
                return (o1.getTaille() - o2.getTaille());
            }
        });
        //ecriture lambda expression
        Collections.sort(c, 
                (Personne o1, Personne o2) -> (o1.getTaille() - o2.getTaille()));
        c.forEach(p -> {
            System.out.println(p);
        });
    }
}
