/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthperez;

/**
 *
 * @author TRUTH
 */
public class CS4TruthPerez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Mark Tarcelo";
        String subject1 = "Computer Science";
        int year1 = "7";
        System.out.println("Teacher 1" + "\n" + "Name: " + name1 + "\n" + "Subject: " + subject1 + "\n" +  "Years of Teaching: " + year1 + "\n");
        
        String name2 = "Joshua Tarcelo";
        String subject2 = "Social Science";
        int year2 = "4";
        System.out.println("Teacher 2" + "\n" + "Name: " + name2 + "\n" + "Subject: " + subject2 + "\n" +  "Years of Teaching: " + year2 + "\n");
        
        String name3 = "Ayaka Tarcelo";
        String subject3 = "Study Period";
        int year3 = "0";
        System.out.println("Teacher 3" + "\n" + "Name: " + name3 + "\n" + "Subject: " + subject3 + "\n" +  "Years of Teaching: " + year3 + "\n");
    
        int totalYears = year1 + year2 + year3;
        System.out.println("Total Years of teaching: " + totalYears);

        boolean year2longest = (year2 > year1) && (year2 > year3);
        System.out.println("Joshua Tarcelo has the most years of teaching: " + year2longest);

        boolean sameSub = (subject1 == subject2) && (subject1 == subject3) && (subject2 == subject3);
    }
    
}
