/**
 * @(#)Card.java
 *
 *
 * @author 
 * @version 1.00 2015/4/7
 */

import java.lang.Object;
import javax.swing.ImageIcon;

class Card {

	private int value, xPos;
	private String face, suit;
	private ImageIcon image;

    public Card(int v, String f, String s, ImageIcon i) {
    	value = v;
    	face = f;
    	suit = s;
    	image = i;
    }
    
    // returns a Card's Value
    public int getValue(){
    	
    	return value;
    }
    
    // returns a Card's Face
    public String getFace(){
    	
    	return face;
    }
    
    // returns a Card's Suit
    public String getSuit(){
    	
    	return suit;
    }
    
    // returns a Card's Image
    public ImageIcon getImage(){
    	
    	return image;
    }
    
    public void setValue(int v){
    	
    	value = v;
    }
    
    
    
}