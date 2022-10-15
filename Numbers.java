/*
 * @author 3156908
 *
 * @version 1.0 07/14/2020
 *
 * Title: Password Encryption and Decription
 *
 * Semester: Summer 2020
 *
 * Lecturer's Name: C. Charters
 */
package main;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Adriana
 */
public class Numbers {
 
    public static Scanner key = new Scanner(System.in);
    public static int[] lotteryNumbers = new int[6];
    public static int[] userLotteryPicks = new int [6];
    
    public Numbers() {
        Random rand = new Random();
        boolean duplicates;
        int numbers;
        int i;
        
        for (i = 0; i < lotteryNumbers.length; i++) {
        
             numbers = rand.nextInt(60) + 1;
        
            duplicates = checkDuplicates(lotteryNumbers, numbers);
        
             if (!duplicates) {
        
                lotteryNumbers[i] = numbers; }
        
             else { 
                 
                i--;    
        }
        
     }
        
 }
    public void getUserPicks () {                                   //The getUserPicks() method asks the user to select and input numbers between the ranges 1 to 60.
        Random rand = new Random();                                 //Using for loops, method will continue to run until user has inputted six unique numbers.    
        boolean duplicates;                                         //Method will also check for duplicates and out of range numbers and will then inform the user
        int numbers;                                                //to pick a different number that meets the set criteria. 
        int a;
        int b;
        
        System.out.println("Here are today's lotto numbers: ");     //Special cheat that allows user to see winning numbers (generated by the constructor) before loop begins to run.
        System.out.println("");
        
        for (a = 0; a < lotteryNumbers.length; a++) {
        
            if (a == lotteryNumbers.length) {
            
                System.out.println(lotteryNumbers[a]);
            
            }
            
            else {
            
                System.out.println(lotteryNumbers[a] + " ");
            
            }
        
        }
       
        System.out.println("");
        System.out.println("Please enter six different numbers between 1 and 60.");
        
        for (b = 0; b < userLotteryPicks.length; b++) {
        
            System.out.println("");
            
            numbers = key.nextInt();
            
            duplicates = checkDuplicates(userLotteryPicks, numbers);
            
            if (!duplicates && numbers > 0 && numbers < 61) {
            
                userLotteryPicks[b] = numbers; }
            
            else {
                System.out.println("");
                System.out.println("Please enter a different lotto number.");
                
                b--;
            
            }
            
         }
        
        System.out.println("");
        System.out.println("Here are your chosen lotto numbers: " + userLotteryPicks[0] + ", " + userLotteryPicks[1] + ", " 
            + userLotteryPicks[2] + ", " + userLotteryPicks[3] + ", " + userLotteryPicks[4] + ", and " + userLotteryPicks[5] + ".");
        System.out.println("");
     } 
    
    public int checkLotteryMatch() {                                     // The checkLotteryMatch() method uses nested loops to compare both
        int anyMatch;                                                    // the user's input and the generated lottery numbers to see if there
        int c;                                                           // are any number matches.
        int d;

        anyMatch = 0;
        
        for (c = 0; c < userLotteryPicks.length; c++) {
        
            for (d = 0; d < lotteryNumbers.length; d++) {
            
                if (userLotteryPicks[c] == lotteryNumbers[d]) {
            
                    anyMatch++;
                
                }
            
            }
        
        }

        return anyMatch;
}
    public static boolean checkDuplicates( int[] array, int numbers) {  //The checkDuplicates() method checks for duplicates and it is called
        int f;                                                          //within the lotto constructor and getUserPicks() method.
        
        for (f = 0; f < array.length; f++) {
        
            if (numbers == array[f]) {
            
                return true;
                
            }
        
        }
    
        return false;
    }   
 }