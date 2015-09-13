/**
 * @(#)BlackJack.java
 *
 *
 * @author 
 * @version 1.00 2015/4/7
 */
 

import java.util.*;
import java.lang.Object;
import javax.swing.*;

public class Deck {
	
	private	Card clubA, club2, club3, club4, club5, club6, club7, club8, club9, club10, clubJ, clubQ, clubK,
		 		 diamondA, diamond2, diamond3, diamond4, diamond5, diamond6, diamond7, diamond8, diamond9, diamond10, diamondJ, diamondQ, diamondK,
		 		 heartA, heart2, heart3, heart4, heart5, heart6, heart7, heart8, heart9, heart10, heartJ, heartQ, heartK,
		 		 spadeA, spade2, spade3, spade4, spade5, spade6, spade7, spade8, spade9, spade10, spadeJ, spadeQ, spadeK;
//	private Card tempCard;
		 
    private ImageIcon selectedImage;
    private ArrayList<Card> deck; 
    private int numCardsInDeck;
	
	private ImageIcon blankCard = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\back1.GIF");
	private ImageIcon grey = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\Grey.GIF"); 
		     
    public Deck(){
    	
    	numCardsInDeck = 52;
    	deck = new ArrayList<Card>();
    	
        
        setCardValues();
        deck.add(spadeA);
        createNewDeck();
    }
    
    public void createNewDeck(){
    	
    	numCardsInDeck = 52;
	
		removeAllDeck();
		deck.add(clubA);
		deck.add(club2);
		deck.add(club3);
		deck.add(club4);
		deck.add(club5);
		deck.add(club6);
		deck.add(club7);
		deck.add(club8);
		deck.add(club9);
		deck.add(club10);
		deck.add(clubJ);
		deck.add(clubQ);
		deck.add(clubK);
		deck.add(spadeA);
		deck.add(spade2);
		deck.add(spade3);
		deck.add(spade4);
		deck.add(spade5);
		deck.add(spade6);
		deck.add(spade7);
		deck.add(spade8);
		deck.add(spade9);
		deck.add(spade10);
		deck.add(spadeJ);
		deck.add(spadeQ);
		deck.add(spadeK);
		deck.add(heartA);
		deck.add(heart2);
		deck.add(heart3);
		deck.add(heart4);
		deck.add(heart5);
		deck.add(heart6);
		deck.add(heart7);
		deck.add(heart8);
		deck.add(heart9);
		deck.add(heart10);
		deck.add(heartJ);
		deck.add(heartQ);
		deck.add(heartK);
		deck.add(diamondA);
		deck.add(diamond2);
		deck.add(diamond3);
		deck.add(diamond4);
		deck.add(diamond5);
		deck.add(diamond6);
		deck.add(diamond7);
		deck.add(diamond8);
		deck.add(diamond9);
		deck.add(diamond10);
		deck.add(diamondJ);
		deck.add(diamondQ);
		deck.add(diamondK);
		        
		    	
    } 
    
