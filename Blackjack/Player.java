/**
 * @(#)Player.java
 *
 *
 * @author 
 * @version 1.00 2015/5/24
 */

import java.util.*;

public class Player {
	
	private double money, bet;
	private ArrayList<Card> playerHand;
	Card card;
	//private ArrayList<Integer> playerHandValue;
	
    public Player() {
    	
    	
    	playerHand = new ArrayList<Card>();
    	money = 1000.0;
    }
    // methods dealing with the players avaiable money
    public double getMoney(){
    	
    	return money;
    }
    
    public void gainMoney(double m){
    	
    	money+= m;
    }
    
    //methods dealing with the players placed bet
    public double getBet(){
    	
    	return bet;
    }
    
   /* public double placeBet(){
    	
    	bet = 0;
    	while(dealCards.inside(x,y)){
    		if(chip5.inside(x,y) && money >= 5)
    			bet+=5;
    		if(chip10.inside(x,y) && money >= 10)
    			bet+=10;
    		if(chip25.inside(x,y) && money >= 25)
    			bet+=25;
    		if(chip100.inside(x,y) && money >= 100)
    			bet+=100;
    			
    		money = money - bet;
    	}
    	
    		return bet;
    }
    
    public void doubleBet(){
    	
    	bet+= bet;
    	money-= bet/2;
    }*/
    
    // methods dealing with the players hand
    public ArrayList<Card> getPlayerHand(){
    	
    	return playerHand;
    }
    
    public Card getCard(int i){
    	
    	return playerHand.get(i);
    }
    
    public int getPlayerHandValue(){
    	
    	int valueTotal = 0;
    	for(int i =0; i < playerHand.size(); i++)
    		valueTotal+= playerHand.get(i).getValue();
    		
    	return valueTotal;
    }
    
    public void addPlayerHand(Card c){
    	
    	playerHand.add(c);
    }
    
    public void removeAllPlayerHand(){
    	
    	for(int i = playerHand.size()-1; i>= 0; i--){
    		
    		playerHand.remove(i);
    	}
    }
    
    public boolean check21(){
    	
    	return(getPlayerHandValue() == 21);
    }
    
    public boolean checkBust(){
    	
    	return(getPlayerHandValue() > 21);
    }
    
    public void changeAce(){
    	
    	for(int i =0; i<playerHand.size(); i++){
    		
    		if(checkBust() && playerHand.get(i).getValue() == 11)
    			playerHand.get(i).setValue(1);
    	}
    }
}