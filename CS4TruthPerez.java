/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4truthperez;

/**
 *
 * @author Super
 */
public class CS4TruthPerez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MonClass info = new MonClass();
        info.changeGenshinCharac("Kamisato Ayaka");
        info.changeCharacAge(20);
        info.changeBurstCD(10.0);
        System.out.println(info.getNewGenshinCharac());
        System.out.println(info.getNewCharacAge());
        System.out.println(info.getNewBurstCD());
        
        
        Song a = new Song();
        a.setSongName("Unexpectedly");
        System.out.println(a.getSongName());   
        a.setArtistName("Megumi Acorda");
        System.out.println(a.getartistName()); 
        a.setSongLength(4.4);
        System.out.println(a.getSongLength()); 
        
        Singer MegumiAcorda = new Singer();
        a.setSongName("Into the Unknown");
        MegumiAcorda.changeFavSong(a);
        MegumiAcorda.performForAudience(12);
        System.out.println("no. of Perofrmances: " + MegumiAcorda.getNewNumPerf());
        System.out.println("Earnings: " + MegumiAcorda.getNewEarnings() + " PhP");
        System.out.println("New Song:  " + MegumiAcorda.getNewName() + "\n"); 
        
        
        Singer ElsaOldenburg = new Singer();
        a.setSongName("Into the Unknown");
        ElsaOldenburg.changeFavSong(a);
        ElsaOldenburg.performForAudience(12);
        System.out.println("no. of Perofrmances: " + ElsaOldenburg.getNewNumPerf());
        System.out.println("Earnings: " + ElsaOldenburg.getNewEarnings() + " PhP");
        System.out.println("New Song:  " + ElsaOldenburg.getNewName()); 
    
        
        
    }
    
    
    
    
}
