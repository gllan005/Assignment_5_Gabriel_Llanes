

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
public class NumbersGame {
    
    private String betType;
    private int betAmount;
    private int playerNumber;
    private int winningNumber;
    
    public NumbersGame(String betType, int betAmount, 
     int playerNumber, int winningNumber){
        
        this.betType = betType;
        this.betAmount = betAmount;
        this.playerNumber = playerNumber;
        this.winningNumber = winningNumber;
    }
    
    public String getBetType(){
        return betType;
    }
    
    public void setBetType(String betType){
        this.betType = betType;
    }
    
    public int getPlayerNumber(){
        return playerNumber;
    }
   
    public void setPlayerNumber(int playerNumber){
    
    }
    
    public int getWinningNumber(){
        winningNumber =  sumDigits(winningNumber);
    return winningNumber;
    }
    
    public void setWinningNumber(int winningNumber){
    
    }
    
    public boolean getAmountWon(){
     return playerNumber == winningNumber;
    }
}
