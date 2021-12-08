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
public class MonException extends Exception{
    
    public MonException(){
        super("Division par zero impossible");
    }
}
