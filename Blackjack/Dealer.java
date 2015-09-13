/**
 * @(#)Dealer.java
 *
 *
 * @author 
 * @version 1.00 2015/5/28
 */

import java.util.*;

public class Dealer {
	
	private ArrayList<Card> dealerHand;

    public Dealer() {
    	
    	dealerHand = new ArrayList<Card>();
    }
    
    public ArrayList<Card> getDealerHand(){
    	
    	return dealerHand;
    }
    
    public void addDealerHand(Card c){
    	
    	dealerHand.add(c);
    }
    
    public void removeAllDealerHand(){
    	
    	for(int i = dealerHand.size()-1; i >= 0; i--){
    		dealerHand.remove(i);
    	}
    }
    
    public int getDealerHandValue(){
    	
    	int valueTotal = 0;
    	for(int i =0; i < dealerHand.size(); i++)
    		valueTotal+= dealerHand.get(i).getValue();
    		
    	return valueTotal;
    }
    
    public boolean check21(){
    	
    	return(getDealerHandValue() == 21);
    }
    
    public boolean checkBust(){
    	
    	return(getDealerHandValue() > 21);
    }
    
    public void changeAce(){
    	
    	for(int i =0; i<dealerHand.size(); i++){
    		
    		if(checkBust() && dealerHand.get(i).getValue() == 11)
    			dealerHand.get(i).setValue(1);
    	}
    }
}