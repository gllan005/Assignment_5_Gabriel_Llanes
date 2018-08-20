/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersgame;

/**
 *
 * @author Alan
 */
public class NumbersGame {
    
    private String betType;
    private int betAmount;
    private int playerNumber;
    private int winningNumber;
    
    public NumbersGame(){
        this.betAmount = 0;
        this.betType = "";
        this.playerNumber = 0;
        this.winningNumber = 0;    
    }
    
    public String getBetType() {
        return betType;
    }

    public void setBetType(String betType) {
        this.betType = betType;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getWinningNumber() {
        return winningNumber;
    }

    public void setWinningNumber(int winningNumber) {
        this.winningNumber = winningNumber;
    }
    
    public int getWinnings(){
        int straightPayout = 600;
        int boxPayouta = 100;
        int boxPayoutb = 200;
        
        if(this.betType == "Straight"){
            if(this.playerNumber == this.winningNumber)
                return straightPayout*betAmount;
    }
        else if (this.betType == "Box") {
            int winNumA = this.winningNumber/100;
            int winNumB = (this.winningNumber%100)/10;
            int winNumC = this.winningNumber%10;
            
            int playNumA = this.playerNumber/100;
            int playNumB = (this.playerNumber%100)/10;
            int playNumC = this.playerNumber%10;
            



            int winMatchAdd = winNumA + winNumB + winNumC;
            int playMatchAdd = playNumA + playNumB + playNumC;
            int winMatchMult = winNumA * winNumB * winNumC;
            int playMatchMult = playNumA * playNumB * playNumC;
            
            if(winMatchAdd == playMatchAdd && winMatchMult == playMatchMult){
                if(winNumA == winNumC || winNumA == winNumB || winNumB == winNumC)
                    return boxPayoutb*betAmount;
                else return boxPayouta*betAmount;
            }
        }
        return 0;
    }
    
    public String toString(){
        return "Bet Type: " + betType + "\nBet Amount: " + betAmount +
                "\nPlayer Number: " + playerNumber + "\nWinning Number: " +
                winningNumber;
    }
    
}
