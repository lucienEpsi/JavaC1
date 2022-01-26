/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalFichier;

/**
 *
 * @author 33676
 */
public class Conso {
    //Id	date	Consommateur	Nombre
    private String id;
    private String date;
    private String consommateur;
    private int nombre;

    public Conso(String id, String date, String consommateur, int nombre) {
        this.id = id;
        this.date = date;
        this.consommateur = consommateur;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getConsommateur() {
        return consommateur;
    }

    public void setConsommateur(String consommateur) {
        this.consommateur = consommateur;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    
    
}