    public void setCardValues(){
    	
    	ImageIcon clubImageA = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\aceclubs.GIF");
    	ImageIcon clubImage2 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\2clubs.GIF");
    	ImageIcon clubImage3 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\3clubs.GIF");
    	ImageIcon clubImage4 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\4clubs.GIF");
    	ImageIcon clubImage5 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\5clubs.GIF");
    	ImageIcon clubImage6 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\6clubs.GIF");
    	ImageIcon clubImage7 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\7clubs.GIF");
    	ImageIcon clubImage8 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\8clubs.GIF");
    	ImageIcon clubImage9 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\9clubs.GIF");
    	ImageIcon clubImage10 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\10clubs.GIF");
    	ImageIcon clubImageJ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\jackclubs.GIF");
    	ImageIcon clubImageQ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\queenclubs.GIF");
    	ImageIcon clubImageK = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\kingclubs.GIF");
    	
    	ImageIcon diamondImageA = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\acediamonds.GIF");
    	ImageIcon diamondImage2 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\2diamonds.GIF");
    	ImageIcon diamondImage3 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\3diamonds.GIF");
    	ImageIcon diamondImage4 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\4diamonds.GIF");
    	ImageIcon diamondImage5 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\5diamonds.GIF");
    	ImageIcon diamondImage6 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\6diamonds.GIF");
    	ImageIcon diamondImage7 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\7diamonds.GIF");
    	ImageIcon diamondImage8 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\8diamonds.GIF");
    	ImageIcon diamondImage9 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\9diamonds.GIF");
    	ImageIcon diamondImage10 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\10diamonds.GIF");
    	ImageIcon diamondImageJ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\jackdiamonds.GIF");
    	ImageIcon diamondImageQ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\queendiamonds.GIF");
    	ImageIcon diamondImageK = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\kingdiamonds.GIF");
    	
    	ImageIcon heartImageA = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\acehearts.GIF");
    	ImageIcon heartImage2 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\2hearts.GIF");
    	ImageIcon heartImage3 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\3hearts.GIF");
    	ImageIcon heartImage4 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\4hearts.GIF");
    	ImageIcon heartImage5 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\5hearts.GIF");
    	ImageIcon heartImage6 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\6hearts.GIF");
    	ImageIcon heartImage7 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\7hearts.GIF");
    	ImageIcon heartImage8 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\8hearts.GIF");
    	ImageIcon heartImage9 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\9hearts.GIF");
    	ImageIcon heartImage10 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\10hearts.GIF");
    	ImageIcon heartImageJ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\jackhearts.GIF");
    	ImageIcon heartImageQ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\queenhearts.GIF");
    	ImageIcon heartImageK = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\kinghearts.GIF");
    	
    	ImageIcon spadeImageA = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\acespades.GIF");
    	ImageIcon spadeImage2 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\2spades.GIF");
    	ImageIcon spadeImage3 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\3spades.GIF");
    	ImageIcon spadeImage4 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\4spades.GIF");
    	ImageIcon spadeImage5 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\5spades.GIF");
    	ImageIcon spadeImage6 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\6spades.GIF");
    	ImageIcon spadeImage7 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\7spades.GIF");
    	ImageIcon spadeImage8 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\8spades.GIF");
    	ImageIcon spadeImage9 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\9spades.GIF");
    	ImageIcon spadeImage10 = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\10spades.GIF");
    	ImageIcon spadeImageJ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\jackspades.GIF");
    	ImageIcon spadeImageQ = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\queenspades.GIF");
    	ImageIcon spadeImageK = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\kingspades.GIF");
    	
    	
	
		clubA = new Card(11,"A","Club",clubImageA);
        club2 = new Card(2,"2","Club",clubImage2);
        club3 = new Card(3,"3","Club",clubImage3);
        club4 = new Card(4,"4","Club",clubImage4);
        club5 = new Card(5,"5","Club",clubImage5);
        club6 = new Card(6,"6","Club",clubImage6);
        club7 = new Card(7,"7","Club",clubImage7);
        club8 = new Card(8,"8","Club",clubImage8);
        club9 = new Card(9,"9","Club",clubImage9);
        club10 = new Card(10,"10","Club",clubImage10);
        clubJ = new Card(10,"J","Club",clubImageJ);
        clubQ = new Card(10,"Q","Club",clubImageQ);
        clubK = new Card(10,"K","Club",clubImageK);
     
        diamondA = new Card(11,"A","Diamond",diamondImageA);
        diamond2 = new Card(2,"2","Diamond",diamondImage2);
        diamond3 = new Card(3,"3","Diamond",diamondImage3);
        diamond4 = new Card(4,"4","Diamond",diamondImage4);
        diamond5 = new Card(5,"5","Diamond",diamondImage5);
        diamond6 = new Card(6,"6","Diamond",diamondImage6);
        diamond7 = new Card(7,"7","Diamond",diamondImage7);
        diamond8 = new Card(8,"8","Diamond",diamondImage8);
        diamond9 = new Card(9,"9","Diamond",diamondImage9);
        diamond10 = new Card(10,"10","Diamond",diamondImage10);
        diamondJ = new Card(10,"J","Diamond",diamondImageJ);
        diamondQ = new Card(10,"Q","Diamond",diamondImageQ);
        diamondK = new Card(10,"K","Diamond",diamondImageK);
    
        heartA = new Card(11,"A","Heart",heartImageA);
        heart2 = new Card(2,"2","Heart",heartImage2);
        heart3 = new Card(3,"3","Heart",heartImage3);
        heart4 = new Card(4,"4","Heart",heartImage4);
        heart5 = new Card(5,"5","Heart",heartImage5);
        heart6 = new Card(6,"6","Heart",heartImage6);
        heart7 = new Card(7,"7","Heart",heartImage7);
        heart8 = new Card(8,"8","Heart",heartImage8);
        heart9 = new Card(9,"9","Heart",heartImage9);
        heart10 = new Card(10,"10","Heart",heartImage10);
        heartJ = new Card(10,"J","Heart",heartImageJ);
        heartQ = new Card(10,"Q","Heart",heartImageQ);
        heartK = new Card(10,"K","Heart",heartImageK);
        
        spadeA = new Card(11,"A","Spade",spadeImageA);
        spade2 = new Card(2,"2","Spade",spadeImage2);
        spade3 = new Card(3,"3","Spade",spadeImage3);
        spade4 = new Card(4,"4","Spade",spadeImage4);
        spade5 = new Card(5,"5","Spade",spadeImage5);
        spade6 = new Card(6,"6","Spade",spadeImage6);
        spade7 = new Card(7,"7","Spade",spadeImage7);
        spade8 = new Card(8,"8","Spade",spadeImage8);
        spade9 = new Card(9,"9","Spade",spadeImage9);
        spade10 = new Card(10,"10","Spade",spadeImage10);
        spadeJ = new Card(10,"J","Spade",spadeImageJ);
        spadeQ = new Card(10,"Q","Spade",spadeImageQ);
        spadeK = new Card(10,"K","Spade",spadeImageK);
    }
    
    public ArrayList<Card> getDeck()
    {
    	return deck;
    }
    
    public void removeDeck(int r){
    	
    	deck.remove(r);
    }	
    
    public void removeAllDeck(){
    	
    	for(int i = deck.size()-1; i >= 0; i--){
    		
    		deck.remove(i);
    	}
    }
    
    public Card dealOneCard(){
    	
    	
		int cardSelector = (int)(Math.random()*numCardsInDeck);
		
		int temp1 = cardSelector;
		
	   	//player.addPlayerHand(deck.get(temp1).getValue(), deck.get(temp1).getFace(), deck.get(temp1).getSuit(), deck.get(temp1).getImage());
	   	Card tempCard = new Card(deck.get(temp1).getValue(), deck.get(temp1).getFace(), deck.get(temp1).getSuit(), deck.get(temp1).getImage());
	   	selectedImage = deck.get(temp1).getImage();
		deck.remove(temp1);
		numCardsInDeck--;
		
		return tempCard;
	}
	
	public ImageIcon getImage(){
		
		return selectedImage;
	}
	
	public ImageIcon getBlankCard(){
		
		return blankCard;
	}
	
	public ImageIcon getGrey(){
		
		return grey;
	}
	
  }

