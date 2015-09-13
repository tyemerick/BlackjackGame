/**
 * @(#)GUI.java
 *
 *
 * @author 
 * @version 1.00 2015/5/30
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BlackJackGUI{
	
	private JLabel playerCard1, playerCard2, playerCard3, playerCard4, playerCard5, dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5, 
				   playerHandTitle, dealerHandTitle, playerHandValue, dealerHandValue, playerWinMsg, dealerWinMsg, pushMsg, playerWinValue, dealerWinValue, blackJackTitle;
	private int count, dealerCount, playerWinCount, dealerWinCount;
	private ImageIcon blackJack;
	private JFrame frame, framePlayerWin, frameDealerWin, framePush;
	private JPanel contentPane, contentPanePlayerWin, contentPaneDealerWin, contentPanePush;
	private JButton hitButton, stayButton, dealButton, playerWinYesButton, playerWinNoButton, dealerWinYesButton, dealerWinNoButton, pushYesButton, pushNoButton;
	private Deck deck;
	private Player player;
	private Dealer dealer;
	
	
	public BlackJackGUI(){
		
		// Image for the Black Jack Title
		blackJack = new ImageIcon("C:\\Users\\Tyler\\Desktop\\Blackjack\\Cards\\BlackJack.GIF");
		
		// initialiazes values to control program and compose of other classes
		count=1;
		dealerCount = 1;
		player = new Player();
		dealer = new Dealer();
		deck = new Deck();
		
		// creates the frame for which to put a contentPane on
		frame = new JFrame("BlackJack");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //create the playerhand card position
	    playerCard1 = new JLabel("");
	    playerCard2 = new JLabel("");
	    playerCard3 = new JLabel("");
	    playerCard4 = new JLabel("");
	    playerCard5 = new JLabel("");
	    dealerCard1 = new JLabel("");
	    dealerCard2 = new JLabel("");
	    dealerCard3 = new JLabel("");
	    dealerCard4 = new JLabel("");
	    dealerCard5 = new JLabel("");
	   
	    // creates a content pane to place buttons and labels on; gets displayed on frame
	    contentPane = new JPanel();
	    contentPane.setOpaque(true);
	 	contentPane.setLayout(null);
	}
	
	// sets card icon to null
	public void eraseCards(){
		
		playerCard1.setIcon(null);
	    playerCard2.setIcon(null);
	    playerCard3.setIcon(null);
	    playerCard4.setIcon(null);
	    playerCard5.setIcon(null);
	    dealerCard1.setIcon(null);
	    dealerCard2.setIcon(null);
	    dealerCard3.setIcon(null);
	    dealerCard4.setIcon(null);
	    dealerCard5.setIcon(null);
	}
	
	// runs the Black Jack Game 	
	public void playBlackJack(){
	 	deck.createNewDeck();
	 	eraseCards();
	 	
	 
	 	// draws the deal button
	 	dealButton = new JButton("Deal Cards");
	    dealButton.setSize(120,45);
	    dealButton.setLocation(390,140);
	    dealButton.addActionListener (new ActionListener()
	    {
	    	// preforms respective action if the dealButton is toggled
	    	public void actionPerformed(ActionEvent e){
    		if(e.getSource() == dealButton){
    			
    			if(count <= 2){
    				// takes one card away from the deck at random.
    		  		// deal's one card to the player ArrayList playerHand and displays its respective image
	          		player.addPlayerHand(deck.dealOneCard());
	         		playerCard1.setIcon(player.getPlayerHand().get(0).getImage());
					playerCard1.setLocation(100,100);
	            	playerCard1.setSize(73,97);	
	            	count++;	 
	          	
	          		// takes one card away from the deck at random.
	          		// deal's one card to the player ArrayList playerHand and displays its respective image
			  		player.addPlayerHand(deck.dealOneCard());
					playerCard2.setIcon(player.getPlayerHand().get(1).getImage());
	            	playerCard2.setLocation(233,100);
	            	playerCard2.setSize(73,97);
	            	count++;
	            	
	            	// takes one card away from the deck at random.
	            	// deal's one card to the player ArrayList playerHand and displays its respective image
	            	dealer.addDealerHand(deck.dealOneCard());
	            	dealerCard1.setIcon(dealer.getDealerHand().get(0).getImage());
	            	dealerCard1.setLocation(594,100);
	            	dealerCard1.setSize(73,97);
	            	
	            	dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
	            	
	            	// takes one card away from the deck at random.
	            	// deal's one card to the player ArrayList playerHand and displays an upside down card
	            	dealer.addDealerHand(deck.dealOneCard());
	            	dealerCard2.setIcon(deck.getBlankCard());
	            	dealerCard2.setLocation(727,100);
	            	dealerCard2.setSize(73,97);
	            	
	            	player.changeAce();
	            	playerHandValue.setText("Player's Total: " + player.getPlayerHandValue());
	            	if(player.check21()){
		            	count = 10;
		            	displayPlayerWin();
		            }
	            	
	            }	
	            	
	            	
	        }
		}
    	});
	    
	    //draws the hit button
	    hitButton = new JButton("Hit");
	    hitButton.setSize(120,45);
	    hitButton.setLocation(390,200);
	    hitButton.addActionListener (new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e){
	    		if(e.getSource() == hitButton){   
	    			    		
	    		        
	    			    			 if (count == 5)
	    		    {
	    			// deals the 5th card to the player after hit is clicked	
		            player.addPlayerHand(deck.dealOneCard());
		            playerCard5.setIcon(player.getPlayerHand().get(4).getImage());
		            playerCard5.setLocation(167,380);
		            playerCard5.setSize(73,97);
		            count++;
		            
		            player.changeAce();
		            playerHandValue.setText("Player's Total: " + player.getPlayerHandValue());
		            if(player.check21()){
		            	count = 10;
		            	dealerProcess();
		            }
		            if(player.checkBust()){
		            	count = 10;
		            	displayDealerWin();
		            }
		            
	    		    }       
	    			                 if (count == 4)
	    		    {
	    			// deals the 4th card to the player after hit is clicked
		            player.addPlayerHand(deck.dealOneCard());
		            playerCard4.setIcon(player.getPlayerHand().get(3).getImage());
		            playerCard4.setLocation(233,240);
		            playerCard4.setSize(73,97);
		            count++;
		            
		            player.changeAce();
		            playerHandValue.setText("Player's Total: " + player.getPlayerHandValue());
		            if(player.check21()){
		            	count = 10;
		            	dealerProcess();
		            }
		            if(player.checkBust()){
		            	count = 10;
		            	displayDealerWin();
		            }
	    		    }		           
	    			    			if (count == 3)
	    		    {
	    		    //position the card3
		            player.addPlayerHand(deck.dealOneCard());
		            playerCard3.setIcon(player.getPlayerHand().get(2).getImage());
		            playerCard3.setLocation(100,240);
		            playerCard3.setSize(73,97);
		            count++;
		            
		            player.changeAce();
		            playerHandValue.setText("Player's Total: " + player.getPlayerHandValue());
		            if(player.check21()){
		            	count = 10;
		            	dealerProcess();
		            }
		            if(player.checkBust()){
		            	count = 10;
		            	displayDealerWin();
		            }
	    		    }
	    		    
	    		    
	    			    				  
	    		}
		}
    	});
         
        // draws the stay botton
        stayButton = new JButton("Stay");
	    stayButton.setSize(120,45);
	    stayButton.setLocation(390,260);
	    stayButton.addActionListener (new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
    			if(e.getSource() == stayButton && count<10 && count != 1)
    				dealerProcess();
	    	}	
    		});
    	
    	// displays the BlackJack Title
    	blackJackTitle = new JLabel(blackJack);
    	blackJackTitle.setLocation(300,350);
    	blackJackTitle.setSize(300,170);
    	
    	// draws the title for Player's Hand
    	playerHandTitle = new JLabel("Player's Hand",JLabel.CENTER);
    	playerHandTitle.setFont(new Font("Serif",Font.PLAIN,30));
    	playerHandTitle.setLocation(118,25);
    	playerHandTitle.setSize(170,50);
    	
    	// draws the title for Dealer's Hand
    	dealerHandTitle = new JLabel("Dealer's Hand",JLabel.CENTER);
    	dealerHandTitle.setFont(new Font("Serif",Font.PLAIN,30));
    	dealerHandTitle.setLocation(612,25);
    	dealerHandTitle.setSize(170,50);
    	
    	// draws the total value of the player's hand
    	playerHandValue = new JLabel("Player's Total: " + player.getPlayerHandValue(),JLabel.CENTER);
    	playerHandValue.setFont(new Font("Serif",Font.PLAIN,30));
    	playerHandValue.setLocation(87,500);
    	playerHandValue.setSize(230,50);
    	
    	// draws the total wins for player
    	playerWinValue = new JLabel("Wins: " + playerWinCount,JLabel.CENTER);
    	playerWinValue.setFont(new Font("Serif",Font.PLAIN,30));
    	playerWinValue.setLocation(87,550);
    	playerWinValue.setSize(230,50);
    	
    	// draws the total value of the dealer's hand
    	dealerHandValue = new JLabel("Dealer's Total: " + dealer.getDealerHandValue(),JLabel.CENTER);
    	dealerHandValue.setFont(new Font("Serif",Font.PLAIN,30));
    	dealerHandValue.setLocation(584,500);
    	dealerHandValue.setSize(230,50);
    	
    	// draws the total wins for dealer
    	dealerWinValue = new JLabel("Wins: " + dealerWinCount,JLabel.CENTER);
    	dealerWinValue.setFont(new Font("Serif",Font.PLAIN,30));
    	dealerWinValue.setLocation(592,550);
    	dealerWinValue.setSize(230,50);
    	
    	
    	// add all of the buttons and labels to the contentPane
    	contentPane.add(dealButton);
    	contentPane.add(stayButton); 
    	contentPane.add(hitButton);
    	contentPane.add(playerCard1);
    	contentPane.add(playerCard2);
    	contentPane.add(playerCard3);
    	contentPane.add(playerCard4);
    	contentPane.add(playerCard5);
    	contentPane.add(dealerCard1);
    	contentPane.add(dealerCard2);
    	contentPane.add(dealerCard3);
    	contentPane.add(dealerCard4);
    	contentPane.add(dealerCard5);
    	contentPane.add(playerHandTitle);
    	contentPane.add(dealerHandTitle);
    	contentPane.add(playerHandValue);
    	contentPane.add(dealerHandValue);
    	contentPane.add(playerWinValue);
    	contentPane.add(dealerWinValue);
    	contentPane.add(blackJackTitle);
    	
    	frame.setContentPane(contentPane); 
    	frame.setSize(922,650);
    	frame.setLocation(150,150);	 
    	frame.setVisible(true);
		
	}
	
	public void dealerProcess(){
		
		count = 10;
		dealerCard2.setIcon(dealer.getDealerHand().get(1).getImage());
		dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
		
		while(dealer.getDealerHandValue() <= 16 || count == 13){
			
			if(count == 10){
               dealer.addDealerHand(deck.dealOneCard());
               dealerCard3.setIcon(dealer.getDealerHand().get(2).getImage());
               dealerCard3.setLocation(594,240);
	           dealerCard3.setSize(73,97);
	           dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
	           count++;
               
			} 
			
			else if(count == 11){
               dealer.addDealerHand(deck.dealOneCard());
               dealerCard4.setIcon(dealer.getDealerHand().get(3).getImage());
               dealerCard4.setLocation(594,240);
	           dealerCard4.setSize(73,97);
	           dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
	           count++;
               
			} 
				
			else if(count == 12){
               dealer.addDealerHand(deck.dealOneCard());
               dealerCard4.setIcon(dealer.getDealerHand().get(3).getImage());
               dealerCard4.setLocation(594,240);
	           dealerCard4.setSize(73,97);
	           dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
	           count++;
               
			}
		}	
     
     dealer.changeAce();         
 	 if(player.getPlayerHandValue() == dealer.getDealerHandValue() && dealer.checkBust() == false)
 	 	displayPush();
 	 else if(player.getPlayerHandValue() > dealer.getDealerHandValue() || dealer.checkBust() == true)
        displayPlayerWin();
     else
     	displayDealerWin();
 
	}
	
	public void displayPlayerWin(){
		
		count = 10;
		playerWinCount++;
		playerWinValue.setText("Wins: " + playerWinCount);
		
		framePlayerWin = new JFrame("Player Wins!!!");
		
	    framePlayerWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    framePlayerWin.setVisible(true);
	    contentPanePlayerWin = new JPanel();
	    contentPanePlayerWin.setOpaque(true);
	 	contentPanePlayerWin.setLayout(null);
	 	
	 	playerWinMsg = new JLabel("Player Wins! Play again?",JLabel.CENTER);
    	playerWinMsg.setFont(new Font("Serif",Font.PLAIN,20));
    	playerWinMsg.setLocation(40,0);
    	playerWinMsg.setSize(200,75);
    	
    	playerWinYesButton = new JButton("YES");
    	playerWinYesButton.setSize(120,45);
	    playerWinYesButton.setLocation(80,100);
	    playerWinYesButton.addActionListener(new ActionListener(){
	    	
	    	public void actionPerformed(ActionEvent e){
    			if(e.getSource() == playerWinYesButton){
    				
    				framePlayerWin.setVisible(false);
    				eraseCards();
    				deck.createNewDeck();
    				player.removeAllPlayerHand();
    				dealer.removeAllDealerHand();
    				playerHandValue.setText("Player's Total: " + player.getPlayerHandValue());
    				dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
    				count = 1;
    				
    				
    				
    			}
	    	}
	    });
    	
    	playerWinNoButton = new JButton("NO");
    	playerWinNoButton.setSize(120,45);
	    playerWinNoButton.setLocation(80,150);
	    playerWinNoButton.addActionListener(new ActionListener(){
	    	
	    	public void actionPerformed(ActionEvent e){
    			if(e.getSource() == playerWinNoButton){
    			
    				framePlayerWin.setVisible(false);
    				frame.setVisible(false);
    				
    			}
	    	}
	    });
	    
	    contentPanePlayerWin.add(playerWinYesButton);
	    contentPanePlayerWin.add(playerWinNoButton);
	    contentPanePlayerWin.add(playerWinMsg);
	    framePlayerWin.setContentPane(contentPanePlayerWin); 
    	framePlayerWin.setSize(300,300);
    	framePlayerWin.setLocation(1100,150);	 
    	
		
	}
	
	public void displayDealerWin(){
		
		count = 10;
		dealerWinCount++;
		dealerWinValue.setText("Wins: " + dealerWinCount);
		
		frameDealerWin = new JFrame("Player Wins!!!");
		frameDealerWin.setVisible(true);
	    frameDealerWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    contentPaneDealerWin = new JPanel();
	    contentPaneDealerWin.setOpaque(true);
	 	contentPaneDealerWin.setLayout(null);
	 	
	 	dealerWinMsg = new JLabel("Dealer Wins. Play again?",JLabel.CENTER);
    	dealerWinMsg.setFont(new Font("Serif",Font.PLAIN,20));
    	dealerWinMsg.setLocation(38,0);
    	dealerWinMsg.setSize(210,75);
    	
    	dealerWinYesButton = new JButton("YES");
    	dealerWinYesButton.setSize(120,45);
	    dealerWinYesButton.setLocation(80,100);
	    dealerWinYesButton.addActionListener(new ActionListener(){
	    	
	    	public void actionPerformed(ActionEvent e){
    			if(e.getSource() == dealerWinYesButton){
    			
    				frameDealerWin.setVisible(false);
    				eraseCards();
    				deck.createNewDeck();
    				player.removeAllPlayerHand();
    				dealer.removeAllDealerHand();
    				playerHandValue.setText("Player's Total: " + player.getPlayerHandValue());
    				dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
    				count = 1;
    				
    				
    			}
	    	}
	    });
    	
    	dealerWinNoButton = new JButton("NO");
    	dealerWinNoButton.setSize(120,45);
	    dealerWinNoButton.setLocation(80,150);
	    dealerWinNoButton.addActionListener(new ActionListener(){
	    	
	    	public void actionPerformed(ActionEvent e){
    			if(e.getSource() == dealerWinNoButton){
    			
    				
    				frameDealerWin.setVisible(false);
    				frame.setVisible(false);
    				
    			}
	    	}
	    });
	    
	    contentPaneDealerWin.add(dealerWinYesButton);
	    contentPaneDealerWin.add(dealerWinNoButton);
	    contentPaneDealerWin.add(dealerWinMsg);
	    frameDealerWin.setContentPane(contentPaneDealerWin); 
    	frameDealerWin.setSize(300,300);
    	frameDealerWin.setLocation(1100,150);	 
    	
		
	}
	
	public void displayPush(){
		
		count = 10;
		
		framePush = new JFrame("Push");
		framePush.setVisible(true);
	    framePush.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    contentPanePush = new JPanel();
	    contentPanePush.setOpaque(true);
	 	contentPanePush.setLayout(null);
	 	
	 	pushMsg = new JLabel("Push. Play again?",JLabel.CENTER);
    	pushMsg.setFont(new Font("Serif",Font.PLAIN,20));
    	pushMsg.setLocation(38,0);
    	pushMsg.setSize(210,75);
    	
    	pushYesButton = new JButton("YES");
    	pushYesButton.setSize(120,45);
	    pushYesButton.setLocation(80,100);
	    pushYesButton.addActionListener(new ActionListener(){
	    	
	    	public void actionPerformed(ActionEvent e){
    			if(e.getSource() == pushYesButton){
    			
    				framePush.setVisible(false);
    				eraseCards();
    				deck.createNewDeck();
    				player.removeAllPlayerHand();
    				dealer.removeAllDealerHand();
    				playerHandValue.setText("Player's Total: " + player.getPlayerHandValue());
    				dealerHandValue.setText("Dealer's Total: " + dealer.getDealerHandValue());
    				count = 1;
    				
    				
    			}
	    	}
	    });
    	
    	pushNoButton = new JButton("NO");
    	pushNoButton.setSize(120,45);
	    pushNoButton.setLocation(80,150);
	    pushNoButton.addActionListener(new ActionListener(){
	    	
	    	public void actionPerformed(ActionEvent e){
    			if(e.getSource() == pushNoButton){
    			
    				
    				framePush.setVisible(false);
    				frame.setVisible(false);
    				
    			}
	    	}
	    });
	    
	    contentPanePush.add(pushYesButton);
	    contentPanePush.add(pushNoButton);
	    contentPanePush.add(pushMsg);
	    framePush.setContentPane(contentPanePush); 
    	framePush.setSize(300,300);
    	framePush.setLocation(1100,150);	 
    	
		
	}
	
	public static void main(String [] args){    
			
	  		BlackJackGUI bj = new BlackJackGUI();
	  		bj.playBlackJack();
	 
	}
}
	
	
	
	
	
	
	
	
	
