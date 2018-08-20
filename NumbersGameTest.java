
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersgame;

import java.util.Scanner;


public class NumbersGameTest {


    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    NumbersGame n = new NumbersGame();
    
    String pType;
    int winnings;
     
    System.out.println("Which bet will you use? Enter S for Straight bet or B for box bet");
    pType = input.next();
    if(pType.equals("S"))
        n.setBetType("Straight");
    
    else if (pType.equals("B"))
        n.setBetType("Box");
 
    System.out.println("How much are you putting in?");
    n.setBetAmount(input.nextInt());
    System.out.println("Please input the number");
    n.setPlayerNumber(input.nextInt());
    System.out.println("Now choose the winning numbers");
    n.setWinningNumber(input.nextInt());
    
    System.out.println("Generating winnigns..." + pType);
    
    winnings = n.getWinnings();
    if(winnings > 0)
        System.out.println("Congratulations! You've won $" + n.getWinnings() + "!");
    else
        System.out.println("Sorry you didn't win anything.");
    
    System.out.println(n.toString());

    }
}
