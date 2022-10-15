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

/**
 *
 * @author 3156908
 */
public class Results {     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numbers play = new Numbers();
        
        play.getUserPicks();                    //Methods are called from the Lotto class to the Driver Class. 
        play.checkLotteryMatch();
                                                                                        // An if-statement is used to determine what prize the user will get
        if (play.checkLotteryMatch() == 3) {                                            // depending on the amount of numbers matched.
        
            System.out.println("You'll receive a free Lottery ticket as the prize!"); } //Output if the user selects 3 winning numbers.
        
        else if (play.checkLotteryMatch() == 4) { 
            
            System.out.println("You'll receive a $2000 prize!"); }                      //Output if the user selects 4 winning numbers.
        
        else if (play.checkLotteryMatch() == 5) {
             
             System.out.println("You'll receive a prize of $50,000!"); }                //Output if the user selects 5 winning numbers.
              
        else if (play.checkLotteryMatch() == 6) {
        
             System.out.println("You'll receive a grand prize of $1,000,000!"); }      //Output if the user selects 6 winning numbers.
        
        else {
        
             System.out.println("Sorry, no matches today. Try again!"); }             //Output if the user selects 0 winning numbers.
        
             System.out.println("");
    
           }
    
         }
