/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4truthperez;

/**
 *
 * @author Super
 */
public class Singer {

    private static int totalPerformances=24;
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private double totalEarn;
    private double indivEarn;
    
   
    public void performForAudience(int perf) {
        this.noOfPerformances = perf;
        this.earnings = earnings + perf * 100;
    }
    
    public static int getTotalPerformances(){
        return totalPerformances;
    }
    
    public void addPerfs( double AcordaEarn, double OldenburgEarn){
        this.totalEarn = (AcordaEarn*100 + OldenburgEarn*100)/2;
    }
    
    public void addPerfs( int AcordaEarn, int OldenburgEarn){
        this.totalEarn = (AcordaEarn*100 + OldenburgEarn*100)/2;
    }
    public void changeName (String newName) {
        this.name = newName;
    }
    
    public String getNewName() {
        return name;
    }
    
    public void changeNumPerf (int newNumPerf) {
        this.noOfPerformances = newNumPerf;
    }
    
    public int getNewNumPerf() {
        return noOfPerformances;
    }
    
    public void changeEarnings (double newEarnings) {
        this.earnings = newEarnings;
    }
    
    public double getNewEarnings() {
        return earnings;
    }
    
    public void changeFavSong (Song newFavSong) {
        this.favoriteSong = newFavSong;
    }
    
    public Song getNewFavSong() {
        return favoriteSong;
    }
    
}

    
