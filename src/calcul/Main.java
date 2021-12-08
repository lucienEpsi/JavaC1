/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcul;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();
        int a = 10;
        int b = 5;
        System.out.println(c.addition(a, b));
        System.out.println(c.soustraction(a, b));
        System.out.println(c.multiplication(a, b));
        try {
            System.out.println(c.division(10, 0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(c.division(0, 10));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
