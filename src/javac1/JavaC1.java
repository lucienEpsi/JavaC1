/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac1;

/**
 *
 * @author 33676
 */
public class JavaC1 {

    public static void main(String[] args) {
        String s = "Amoioioiy Theo 170;Cabotfertsr Alois 181;Ceisterc Thomas 170";
        String[] tP = s.split(";");
        Personne[] personnes = new Personne[tP.length];
        try{
        fabriqueTableauPersonne(tP, personnes);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("PAssage obligatoire");
        }
        System.out.println("Apres test d'erreur ");
        for (Personne p : personnes) {
            System.out.println(p);
        }
    }

    public static void fabriqueTableauPersonne(String[] tP, Personne[] personnes) 
    throws NumberFormatException {
        for (int i = 0; i < tP.length; i++) {
            //Amalvy Theo 170
            //try {
                String[] tDetails = tP[i].split(" ");
                Personne p = new Personne();
                p.setNom(tDetails[0]);
                p.setPrenom(tDetails[1]);

                p.setTaille(Integer.parseInt(tDetails[2]));
                System.out.println("Instruction apres ligne suceptible de lever une exception");
                personnes[i] = p;
            //} catch (Exception e) {
            //    e.printStackTrace();
                //Le programe continue
            //}
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        String divers = "Aujourd'hui j'ai des apprenants reseaux interressants";

        System.out.println("Hello, les spécialistes RESEAUXXXXX!");
        String nom = "Martos";
        String prenom = "Lucien";
        System.out.println(nom + " " + prenom);
        System.out.println(nom.charAt(0));
        System.out.println(nom.charAt(nom.length() - 1));
        char derniereLettre = nom.charAt(nom.length() - 1);
        String s = derniereLettre + "";
        System.out.println(" Majuscule " + s.toUpperCase());
        String[] tS = divers.split(" ");
        for (int i = 0; i < tS.length; i++) {
            if (tS[i].equals("interressants")) {
                System.out.println("dans le if");
                System.out.println(tS[i].toUpperCase());
            } else {
                System.out.println(tS[i]);
            }

        }
        //prog object

        Personne p = new Personne();
        p.setNom("Martos");
        p.setPrenom("Lucien");
        p.setTaille(175);
        System.out.println(p.getNom() + " " + p.getPrenom() + " taille " + p.getTaille() + " cm");
        System.out.println(p);
    }

}
