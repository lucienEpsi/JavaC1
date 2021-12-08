/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcul;

/**
 *
 * @author 33676
 */
public class Calculatrice {

    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b)throws MonException {
        //ce test boolean est a proscrire puisqu'il ne 
        //reflete pas la réalité
        /*
        if(b==0){
            return 0;
        }
         */
        //code efficace sur la capture de l'erreur
        //mais insatisfaisant sur la valeur de retour (0 pour la division par 0)
        /*int resultat = 0;
        try {
            resultat = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultat;
*/
        if(b==0){
            throw new MonException();
        }
        return a / b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}
