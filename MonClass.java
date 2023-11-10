/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4truthperez;

/**
 *
 * @author Super
 */
public class MonClass {
     private String genshinCharac;
     private int characAge;
     private double burstCD;
     
    public void changeGenshinCharac (String newGenshinCharac){
        this.genshinCharac = newGenshinCharac;
    }
    
    public String getNewGenshinCharac() {
        return genshinCharac;
    }
        
    public void changeCharacAge (int newCharacAge){
        this.characAge = newCharacAge;
    }
    
    public int getNewCharacAge() {
        return characAge;
    }
        
    public void changeBurstCD (double newburstCD){
        this.burstCD = newburstCD;
    }
    
    public double getNewBurstCD() {
        return burstCD;
    }
}