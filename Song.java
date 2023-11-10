/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4truthperez;

/**
 *
 * @author Super
 */
public class Song {
    private String songName;
    private String artistName;
    private double songLength;
    
    public void setSongName (String setSongName){
        this.songName = setSongName;
    }
    
    public String getSongName() {
        return songName;
    }
    
    public void setArtistName (String setArtistName){
        this.artistName = setArtistName;
    }
    
    public String getartistName() {
        return artistName;
    }
    
    public void setSongLength (double setSongLength){
        this.songLength = setSongLength;
    }
    
    public double getSongLength() {
        return songLength;
    }
}
