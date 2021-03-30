/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author putri aurelia
 */
public class Tabung {
    double rad, tinggi;
    
    Tabung(){
        rad = 1;
        tinggi = 1;
    }
    
    Tabung(double r, double t){
        rad = r;
        tinggi = t;
    }

    public double getVolume(){
        double volume = getLuasAlas() * tinggi;
        return volume;     
    }
    
    public double getLuasAlas(){
        double luas_alas = Math.PI * Math.pow(rad, 2);
        return luas_alas;
    }
    
    public void setRadius(double r){
        rad = r;
    }
    
    public void setTinggi(double t){
        tinggi = t;
    }
}
