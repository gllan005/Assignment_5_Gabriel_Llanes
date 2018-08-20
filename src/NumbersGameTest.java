
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *I affirm that this program is entirely my own work and 
 * none of it is the work of any other person.
 * @author Gabriel Llanes
 * Instructor: Caryl Rahn 
 * COP 2210 U02 Thursday 11:00 a.m. lab
 */
public class NumbersGameTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        //Get user inputs
   System.out.println("Which bet will you use?"
           + " Enter S for Straight bet or B for box bet");
   String betType = input.nextLine();
   
   System.out.println("How much are you putting in?");
   int betAmount = input.nextInt();

   System.out.println("Please input the number");
   int playerNumber = input.nextInt();

   System.out.println("Please input the winning number");
   int winningNumber = input.nextInt();
   
   //Declare new object for NumbersGame class
   NumbersGame obj = new NumbersGame(betType, betAmount,
    playerNumber, winningNumber);
   
   
    //decision making for straight or box bet
   if(betType == "S")
   {
       if(playerNumber == winningNumber){
           System.out.println("player wins $600 for each $1 wagered");
       }
       else{
           System.out.println("player loses");
       }
       
   }
   else
   {

    /**
     *
     * @param playerNumber
     * @return
     */
    

       if(betType == "B"){
           
           
           if(){
               System.out.println("player wins");             
           }
           else
           {
               System.out.println("player loses");
           }
       }
}
}
}


 
