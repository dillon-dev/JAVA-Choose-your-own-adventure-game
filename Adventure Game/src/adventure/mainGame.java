package adventure;

import java.util.*;
import javax.swing.border.*;
import javax.swing.*;
import java.beans.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;

public class mainGame {
	
	//ASSETS AND GUI ITEMS
	JFrame GUI;
	static Container container;
	static JPanel titleScreenPanel; //PANELS ON TITLE SCREEN
	static JPanel startButtonPanel;
	JLabel titleScreenNameLabel; //GAME NAME ON TITLE SCREEN
	Font titleScreenNameLabelFont = new Font("Ariel", Font.PLAIN, 70);
	static Font textFont = new Font("Ariel", Font.PLAIN, 25);
	JButton startGameButton;
	
	//IN GAME UI
	static JPanel mainDialoguePanel, choiceButtonsPanel, playerUIPanel, playerInvPanel;//PANELS IN GAME
	static JTextArea mainDialogue;
	static JButton option1, option2, option3, option4;
	static JLabel armour, armourSlot, weapon, weaponSlot, gold, carriedGold, smallGoblinHead, adultGoblinHead, wolfHead, minotaurHead, serpentHead, amulet, inventory;
	
	
	//VARIABLES
	static String armourWorn, smallGoblinHeadString, adultGoblinHeadString, wolfHeadString, minotaurHeadString, serpentHeadString, amuletString;
	static int goldHeld;
	static String weaponHeld, position; //POSITION IS FOR SWITCH STATEMENTS IN CHOICEBUTTONS
	static boolean beggarAlive, wolfAlive, smallGoblinAlive, adultGoblinAlive, minotaurAlive, serpentAlive, forestGuardAlive, amuletOwned, guardAlive, talkedToGuards;
	//END OF ASSETS AND GUI ITEMS
	
	public static void main(String[] args) {
		
		new mainGame();

	}//end of main
	
	public mainGame() {
		
		////////////////CREATE THE GUI///////////////////
		GUI = new JFrame();
		GUI.setSize(1200,800);
		GUI.setResizable(false);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.getContentPane().setBackground(Color.black);
		GUI.setLayout(null);
		GUI.setVisible(true);
		container = GUI.getContentPane();
		/////////////////END OF GUI///////////////////
		
		//////////////TITLE SCREEN///////////////////
		
		//START OF titleScreenPanel
		titleScreenPanel = new JPanel();
		titleScreenPanel.setBounds(200 ,200, 750, 300);
								//x co-ord, y co-ord, width, height
		titleScreenPanel.setBackground(Color.black);//SET TO BLACK SO THAT PANEL IS INVISIBLE, ONLY SWITCH FOR TESTING PURPOSES
		//END OF titleScreenPanel
		
		//START OF startButtonPanel
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,400,540,100);
								//x co-ord, y co-ord, width, height
		startButtonPanel.setBackground(Color.black);//SET TO BLACK SO THAT PANEL IS INVISIBLE, ONLY SWITCH FOR TESTING PURPOSES
		//END OF startButtonPanel
		
		//START OF startGameButton
		startGameButton = new JButton("Begin Game");
		startGameButton.setBackground(Color.black);
		startGameButton.setForeground(Color.white);
		startButtonPanel.add(startGameButton);//BREAKS IF MOVED
		startGameButton.setFont(textFont);
		startGameButton.addActionListener(titleScreenButton.titleScreen);//CALLS titleScreen FROM titleScreenButton.java
		startGameButton.setFocusPainted(false);
		//END OF startGameButton
		
		//START OF titleScreenNameLabel DO NOT ADD TO CONTAINER!!!!!
		titleScreenNameLabel = new JLabel("Adventure Game");
		titleScreenNameLabel.setForeground(Color.white);
		titleScreenNameLabel.setFont(titleScreenNameLabelFont);
		titleScreenPanel.add(titleScreenNameLabel);
		//END OF titleScreenNameLabel
		
		//START OF CONTAINER ADDITIONS
		container.add(titleScreenPanel);
		container.add(startButtonPanel);	
		//END OF CONTAINER ADDITIONS
		
		//END OF TITLE SCREEN
		      
    }//end of mainGame
	
	public static void gamePlay() {
		
		titleScreenPanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		//START OF mainDialoguePanel
		mainDialoguePanel = new JPanel();
		mainDialoguePanel.setBounds(100,100,930,400);
		mainDialoguePanel.setBackground(Color.black);//SET TO BLACK SO THAT PANEL IS INVISIBLE, ONLY SWITCH FOR TESTING PURPOSES
		//END OF mainDialoguePanel
		
		//START OF mainDialogue
		mainDialogue = new JTextArea("placeholderplaceholderplaceholderplaceholderplaceholderplaceholder");
		mainDialogue.setBounds(100,100,930,400);
		mainDialogue.setBackground(Color.BLACK);
		mainDialogue.setForeground(Color.white);
		mainDialogue.setFont(textFont);
		mainDialogue.setLineWrap(true);//ALLOWS TEXT TO AUTOMATICALLY MOVE TO NEXT LINE
		mainDialoguePanel.add(mainDialogue);
		//END OF mainDialogue
		
		//START OF choiceButtonsPanel
		choiceButtonsPanel = new JPanel();
		choiceButtonsPanel.setBounds(100,500,930,150);
		choiceButtonsPanel.setBackground(Color.black);//SET TO BLACK SO THAT PANEL IS INVISIBLE, ONLY SWITCH FOR TESTING PURPOSES
		choiceButtonsPanel.setLayout(new GridLayout(4,1));
		//END OF choiceButtonsPanel
		
		//START OF CHOICE BUTTONS
		
		//button 1
		option1 = new JButton("option1");
		option1.setBackground(Color.decode("#9e9e9e"));
		option1.setForeground(Color.black);
		option1.setFont(textFont);
		choiceButtonsPanel.add(option1);
		option1.setFocusPainted(false);
		option1.addActionListener(choiceButtons.choiceButtons);//CALLS choiceButtons FROM choiceButtons.java
		option1.setActionCommand("Command1");
		//end button 1
		
		//button 2
		option2 = new JButton("option2");
		option2.setBackground(Color.decode("#9e9e9e"));
		option2.setForeground(Color.black);
		option2.setFont(textFont);
		choiceButtonsPanel.add(option2);
		option2.setFocusPainted(false);
		option2.addActionListener(choiceButtons.choiceButtons);//CALLS choiceButtons FROM choiceButtons.java
		option2.setActionCommand("Command2");
		//end button 2
				
		//button 3
		option3 = new JButton("option3");
		option3.setBackground(Color.decode("#9e9e9e"));
		option3.setForeground(Color.black);
		option3.setFont(textFont);
		choiceButtonsPanel.add(option3);
		option3.setFocusPainted(false);
		option3.addActionListener(choiceButtons.choiceButtons);//CALLS choiceButtons FROM choiceButtons.java
		option3.setActionCommand("Command3");
		//end button 3
		
		//button 4
		option4 = new JButton("option4");
		option4.setBackground(Color.decode("#9e9e9e"));
		option4.setForeground(Color.black);
		option4.setFont(textFont);
		choiceButtonsPanel.add(option4);
		option4.setFocusPainted(false);
		option4.addActionListener(choiceButtons.choiceButtons);//CALLS choiceButtons FROM choiceButtons.java
		option4.setActionCommand("Command4");
		//end button 4
		
		//END CHOICE BUTTONS
		
		//START OF playerUIPanel
		playerUIPanel = new JPanel();
		playerUIPanel.setBounds(20, 707, 1107, 50);
		playerUIPanel.setBackground(Color.black);
		playerUIPanel.setLayout(new GridLayout(1,6));
		//ARMOUR
		armour = new JLabel("Armour:");
		armour.setFont(textFont);
		armour.setForeground(Color.white);
		playerUIPanel.add(armour);
		armourSlot = new JLabel();
		armourSlot.setFont(textFont);
		armourSlot.setForeground(Color.white);
		playerUIPanel.add(armourSlot);
		//END ARMOUR
		//GOLD
		gold = new JLabel("Gold:");
		gold.setFont(textFont);
		gold.setForeground(Color.white);
		playerUIPanel.add(gold);
		carriedGold = new JLabel();
		carriedGold.setFont(textFont);
		carriedGold.setForeground(Color.white);
		playerUIPanel.add(carriedGold);
		//END GOLD
		//WEAPON
		weapon = new JLabel("Weapon:");
		weapon.setFont(textFont);
		weapon.setForeground(Color.white);
		playerUIPanel.add(weapon);

		weaponSlot = new JLabel();
		weaponSlot.setFont(textFont);
		weaponSlot.setForeground(Color.white);
		playerUIPanel.add(weaponSlot);
		//END WEAPON
		//END playerUIPanel
		
		//START OF INVENTORY PANEL
		playerInvPanel = new JPanel();
		playerInvPanel.setBounds(20, 20, 1107, 50);
		playerInvPanel.setBackground(Color.black);
		playerInvPanel.setLayout(new GridLayout(1,7));
		
		inventory = new JLabel("Items:");
		inventory.setFont(textFont);
		inventory.setForeground(Color.white);
		playerInvPanel.add(inventory);
		
		smallGoblinHead = new JLabel();
		smallGoblinHead.setFont(textFont);
		smallGoblinHead.setForeground(Color.white);
		playerInvPanel.add(smallGoblinHead);
		
		adultGoblinHead = new JLabel();
		adultGoblinHead.setFont(textFont);
		adultGoblinHead.setForeground(Color.white);
		playerInvPanel.add(adultGoblinHead);
		
		minotaurHead = new JLabel();
		minotaurHead.setFont(textFont);
		minotaurHead.setForeground(Color.white);
		playerInvPanel.add(minotaurHead);
		
		wolfHead = new JLabel();
		wolfHead.setFont(textFont);
		wolfHead.setForeground(Color.white);
		playerInvPanel.add(wolfHead);
		
		serpentHead = new JLabel();
		serpentHead.setFont(textFont);
		serpentHead.setForeground(Color.white);
		playerInvPanel.add(serpentHead);
		
		amulet = new JLabel();
		amulet.setFont(textFont);
		amulet.setForeground(Color.white);
		playerInvPanel.add(amulet);	
		
		//END INVENTORY PANEL
		
		//START OF CONTAINER ADDITIONS
		container.add(mainDialoguePanel);	
		container.add(choiceButtonsPanel);	
		container.add(playerUIPanel);	
		container.add(playerInvPanel);	
		//END OF CONTAINER ADDITIONS
		
		playerItems();
		
	}//end of gamePlay
	
	public static void playerItems() {
		
		//DEFAULT ITEMS
		armourWorn = "Basic";
		weaponHeld = "None";
		goldHeld = 0;
		
		smallGoblinHeadString = "[LOCKED]";
		adultGoblinHeadString = "[LOCKED]";
		wolfHeadString = "[LOCKED]";
		serpentHeadString = "[LOCKED]";
		minotaurHeadString = "[LOCKED]";
		amuletString = "[LOCKED]";
		//END DEFAULT ITEMS
		
		//UI UPDATES
		weaponSlot.setText(weaponHeld);
		carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
		armourSlot.setText(armourWorn);
		
		smallGoblinHead.setText(smallGoblinHeadString);
		adultGoblinHead.setText(adultGoblinHeadString);
		wolfHead.setText(wolfHeadString);
		serpentHead.setText(serpentHeadString);
		minotaurHead.setText(minotaurHeadString);
		amulet.setText(amuletString);
		//END UI UPDATES
		
		//ONE TIME EVENTS
		beggarAlive = true;
		
		start();
		
	}//end of playerItems
	
	//////////START OF DIALOGUES/////////////////////////
	
	
	/*
	 * THIS BEGINS THE SECTION OF THE CODE THAT YOU JUST COPY AND PASTE FOR DIALOGUE AND OPTION CHANGES
	 * TEMPLATE FOR DIALOGUE/OPTIONS IS////////////////////////////////////////
	 * 
	 * public static void NAME_OF_PATH() {
		
		position = "NAME_OF_POSITION"; //USE THE POSITION SO THAT THE CHOICEBUTTONS.JAVA KNOWS WHERE THE PLAYER IS AND CAN ADJUST ACCORDINGLY, FOR EXAMPLE WHEN YOU START THE GAME YOU'RE AT THE "START" POSITION, LATER WHEN YOU GO TO THE BEACH YOU'RE AT THE "BEACH" POSITION ETC
		
		mainDialogue.setText("DIALOGUE_GOES_HERE"); //REMEMBER THAT THE TEXT DOES NOT AUTOMATICALLY FILL CORRECTLY. YOU NEED TO OCCASIONALLY PUT A \n IN THE DIALOGUE TO MANUALLY MAKE IT MOVE DOWN A LINE, LIKE PRESSING ENTER IN WORD TO START A NEW LINE
		
		//CHOICES
		option1.setText("");
		option2.setText("");//PUT IN THE DIALOGUE/DIRECTION OPTIONS HERE, EG. 'TALK TO MERCHANT' OR 'GO WEST'
		option3.setText("");
		option4.setText("");
		
	}//end method
	 * 
	 */
	
	
	public static void start() {
		
		/*
		 * COPY A POSITION METHOD TO TEST IT AS THE STARTING CHAPTER. TEST IT FOR GUI APPEARANCE ETC.
		 * 
		 * position = "start"; //CHANGE THIS TO THE POSITION YOU WANT TO TEST. EG. CHANGE "start" TO "startNorth"
		
		//MAIN DIALOGUE
		mainDialogue.setText("You awaken in the middle of a field, with no\nmemory of who you are or how you got there.\nYou look around you see a large mountain range,\nthe sea, a dense forest and plains, you can see a\nsmall village past the plains.\nWhat direction will you go?"); //DONT FORGET \n IS A LINE BREAK AND WILL TIDY UP THE DIALOGUE
		//END MAIN DIALOGUE
		
		//CHOICES
		option1.setText("North: Mountains");
		option2.setText("East: Plains");
		option3.setText("South: Ocean");
		option4.setText("West: Forest");
		*/
		
		position = "start";
		
		//if(weaponHeld == ("None")) {
		
		
		//SET ALL STATS TO STARTING
		armourWorn = "Basic";
		weaponHeld = "None";
		goldHeld = 10;
		
		smallGoblinHeadString = "[LOCKED]";
		adultGoblinHeadString = "[LOCKED]";
		wolfHeadString = "[LOCKED]";
		serpentHeadString = "[LOCKED]";
		minotaurHeadString = "[LOCKED]";
		amuletString = "[LOCKED]";
		
		weaponSlot.setText(weaponHeld);
		carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
		armourSlot.setText(armourWorn);
		
		smallGoblinHead.setText(smallGoblinHeadString);
		adultGoblinHead.setText(adultGoblinHeadString);
		wolfHead.setText(wolfHeadString);
		serpentHead.setText(serpentHeadString);
		minotaurHead.setText(minotaurHeadString);
		amulet.setText(amuletString);
		//END OF SET STATS
		
		//SET BOOLEANS
		beggarAlive = true;		
		wolfAlive = true;
		smallGoblinAlive = true;
		adultGoblinAlive = true;
		minotaurAlive = true;
		serpentAlive = true;
		forestGuardAlive = true;
		amuletOwned = false;
		guardAlive = true;
		talkedToGuards = false;
		//END OF BOOLEANS
		
		//MAIN DIALOGUE
		mainDialogue.setText("You awaken in the middle of a field, with no memory of who you are or how you \ngot there. You look around you see a large mountain range, the sea, a dense forest and plains, you can see a small village past the plains. What direction will you go?"); //DONT FORGET \n IS A LINE BREAK AND WILL TIDY UP THE DIALOGUE
		//END MAIN DIALOGUE
		
		//CHOICES
		option1.setText("North: Mountains");
		option2.setText("East: Plains");
		option3.setText("South: Ocean");
		option4.setText("West: Forest");
		//}
		
		/*else if(weaponHeld == ("sword")) {
			
			//MAIN DIALOGUE
			mainDialogue.setText("TESTETSTSTETSTSTETSTSill you go?"); //DONT FORGET \n IS A LINE BREAK AND WILL TIDY UP THE DIALOGUE
			//END MAIN DIALOGUE
			
			//CHOICES
			option1.setText("North: Mountains");
			option2.setText("East: Plains");
			option3.setText("South: Ocean");
			option4.setText("West: Forest");
			}		*/
		
	}//end chapter1
	
	public static void death() {
	
	position = "death"; //CHANGE THIS TO THE POSITION YOU WANT TO TEST. EG. CHANGE "start" TO "startNorth"
	
	//MAIN DIALOGUE
	mainDialogue.setText("You Died! Try Again?"); //DONT FORGET \n IS A LINE BREAK AND WILL TIDY UP THE DIALOGUE
	//END MAIN DIALOGUE
	
	//CHOICES
	option1.setText("Restart");
	option2.setText(" ");
	option3.setText(" ");
	option4.setText(" ");
	
}
	
	public static void backToStart() {
		
		position = "backToStart"; //CHANGE THIS TO THE POSITION YOU WANT TO TEST. EG. CHANGE "start" TO "startNorth"
		
		//MAIN DIALOGUE
		mainDialogue.setText("You are back where you originally started. You look around you see a large \nmountain range, the sea, a dense forest and plains, you can see a small village past the plains. What direction will you go?"); //DONT FORGET \n IS A LINE BREAK AND WILL TIDY UP THE DIALOGUE
		//END MAIN DIALOGUE
		
		//CHOICES
		option1.setText("North: Mountains");
		option2.setText("East: Plains");
		option3.setText("South: Ocean");
		option4.setText("West: Forest");
		
	}
	
	public static void empty() {
		
		position = "empty"; //CHANGE THIS TO THE POSITION YOU WANT TO TEST. EG. CHANGE "start" TO "startNorth"
		
		//MAIN DIALOGUE
		mainDialogue.setText("empty"); //DONT FORGET \n IS A LINE BREAK AND WILL TIDY UP THE DIALOGUE
		//END MAIN DIALOGUE
		
		//CHOICES
		option1.setText("empty");
		option2.setText("empty");

		
	}
	
/*public static void startNorthOld() {
		
		position = "startNorth";
		
		mainDialogue.setText("add north and buttons");
		
		//CHOICES
		option1.setText("add me");
		option2.setText("add me");
		option3.setText("add me");
		option4.setText("add me");
		
	}//end startNorth*/

public static void startEast() {
	
	position = "startEast";
	
	mainDialogue.setText("You head off into the long plains. Not much going\non around here, just mostly grass, small flowers\nand rolling hills. The sun is shining.\nYou notice a pack of odd looking oxen to the north.\nPerhaps messingwith them isn’t a good idea right\nnow. You see the smoke from the village in the\ndistance to your east.");
	
	//CHOICES
	option1.setText("North: Towards the Oxen");
	option2.setText("East: Towards the Village");
	option3.setText("South: Toward the Beach");
	option4.setText("West: Go Back");
	
}//end startEast

public static void placeholder() {
	
	position = "placeholder";
	
	mainDialogue.setText("You found a bug! Hooray!");
	
	//CHOICES
	option1.setText("YOU");
	option2.setText("FOUND");
	option3.setText("A");
	option4.setText("BUG");
	
}//end startEast
	
	/*public static void startSouthold() {
		
		position = "startSouth";
		
		mainDialogue.setText("You find yourself at a beach, the water lapping\nagainst the sands. It seems very empty, not\nmuch in sight other than beach to the east and to\nthe west, along with water to the south. ");
		
		//CHOICES
		option1.setText("North: Go Back");
		option2.setText("East: Head East");
		option3.setText("South: Enter the Water");
		option4.setText("West: Head West");
		
	}//end startSouth*/

public static void Oxen() {
	
	position = "Oxen";
	
	mainDialogue.setText("You start walking towards the oxen, however you step on a twig along the way and the Oxen become spooked. The oxen start running towards you.");
	
	//CHOICES
	option1.setText("Charge back and fight the oxen");
	option2.setText("Run away");
	option3.setText(" ");
	option4.setText(" ");
	
}//end startWest

public static void OxenDeath() {
	
	position = "OxenDeath";
	
	mainDialogue.setText("Alas, the Oxen are too strong and fast for you. You are trampled by the herd. You died.");
	
	//CHOICES
	option1.setText("You died!");
	option2.setText(" ");
	option3.setText(" ");
	option4.setText(" ");
	
}//end startWest
	
	
public static void startWest() {
		
		position = "startWest";
		
		mainDialogue.setText("add west and buttons");
		
		//CHOICES
		option1.setText("add me");
		option2.setText("add me");
		option3.setText("add me");
		option4.setText("add me");
		
	}//end startWest

public static void eastEast() {
	
	if(talkedToGuards == false) {
	
	position = "eastEast";
	
	mainDialogue.setText("You come up to the gates of the village, The guards block you path. Guard 1 asks: “Who are you and what business do you have here?”");
	//CHOICES
	option1.setText("I don’t know, I just lost my memory and I’m looking for help");
	option2.setText("Hand over your weapons or I shall smite thee!");
	option3.setText("Just looking for work");
	option4.setText("Go back");
	
	talkedToGuards = true;
	
	}
	
	else {
		
		position = "eastEastnotalk";
		
		mainDialogue.setText("The guards have let you through already and do not acknowledge you.");
		//CHOICES
		option1.setText("Go into Town");
		option2.setText("Go back to the Plains");
		option3.setText(" ");
		option4.setText(" ");
				
	}
	
}//end startEast

public static void guardDeath() {
	
	position = "guardDeath";
	
	mainDialogue.setText("The guards are threatened by what you have said. Both guards draw their swords and stab at you. You died!");
	//CHOICES
	option1.setText("You died!");
	option2.setText(" ");
	option3.setText(" ");
	option4.setText(" ");
	
}//end startEast

public static void townSouth() {
	
	position = "townSouth";
	
	if(beggarAlive == true) {
	
	mainDialogue.setText("You find yourself in the south part of the town. You see a Blacksmiths shop along one of the streets, could be a useful place to visit."
			+ " As you travel the streets you also notice a beggar sitting on the side of a path, wrapped in blankets and begging for money. You notice a faint glint of silver.");
	//CHOICES
	option1.setText("Head to the north part of the town");
	option2.setText("Go to the blacksmiths shop");
	option3.setText("Walk up to the beggar");
	option4.setText("Go back to the plains");
	}
	
	if (beggarAlive == false) {
		
		mainDialogue.setText("You find yourself in the south part of the town. You see a Blacksmiths shop \nalong one of the streets, could be a useful place to visit."
				+ " You also notice the spot where you killed the beggar. His body is unmoved.");
		//CHOICES
		option1.setText("Head to the north part of the town");
		option2.setText("Go to the blacksmiths shop");
		option3.setText("Walk up to the beggar");
		option4.setText("Go back to the plains");
		}
	
}//end startEast

public static void BS1() {
	
	position = "BS1";
	
	mainDialogue.setText("You enter the blacksmiths shop. A grizzled old man with a handlebar moustache stands at the counter. 'How can I help you, brother?'");
	
	//CHOICES
	option1.setText("I'd like to browse your weapons"); 
	option2.setText("I'd like to browse your armour");
	option3.setText("Leave");
	option4.setText(" ");
}

public static void BS2() {
	
	position = "BS2";
	
	mainDialogue.setText("Here's what I've got in weapons, brother.");
	
	//CHOICES
	option1.setText("Purchase iron dagger (5 gold)"); 
	option2.setText("Purchase iron sword (10 gold)");
	option3.setText("Purchase iron greatsword (15 gold)");
	option4.setText("Exit");
}

public static void BS3() {
	
	position = "BS3";
	
	mainDialogue.setText("Here's what I've got in armour, brother.");
	
	//CHOICES
	option1.setText("Purchase leather armour (5 gold)"); 
	option2.setText("Purchase iron armour (10 gold)");
	option3.setText("Purchase steel armour (15 gold)");
	option4.setText("Exit");
}

public static void BS4() {

    position = "BS4";

    mainDialogue.setText("Thank you, brother, come again!");

    //CHOICES
    option1.setText("Continue..."); 
    option2.setText(" ");
    option3.setText(" ");
    option4.setText(" ");
}

//BUY IRON DAGGER

public static void BSpurchaseLevel1Wep() {

    position = "BSpurchaseLevel1Wep";
    
    if(goldHeld >= 5 && !weaponHeld.equals("Iron Sword") && !weaponHeld.equals("Iron Greatsword") && !weaponHeld.equals("Iron Dagger")) {
    
    weaponHeld = "Iron Dagger";
	weaponSlot.setText(weaponHeld);
	goldHeld = goldHeld - 5;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING

    mainDialogue.setText("Thank you, brother, come again!");

    //CHOICES
    option1.setText("Continue..."); 
    option2.setText(" ");
    option3.setText(" ");
    option4.setText(" ");
    
    }
    
    else if(goldHeld < 5) {
    	
    	mainDialogue.setText("Looks like you don't have enough gold, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }
    
    if(weaponHeld.equals("Iron Sword")) {
    	
    	mainDialogue.setText("I don't think downgrading is a great idea, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }
    
    if(weaponHeld.equals("Iron Greatsword")) {
    	
    	mainDialogue.setText("I don't think downgrading is a great idea, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }
    
    if(weaponHeld.equals("Iron Dagger")) {
    	
    	mainDialogue.setText("Enjoy the iron dagger, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }
    
}

//BUY IRON SWORD
public static void BSpurchaseLevel2Wep() {

    position = "BSpurchaseLevel2Wep";
    
    if(goldHeld >= 10 && !weaponHeld.equals("Iron Sword") && !weaponHeld.equals("Iron Greatsword")) {
    
    weaponHeld = "Iron Sword";
	weaponSlot.setText(weaponHeld);
	goldHeld = goldHeld - 10;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING

    mainDialogue.setText("Thank you, brother, come again!");

    //CHOICES
    option1.setText("Continue..."); 
    option2.setText(" ");
    option3.setText(" ");
    option4.setText(" ");
    
    }
    
    else if(goldHeld < 10) {
    	
    	mainDialogue.setText("Looks like you don't have enough gold, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }
    
if(weaponHeld.equals("Iron Greatsword")) {
    	
    	mainDialogue.setText("I don't think downgrading is a great idea, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }

if(weaponHeld.equals("Iron Sword")) {
	
	mainDialogue.setText("Enjoy the iron sword, brother.");

    //CHOICES
    option1.setText("Continue..."); 
    option2.setText(" ");
    option3.setText(" ");
    option4.setText(" ");
		
}

}

public static void BSpurchaseLevel3Wep() {

    position = "BSpurchaseLevel3Wep";
    
    if(goldHeld >= 15 && !weaponHeld.equals("Iron Greatsword")) {
    
    weaponHeld = "Iron Greatsword";
	weaponSlot.setText(weaponHeld);
	goldHeld = goldHeld - 15;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING

    mainDialogue.setText("Thank you, brother, come again!");

    //CHOICES
    option1.setText("Continue..."); 
    option2.setText(" ");
    option3.setText(" ");
    option4.setText(" ");
    
    }
    
    else if(goldHeld < 15) {
    	
    	mainDialogue.setText("Looks like you don't have enough gold, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }
    
if(weaponHeld.equals("Iron Greatsword")) {
    	
    	mainDialogue.setText("Enjoy the iron greatsword, brother.");

        //CHOICES
        option1.setText("Continue..."); 
        option2.setText(" ");
        option3.setText(" ");
        option4.setText(" ");
    		
    }

}

//BUY leather arm

public static void BSpurchaseLevel1Arm() {

  position = "BSpurchaseLevel1Arm";
  
  if(goldHeld >= 5 && !armourWorn.equals("Leather") && !armourWorn.equals("Iron") && !armourWorn.equals("Steel")) {
  
	armourWorn = "Leather";
	armourSlot.setText(armourWorn);
	goldHeld = goldHeld - 5;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING

  mainDialogue.setText("Thank you, brother, come again!");

  //CHOICES
  option1.setText("Continue..."); 
  option2.setText(" ");
  option3.setText(" ");
  option4.setText(" ");
  
  }
  
  else if(goldHeld < 5) {
  	
  	mainDialogue.setText("Looks like you don't have enough gold, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }
  
  if(armourWorn.equals("Iron")) {
  	
  	mainDialogue.setText("I don't think downgrading is a great idea, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }
  
  if(armourWorn.equals("Steel")) {
  	
  	mainDialogue.setText("I don't think downgrading is a great idea, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }
  
  if(weaponHeld.equals("Leather")) {
  	
  	mainDialogue.setText("Enjoy the leather armour, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }
  
}

//BUY IRON arm
public static void BSpurchaseLevel2Arm() {

  position = "BSpurchaseLevel2Arm";
  
  if(goldHeld >= 10 && !armourWorn.equals("Iron") && !armourWorn.equals("Steel")) {
  
	armourWorn = "Iron";
	armourSlot.setText(armourWorn);
	goldHeld = goldHeld - 10;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING

  mainDialogue.setText("Thank you, brother, come again!");

  //CHOICES
  option1.setText("Continue..."); 
  option2.setText(" ");
  option3.setText(" ");
  option4.setText(" ");
  
  }
  
  else if(goldHeld < 10) {
  	
  	mainDialogue.setText("Looks like you don't have enough gold, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }
  
if(armourWorn.equals("Steel")) {
  	
  	mainDialogue.setText("I don't think downgrading is a great idea, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }

if(armourWorn.equals("Iron")) {
	
	mainDialogue.setText("Enjoy the iron armour, brother.");

  //CHOICES
  option1.setText("Continue..."); 
  option2.setText(" ");
  option3.setText(" ");
  option4.setText(" ");
		
}

}

public static void BSpurchaseLevel3Arm() {

  position = "BSpurchaseLevel3Arm";
  
  if(goldHeld >= 15 && !armourWorn.equals("Steel")) {
  
	armourWorn = "Steel";
	armourSlot.setText(armourWorn);
	goldHeld = goldHeld - 15;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING

  mainDialogue.setText("Thank you, brother, come again!");

  //CHOICES
  option1.setText("Continue..."); 
  option2.setText(" ");
  option3.setText(" ");
  option4.setText(" ");
  
  }
  
  else if(goldHeld < 15) {
  	
  	mainDialogue.setText("Looks like you don't have enough gold, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }
  
if(armourWorn.equals("Steel")) {
  	
  	mainDialogue.setText("Enjoy the Steel Armour, brother.");

      //CHOICES
      option1.setText("Continue..."); 
      option2.setText(" ");
      option3.setText(" ");
      option4.setText(" ");
  		
  }

}

public static void tBeggar1() {
	
	if(beggarAlive == true) {
	position = "tBeggar1";
	mainDialogue.setText("You approach the beggar. He looks up at you in disdain. 'Spare change?' He asks grimly. You notice what seems to be a coin purse at his side. What do you do?");
	//CHOICES
	option1.setText("Aggresively ask for the coin purse"); 	//sends you to tBeggar2
	option2.setText("Tell him no");	//kills you
	option3.setText("Give him spare change (1 coin)");    //decreases gold count by 1
	option4.setText("Leave");			//sends you back to town
	}
	
	if(beggarAlive == false) {
		
		position = "deadBegger";
		mainDialogue.setText("You approach the spot where you killed the beggar. Nothing more to see here.");
		//CHOICES
		option1.setText("Back"); 	//sends you to tBeggar2
		option2.setText(" ");	//kills you
		option3.setText(" ");    //decreases gold count by 1
		option4.setText(" ");			//sends you back to town
		
	}
	
}

	//This only occurs if you have the rusty sword item.
public static void tBeggar2() { //aggressivley ask
	position = "tBeggar2";
	
	mainDialogue.setText("The beggar seems frightened and appears frozen in fear.");
	//CHOICES
	option1.setText("Attack the beggar"); 
	option2.setText("Leave");
	option3.setText(" ");    
	option4.setText(" ");			
}

	//this only occurs if you have a weapon
public static void tBeggar3() {
	
	if(weaponHeld == ("Iron Dagger")) {
	position = "tBeggar3IronDagger";
	mainDialogue.setText("You stab the beggar with your dagger and steal his coin purse. You gain 20 gold.");
	//CHOICES
	option1.setText("Continue"); //back to town
	option2.setText(" ");	
	option3.setText(" ");  
	option4.setText(" ");		
	
	goldHeld = goldHeld + 20;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
	
	beggarAlive = false;
	
	}
	
	if(weaponHeld == ("Iron Sword")) {
		position = "tBeggar3IronSword";
		mainDialogue.setText("You behead the beggar with your sword and steal his coin purse. You gain 20 gold.");
		//CHOICES
		option1.setText("Continue"); //back to town
		option2.setText(" ");	
		option3.setText(" ");  
		option4.setText(" ");		
		
		goldHeld = goldHeld + 20;
		carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
		
		beggarAlive = false;
		
		}
	
	if(weaponHeld == ("Iron Greatsword")) {
		position = "tBeggar3IronGreatsword";
		mainDialogue.setText("You slaughter the beggar with your greatsword and steal his coin purse. You gain 20 gold.");
		//CHOICES
		option1.setText("Continue"); //back to town
		option2.setText(" ");	
		option3.setText(" ");  
		option4.setText(" ");		
		
		goldHeld = goldHeld + 20;
		carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
		
		beggarAlive = false;
		
		}
	
	if(weaponHeld == ("None")) {
		position = "tBeggar3Death";
		mainDialogue.setText("The beggar notices you let your guard down and unsheaths his hidden rusty dagger. The beggar stabs you. You are dead.");
		//CHOICES
		option1.setText("You died!"); //back to town
		option2.setText(" ");	
		option3.setText(" ");  
		option4.setText(" ");		
		
		}
	
	
}

public static void tBeggar4() {
	position = "tBeggar4";
	mainDialogue.setText("The beggar's feeble stance turns to rage as he unsheaths his hidden rusty dagger, the beggar lunges at you and stabs you without remorse, you are dead.");
	//CHOICES
	option1.setText("You died!"); //sends you back to town
	option2.setText(" ");	
	option3.setText(" ");  
	option4.setText(" ");		
}

public static void tBeggar5() {
	
	if(goldHeld >= 1) {
	position = "tBeggar5";
	mainDialogue.setText("Here. (you lose 1 gold)");
	//CHOICES
	
	goldHeld = goldHeld - 1;
	carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
	
	option1.setText("Continue...");
	option2.setText(" ");	
	option3.setText(" ");  
	option4.setText(" ");		
	}
	
	else {
		
		mainDialogue.setText("(You don't have enough gold)");
		//CHOICES
		
		option1.setText("Continue...");
		option2.setText(" ");	
		option3.setText(" ");  
		option4.setText(" ");
		
	}
}


public static void bar1() { 
	
	if(smallGoblinAlive == true) {
	position = "bar1";
	
	mainDialogue.setText("'Oh good, a traveller.' beckons the Barman. 'Listen well, we've had some trouble around here recently. Monsters have been attacking us, and there are some hefty bounties on their heads. Slay them, bring their heads to me, and I will give you 20 gold for each monster you slay. Now, with that out of the way. My name's Sean, what can I do for ya?'");
	//CHOICES
	option1.setText("Heard any rumours lately?"); 
	option2.setText("Any work going?");	
	option3.setText("Leave");  
	option4.setText(" ");	
	}
	
	if(smallGoblinAlive == false) {
		position = "bar1smallgoblin";
		
		mainDialogue.setText("Ah, I see the small goblin head there. Here's 20 gold.");
		//CHOICES
		option1.setText("Take it"); 
		option2.setText(" ");	
		option3.setText(" ");  
		option4.setText(" ");	
		
		goldHeld = goldHeld + 20;
		carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
		
		smallGoblinAlive = true;
		
		}
	
	if(adultGoblinAlive == true) {
		position = "bar1";
		
		mainDialogue.setText("You enter the dimly lit tavern. The barkeep beckons to you. 'Hi there, my names Sean, What can I do for ya?'");
		//CHOICES
		option1.setText("Heard any rumours lately?"); 
		option2.setText("Any work going?");	
		option3.setText("Leave");  
		option4.setText(" ");	
		}
		
		if(adultGoblinAlive == false) {
			position = "bar1adultgoblin";
			
			mainDialogue.setText("Ah, I see the adult goblin head there. Here's 20 gold.");
			//CHOICES
			option1.setText("Take it"); 
			option2.setText(" ");	
			option3.setText(" ");  
			option4.setText(" ");	
			
			goldHeld = goldHeld + 20;
			carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
			
			adultGoblinAlive = true;
			
			}
		
		if(wolfAlive == true) {
			position = "bar1";
			
			mainDialogue.setText("You enter the dimly lit tavern. The barkeep beckons to you. 'Hi there, my names Sean, What can I do for ya?'");
			//CHOICES
			option1.setText("Heard any rumours lately?"); 
			option2.setText("Any work going?");	
			option3.setText("Leave");  
			option4.setText(" ");	
			}
			
			if(wolfAlive == false) {
				position = "bar1wolf";
				
				mainDialogue.setText("Ah, I see the wolf head there. Here's 20 gold.");
				//CHOICES
				option1.setText("Take it"); 
				option2.setText(" ");	
				option3.setText(" ");  
				option4.setText(" ");	
				
				goldHeld = goldHeld + 20;
				carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
				
				wolfAlive = true;
				
				}
			
			if(minotaurAlive == true) {
				position = "bar1";
				
				mainDialogue.setText("You enter the dimly lit tavern. The barkeep beckons to you. 'Hi there, my names Sean, What can I do for ya?'");
				//CHOICES
				option1.setText("Heard any rumours lately?"); 
				option2.setText("Any work going?");	
				option3.setText("Leave");  
				option4.setText(" ");	
				}
				
				if(minotaurAlive == false) {
					position = "bar1mino";
					
					mainDialogue.setText("Ah, I see the minotaur head there. Here's 20 gold.");
					//CHOICES
					option1.setText("Take it"); 
					option2.setText(" ");	
					option3.setText(" ");  
					option4.setText(" ");	
					
					goldHeld = goldHeld + 20;
					carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
					
					minotaurAlive = true;
					
					}
				
				if(serpentAlive == true) {
					position = "bar1";
					
					mainDialogue.setText("You enter the dimly lit tavern. The barkeep beckons to you. 'Hi there, my names Sean, What can I do for ya?'");
					//CHOICES
					option1.setText("Heard any rumours lately?"); 
					option2.setText("Any work going?");	
					option3.setText("Leave");  
					option4.setText(" ");	
					}
					
					if(serpentAlive == false) {
						position = "bar1serp";
						
						mainDialogue.setText("Ah, I see the serpent head there. Here's 20 gold.");
						//CHOICES
						option1.setText("Take it"); 
						option2.setText(" ");	
						option3.setText(" ");  
						option4.setText(" ");	
						
						goldHeld = goldHeld + 20;
						carriedGold.setText("" + goldHeld); //THE "" + IS THE ONLY WAY TO DISPLAY GOLD AS AN INT NOT A STRING
						
						serpentAlive = true;
						
						}
	
	
}

public static void bar2() { //tells you about the sphinx
	position = "bar2";
	mainDialogue.setText("Heard there's a treasure buried within the ruins west of here. Heard there's also a monster, though. Make of that what you will.");
	//CHOICES
	option1.setText("Back"); 
	option2.setText(" ");	
	option3.setText(" ");  
	option4.setText(" ");		
}

public static void bar3() { //tells you about the monsters heads
	position = "bar3";
	mainDialogue.setText("There's been some monsters terrorizing the outer areas of the town lately. I'll pay you 20 gold for each one of them you kill. Show me their heads as proof.");
	//CHOICES
	option1.setText("Back"); 
	option2.setText(" ");	
	option3.setText(" ");  
	option4.setText(" ");		
}

public static void townNorth() {
	
	position = "townNorth";
	
	mainDialogue.setText("You find yourself in the North part of the town. You notice a big bustling tavern along one of the busier streets. "
			+ "You also notice the road heading off north, heavily fortified with soldiers guarding the path. It seems to head off into a forest.");
	//CHOICES
	option1.setText("Enter the Forest");
	option2.setText("Go to the Tavern");
	option3.setText("Go back to the south side of the town.");
	option4.setText(" ");
	
}//end 

public static void startForest1() {
	
	if(armourWorn == ("Steel")) {
	
	position = "startForest1";
	
	mainDialogue.setText("The guard notices your steel armour and allows you to follow the path into the woods. The forest is dark, and gloomy. You come upon a clearing in the forest, where the road splits into three different crossroads. One going north, another east and another west. Which path do you take?");
	//CHOICES
	option1.setText("N: Take the North path");
	option2.setText("E: Take the East path");
	option3.setText("W: Take the West path");
	option4.setText("S: Go back to the safety of the town");
	
	}
	
	else {
		
		position = "startForest2";
		
		mainDialogue.setText("You approach the woods, however a guard blocks your path. 'Halt, traveller. You are ill equipped to travel beyond here. Begone.'");
		//CHOICES
		option1.setText("Return to town");
		option2.setText("Attack the guard to advance");
		option3.setText(" ");
		option4.setText(" ");				
		
	}
	
	if(guardAlive == false) {
		
position = "startForest3noguard";
		
		mainDialogue.setText("You see the body of the guard you killed with your iron greatsword. Someone should really clean that up. What direction will you go?");
		//CHOICES
		option1.setText("N: Take the North path");
		option2.setText("E: Take the East path");
		option3.setText("W: Take the West path");
		option4.setText("S: Go back to the safety of the town");
				
	}
	
}//end startEast

public static void startForest3() {
	
	if(weaponHeld == ("Iron Greatsword")) {
	
	position = "startForest3";
	
	mainDialogue.setText("You swing at the guard with your iron greatsword and cut his head clean off. Now you may advance without a roadblock.");
	//CHOICES
	option1.setText("N: Take the North path");
	option2.setText("E: Take the East path");
	option3.setText("W: Take the West path");
	option4.setText("S: Go back to the safety of the town");
	
	guardAlive = false;
	
	}
	
	else {
		
		position = "dietoforestguard";
		
		mainDialogue.setText("You try to attack the guard, but he easily parries your attempt and cuts you clean in half with his sword.");
		//CHOICES
		option1.setText("You died!");
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");				
		
	}
	
	if(guardAlive == false) {
		
		position = "startForest3noguard";
		
		mainDialogue.setText("You see the body of the guard you killed with your iron greatsword. Someone should really clean that up. What direction will you go?");
		//CHOICES
		option1.setText("N: Take the North path");
		option2.setText("E: Take the East path");
		option3.setText("W: Take the West path");
		option4.setText("S: Go back to the safety of the town");

		
	}
	
	
}//end startEast

public static void sFNorth1() {
	
	//SNAKESERPENT//
	
	if(serpentAlive == true) {
	
	position = "sFNorth1";
	
	mainDialogue.setText("You don't travel very far until you notice something farther down the path. It seems to be some kind of large snake monster. Looks rather terrifying. What do you do?");
	//CHOICES
	option1.setText("Attack the foul beast!");
	option2.setText("Retreat");
	option3.setText(" ");
	option4.setText(" ");
	
	}
	
	else {
			
			position = "sFNorth1snakedead";
			
			mainDialogue.setText("This is the spot where you killed the serpent. Not much going on here. May aswell head back.");
			//CHOICES
			option1.setText("Return to Town");
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");		
		
	}
	
}//end startEast

public static void snakeFight() {
	
	//SNAKESERPENT//
	
	if(weaponHeld == ("Iron Greatsword")) {
	
	position = "sFNorth1killsnake";
	
	mainDialogue.setText("It was a close battle, but you manage to behead the serpent using your iron greatsword.");
	//CHOICES
	option1.setText("Return to the Forest");
	option2.setText("Return to Town");
	option3.setText(" ");
	option4.setText(" ");
	

	serpentHeadString = "Snake Head";
	serpentHead.setText(serpentHeadString);
	serpentAlive = false;
	
	}
	
	else {
			
			position = "sFNorth1dietosnake";
			
			mainDialogue.setText("You try your best, but the serpent is simply too powerful. It eats you in one bite. You are dead.");
			//CHOICES
			option1.setText("You died!");
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");		
		
	}
	
}//end startEast

public static void sFEast1() {
	
	position = "sFEast1";
	
	mainDialogue.setText("You travel down the path until you reach a crossroads. One path going to the left, the other to the right.");
	//CHOICES
	option1.setText("Take the left path");
	option2.setText("Take the right path");
	option3.setText("Head back");
	option4.setText(" ");
	
}//end startEast


public static void sFEast2() {
	
	position = "sFEast2";
	
	mainDialogue.setText("You travel down the left path, walking for a few minutes until the path just suddenly dissapears. You decide it is not worth it to travel through the forest in case you get lost.");
	//CHOICES
	option1.setText("Head back");
	option2.setText(" ");
	option3.setText(" ");
	option4.setText(" ");
	
}//end startEast
	
	public static void sFEast3() {
		
		if(smallGoblinAlive == true) {
		
		position = "sFEast3";
		
		mainDialogue.setText("You travel down the right path until you notice what seems to be a small goblin-like creature up ahead. Do you proceed?");
		//CHOICES
		option1.setText("Attack the goblin!");
		option2.setText("Retreat");
		option3.setText(" ");
		option4.setText(" ");
		
		}
		
		else {
			
			position = "sFEast3goblindead";
			
			mainDialogue.setText("This is the spot where you killed the small goblin. Not much to see here now.");
			//CHOICES
			option1.setText("Back");
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
			
		}
		
	}//end startEast
	
	//THIS SECTION ONLY PLAYS OUT IF YOU HAVE THE RUSTY SWORD, AKA +1 ATTACK. DEFENSE DOESNT MATTER.
	public static void sFEast4() {
		
		if(weaponHeld == ("None")) {
			
			position = "sFEast4die";
			
			mainDialogue.setText("You charge the goblin. It yells out a high pitched shriek and its mother comes to defend it. The mother is much bigger and weilds a club. You are unable to defend yourself. You are dead.");
			//CHOICES
			option1.setText("You died!"); // AFTER THESE EVENTS YOU SHOULD HAVE AN ITEM CALLED GOBLIN HEAD IN YOUR INVENTORY WHICH WILL GIVE YOU A REWARD IN THE FORM OF THE STALE BREAD ITEM.
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
							
		}
			
		else {
			
		position = "sFEast4killgoblin";
		
		mainDialogue.setText("You charge the goblin. The poor thing didn't even notice you until you whimper out a battle cry. It begins to run but you cut it down with your weapon. You chop off its head and place it in your bag. I'm sure I can sell this back at town.");
		//CHOICES
		option1.setText("Head back."); // AFTER THESE EVENTS YOU SHOULD HAVE AN ITEM CALLED GOBLIN HEAD IN YOUR INVENTORY WHICH WILL GIVE YOU A REWARD IN THE FORM OF THE STALE BREAD ITEM.
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
		smallGoblinHeadString = "Small Goblin Head";
		smallGoblinHead.setText(smallGoblinHeadString);
		smallGoblinAlive = false;
		
		}
		
	}//end SFEast4
	
	//THIS SECTION PLAYS IF YOU HAVE 0/0 STATS. YOU DIE.
	public static void sFEast5() {
	
	position = "sFEast5";
	
	mainDialogue.setText("You start running at the goblin, your heart pounding. Ready to make your first kill. But as you sprint you manage to trip over the root of a tree and fall flat on the ground, knocking yourself out. You never re-awaken.");
	//CHOICES
	option1.setText("You're dead.");
	option2.setText(" ");
	option3.setText(" ");
	option4.setText(" ");
	
}//end XX
	
	public static void sFWest1() {
		
		position = "sFWest1";
		
		mainDialogue.setText("You travel down the path until you find a fork in the road. One path leading to the left, another forward and another to the right. Which do you take?");
		//CHOICES
		option1.setText("Take the left path");
		option2.setText("Take the forward path");
		option3.setText("Take the right path");
		option4.setText("Go back");
		
	}//end XX
	
	public static void sFWestL1() {
		
		if(adultGoblinAlive = true) {
		
		position = "sFWestL1";
		
		mainDialogue.setText("You travel down the left path and encounter what seems to be an adult goblin. It Is carrying a spear along and has some armour. What do you do?");
		//CHOICES
		option1.setText("Attack the goblin");
		option2.setText("Retreat");
		option3.setText(" ");
		option4.setText(" ");
		
		}
		
		else {
			
			position = "sFWestL1goblindead";
			
			mainDialogue.setText("You recognise this area. You killed the adult goblin here. Unfortunately there's nothing more to see here.");
			//CHOICES
			option1.setText("Back");
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
					
		}
		 
	}//end XX
	
	// THIS ONLY PLAYS IF CHARACTER HAS +2 ATTACK
	
	public static void sFWestL2() {
		
		if (weaponHeld == ("Iron Greatsword")) {
		
		position = "sFWestL2";
		
		mainDialogue.setText("You charge the goblin with your sword, it lifts up it's spear in defence but it wasn't ready for you. You cut the monster down and claim your reward.");
		//CHOICES
		option1.setText("Head back");     // this adds the adult goblin head item to your inventory and sends you back to the town
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
		adultGoblinHeadString = "Adult Goblin Head";
		adultGoblinHead.setText(adultGoblinHeadString);
		adultGoblinAlive = false;
		
		}
		
		else {
			
			position = "sFWestL2death";
			
			mainDialogue.setText("You charge at the goblin, but as you're running you manage to expertly trip up right as you're about to reach him, fall flat on your face and then the goblin makes easy work of you.");
			//CHOICES
			option1.setText("You died!");     // this adds the adult goblin head item to your inventory and sends you back to the town
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
						
		}
		
	}//end XX

	//THIS OCCURS IF YOU HAVE LESS THAN 2 ATTACK

	public static void sFWestL3() {
		
		position = "sFWestL3";
		
		mainDialogue.setText("You charge at the goblin, but as you're running you manage to expertly trip up right as you're about to reach him, fall flat on your face and then the goblin makes easy work of you.");
		//CHOICES
		option1.setText("You died!");
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
	}//end XX
	
	public static void sFWestM1() {
		
		if(minotaurAlive == true) {
		
		position = "sFWestM1";
	
		mainDialogue.setText("You travel down the middle path until you spot a Minotaur in a clearing. What do you do?");
		//CHOICES
		option1.setText("Attack it");
		option2.setText("Retreat");
		option3.setText(" ");
		option4.setText(" ");
		}
		
		else {
			
			position = "sFWestM1minodead";
			
			mainDialogue.setText("You recognise this area. This is where you killed the Minotaur. There's nothing left to do here.");
			//CHOICES
			option1.setText("Go back.");
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
						
		}
	
}//end XX
	
	//THIS ONLY PLAYS IF YOU HAVE +2/+2
	
	public static void sFWestM2() {
		
		if(weaponHeld == ("Iron Greatsword")) {
		
		position = "sFWestM2";
		
		mainDialogue.setText("You begin to approach the minotaur. As he notices your presence he picks up a golden battleaxe off the floor and turns to face you. An intense fight ensues but you come out victorious.");
		//CHOICES
		option1.setText("Back to Town");  //gain mino head and then return to town
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
		minotaurHeadString = "Minotaur Head";
		minotaurHead.setText(minotaurHeadString);
		minotaurAlive = false;
		}
		
		else {
			
			position = "sFWestM2dead";
			
			mainDialogue.setText("You approach the minotaur. As he notices your presence he picks up a golden battleaxe off the floor and begins charging before you can react, and sadly you were no match for him with your inferior skill and equipment.");
			//CHOICES
			option1.setText("You died!");  //gain mino head and then return to town
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
			
		}
		
	}//end XX
	
	//this occurs if you do not have sufficient stats
public static void sFWestM3() {

position = "sFWestM3";

mainDialogue.setText("You approach the minotaur. As he notices your presence he picks up a golden battleaxe off the floor and begins charging before you can react, and sadly you were no match for him with your inferior skill and equipment.");
//CHOICES
option1.setText("You died!");
option2.setText(" ");
option3.setText(" ");
option4.setText(" ");

}//end XX

public static void sFWestR1() {
	
	position = "sFWestR1";
	
	mainDialogue.setText("You travel down the right path until you notice a large wolf far away. What do you do?");
	//CHOICES
	option1.setText("Approach the wolf.");
	option2.setText("Retreat");
	option3.setText(" ");
	option4.setText(" ");
	
}//end XX

//THIS OCCURS IF YOU HAVE +2/+1 OR +1/+2
	 public static void sFWestR2() {
		
		position = "sFWestR2";
		
		mainDialogue.setText("You continue walking until the wolf senses your presence, it quickly dashes into the forest and starts running towards you through the undergrowth. Right as it leaps at you you manage to deflect the attack and kill the beast with a swift counterattack");
		//CHOICES
		option1.setText("Head back");  // gain wolf head and head back to town
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
	}//end XX
	 
	//THIS OCCURS WITH INSUFFICENT STATS
		public static void sFWestR3() {
			
			position = "sFWestR3";
			
			mainDialogue.setText("You continue walking until the wolf senses your presence, it quickly dashes into the undergrowth and starts running towards you. All of a sudden it leaps out at you going straight for the neck but you do not manage to dodge in time.");
			//CHOICES
			option1.setText("You died!");  //dead
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
			
		}//end XX
		
		//THIS EVENT ONLY OCCURS IF YOU DONT HAVE +3/+3 YET
		public static void startWest1() {
			
			if(armourWorn == ("Steel")) {
		        
		        position = "startWest1";
		        
		        mainDialogue.setText("You enter the dark forest. It has a strange, unnatural feel to it. Something about this place just feels wrong. You follow the path but it quickly dissapears, leaving only thick undergrowth. You decide to press onwards to see what you find.");
		        
		        //CHOICES
		        option1.setText("Continue...");
		        option2.setText(" ");
		        option3.setText(" ");
		        option4.setText(" ");
		        
			}
			
			else {
				
				position = "startWest2";
		        
		        mainDialogue.setText("You enter the dark forest. It has a strange, unnatural feel to it. Something about this place just feels wrong. You follow the path but it quickly dissapears, leaving only thick undergrowth. You decide it's too dangerous and you'll come back with some armour. Steel should do the trick.");
		        
		        //CHOICES
		        option1.setText("Back");
		        option2.setText(" ");
		        option3.setText(" ");
		        option4.setText(" ");
				
				
			}
		        
		    }//end startWest

		public static void West1() {
			
			position = "W1";
			
			mainDialogue.setText("You press on through the undergrowth until you come across a clearing. You scan your surroundings and notice a few things. To the north you can see a lake. To the south, you see a brightly coloured plant. What do you do?");
			
			//CHOICES
			option1.setText("N: Head towards the lake");
			option2.setText("W: Continue west");
			option3.setText("S: Investigate the plant");
			option4.setText("E: Head back");
		}

		public static void WN1() {
			
			position = "WN1";
			
			mainDialogue.setText("You come to the edge of the lake, it has a brilliant sparkling blue shine to it. You scan the edges of the lake but see nothing else of interest in the area. However, you see a small boulder in the middle of the lake with what appears to be a sword sticking out. What do you do?");
			
			//CHOICES
			option1.setText("Examine the lake");
			option2.setText("Dive into the lake and swim towards the sword");
			option3.setText("Head back");
			option4.setText(" ");
		}



		public static void WN2() {
			
			position = "WN2";
			
			mainDialogue.setText("The lake seems very still other than the occasional ripples along the surface.");
			
			//CHOICES
			option1.setText("Continue..");   //takes you back to WN1
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
		}

		public static void WN3() {
			
			position = "WN3";
			
			mainDialogue.setText("You take off your armour and leave your equipment on the shore. You dive into the lake and begin to swim towards the sword. Halfway there you feel some kind of kelp grabbing at your feet even though the lake seems deep, moments later something grabs your leg and begins to drag you down. You try to stay alive but eventually succumb to the depths.");
			
			//CHOICES
			option1.setText("You died!");
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
		}

		public static void WS1() {
			
			position = "WS1";
			
			mainDialogue.setText("You approach the colourful looking plant. It's colours seem to be constantly shifting and changing, like some kind of psychadelic rainbow. What do you do?");
			
			//CHOICES
			option1.setText("Cut at the plant");  //this just sends you to W1
			option2.setText("Head back");
			option3.setText(" ");
			option4.setText(" ");
		}
		
		public static void WS1Plant() {
			
			position = "WS1Plant";
			
			mainDialogue.setText("The plant shrieks and lets out a deadly purple mist. Your skin shrivels and you suffocate in seconds. You are dead.");
			
			//CHOICES
			option1.setText("You died!");  //this just sends you to W1
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
		}

		public static void WW1() {
			
			if(amuletOwned == false) {
			
			position = "WW1";
			
			mainDialogue.setText("You continue on through the thick forest until you spot what seems to be some temple ruins up ahead. What do you do?");
			
			//CHOICES
			option1.setText("Proceed to the ruins");
			option2.setText("Head back");
			option3.setText(" ");
			option4.setText(" ");
			
			}
			
			else {
				
				position = "WW1amuletowned";
				
				mainDialogue.setText("You continue on through the thick forest until you spot the temple where you got the amulet up ahead. No point in going back there.");
				
				//CHOICES
				option1.setText("Head back");
				option2.setText(" ");
				option3.setText(" ");
				option4.setText(" ");
							
			}
		}

		public static void WW2() {
			
			position = "WW2";
			
			mainDialogue.setText("You enter the ruins, it seems to have been long abandoned, except for some reason you get a sensation as though you're being watched. ");
			
			//CHOICES
			option1.setText("Continue..."); 
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
		}

		public static void WW3() {
			
			position = "WW3";
			
			mainDialogue.setText("You hear a loud thud behind you. You turn around and see a massive beast with the head of a human but the body of a lion standing there, looking right at you. It doesn't seem to be getting ready to pounce. What do you do?");
			
			//CHOICES
			option1.setText("Draw your sword"); //kills u
			option2.setText("Try to speak to it");
			option3.setText("Run away");
			option4.setText(" ");
		}

		public static void WW4() {
			
			position = "WW4";
			
			mainDialogue.setText("You draw your sword, but as soon as you get it out of your scabbard, the beast is already on top of you. Ripping you to shreds without hesitation.");
			
			//CHOICES
			option1.setText("You died!");  //dead
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
		}

		public static void WW5() {
			
			position = "WW5";
			
			mainDialogue.setText("You turn around and begin to run, but before you manage to make 5 steps the beast pounces on you, killing you swiftly from behind.");
			
			//CHOICES
			option1.setText("You died!");  //dead1
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");
		}

		public static void WW6() {
			
			position = "WW6";
			
			mainDialogue.setText("You sheepishly say 'Hello?' to the beast, and it replies hello in a soft tone. You then ask it 'What are you?' and it replies 'I am a sphinx, I am the ancient guardian of these ruins. You are tresspassing upon hallowed ground, and so the only way I shall let you live is by solving my riddle.");
			
			//CHOICES
			option1.setText("Attempt riddle"); //send to ww7
			option2.setText("Reject the offer"); //send to ww8
			option3.setText(" ");
			option4.setText(" ");
		}

		public static void WW7() {
			
			position = "WW7";
			
			mainDialogue.setText("A snail is at the bottom of a 20 meters deep pit trying to get out. Every day the snail climbs 5 meters upwards, but at night the snail slides 4 meters back downwards. How many days does it take the snail to get out of the pit?");
			
			//CHOICES
			option1.setText("20"); 	//SENDS TO WW8
			option2.setText("16");		//SENDS YOU TO WW9
			option3.setText("15");	//SENDS TO WW8
			option4.setText("Run away");	//SENDS YOU TO WW5
		}


		public static void WW8() {
			
			position = "WW8";
			
			mainDialogue.setText("The sphinx grins and says 'Wrong answer' and pounces on you, ripping you to shreds in a matter of seconds.");
			
			//CHOICES
			option1.setText("You died!"); 	
			option2.setText(" ");
			option3.setText(" ");	
			option4.setText(" ");	
		}

		public static void WW9() {
			
			position = "WW9";
			
			mainDialogue.setText("The sphinx grins and tells you 'Congratulations. You may live. And as a token of appreciation, I found this amulet lying around a long time ago. It's of no use to me so you can keep it.");
			
			amuletString = "Amulet";
			amulet.setText(amuletString);
			amuletOwned = true;
			
			//CHOICES
			option1.setText("Return to Town"); 	//this brings you back to WW1 and also adds the 'Mysterious Amulet' Item to your inventory, which is used to free the princess.
			option2.setText(" ");
			option3.setText(" ");	
			option4.setText(" ");	
		}
		
		public static void startNorth() {
			
			position = "startNorth";
			
			mainDialogue.setText("You head towards the towering peaks of the mountains up ahead of you, you can feel the temperature slowly getting colder and colder as you get closer. The weather seems calm thankfully, but you hear howling off in the distance.");
			
			//CHOICES
			option1.setText("Continue");
			option2.setText("Head back");
			option3.setText(" ");
			option4.setText(" ");
			
		}//end startNorth

	public static void N1() {
		
		if(wolfAlive == true) {
		
		position = "N1";		//THIS IS ONLY SUPPOSED TO HAPPEN ONCE
		
		mainDialogue.setText("As you continue forward, you can feel the climate becoming progressively colder. As you enter the valley you suddenly hear howling around you. You check your surrounding and see two white wolves to your right and one to your left. What do you do?");
		
		//CHOICES
		option1.setText("Defend yourself");
		option2.setText("Run away"); //LEADS TO N4
		option3.setText(" ");
		option4.setText(" ");
		}
		
		else {
			
			
			position = "N1wolfdead";		//THIS IS ONLY SUPPOSED TO HAPPEN ONCE
			
			mainDialogue.setText("This is where you killed the wolf. Better proceed or run away before the one who got away comes back for revenge.");
			
			//CHOICES
			option1.setText("Back to Town");
			option2.setText("Continue..."); //LEADS TO N4
			option3.setText(" ");
			option4.setText(" ");	
			
		}
		
	}

		//THIS ONLY PLAYS IF YOU DONT HAVE +2/+3
	public static void N2() {
		
		if(weaponHeld == ("Iron Greatsword")) {
		
		position = "N3";
		
		mainDialogue.setText("The wolves don’t seem too co-ordinated, you use your greatsword and slash at one wolf, ripping its head clean off. The second wolf runs away, fearful of its life.");
		
		//CHOICES
		option1.setText("Continue");
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
		wolfHeadString = "Wolf Head";
		wolfHead.setText(wolfHeadString);
		
		wolfAlive = false;
		
		}
		
		else {
			
			position = "N2";
			
			mainDialogue.setText("The wolves don’t seem too co-ordinated, but you are underprepared for this fight. You do your best to stay alive, but the wolves just bite into your skin and slowly wear you down. After a long and arduous fight you finally succumb to your wounds and collapse ");
			
			//CHOICES
			option1.setText("You died!");
			option2.setText(" ");
			option3.setText(" ");
			option4.setText(" ");	
			
		}
		
	}

		//THIS ONLY OCCURS IF YOU HAVE +2/+3 OR BETTER
	public static void N3old() {
		
		position = "N3old";
		
		mainDialogue.setText("The wolves seem threatening, but they are surprisingly un-co-ordinated.  You kill the wolves one by one as they try to take you on, Thankfully your strong armour makes them mostly unable to do any real damage to you and you are able to fight them back without much trouble.” ");
		
		//CHOICES
		option1.setText("Continue...");  //LEADS YOU TO N5
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
	}

	public static void N4() {
		
		position = "N4";
		
		mainDialogue.setText("You turn and begin to run, but your legs are no match for the speed a wolf. The wolves quickly catch up to you and tear you to pieces. ");
		
		//CHOICES
		option1.setText("You died!");  //dead
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
	}

	public static void N5() {
		
		position = "N5";
		
		mainDialogue.setText("You finally enter the valley. The air is very cold here now. There is snow everywhere, you are thankful that you have good insulated armour to protect you. You notice a cave to the east side of the valley, a polar bear off to the west and what seems to be a dead end in the North.");
		
		//CHOICES
		option1.setText("N: Check out the north area");
		option2.setText("W: Go over to the bear");
		option3.setText("E: Go investigate the cave");
		option4.setText("S: Head back");  //brings you back to startNorth
		
	}

	public static void N6() {		//polar bear
		
		position = "N6";
		
		mainDialogue.setText("You get closer to the polar bear to have a closer look. It looks very large, strong and overall intimidating. Perhaps engaging it isn't the best idea.");
		
		//CHOICES
		option1.setText("Startle it");       //sends u to n7
		option2.setText("Head back");     //sends you back to N5
		option3.setText(" ");
		option4.setText(" ");
		
	}

	public static void N7() {
		
		position = "N7";
		
		mainDialogue.setText("The polar bear smells your presence and turns to face you. It begins charging at you and you try to evade it, but it's fast for such a large beast. You collapse under its weight as it's claws penetrate your armour.");
		
		//CHOICES
		option1.setText("You died!");
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
	}

	public static void N8() {		//dead end
		
		position = "N8";
		
		mainDialogue.setText("You continue heading north until, sure enough you reach a dead end. You look around the area but find nothing of interest.");
		
		//CHOICES
		option1.setText("Head back");	//sends u to n5
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
	}

	public static void NC1() {
		
		position = "NC1";
		
		mainDialogue.setText("This cave goes deeper than you thought. Keep going or head back?");
		
		//CHOICES
		option1.setText("Keep going");
		option2.setText("Head back");
		option3.setText(" ");
		option4.setText(" ");
	}

	public static void NC2() {
		
		if (amuletOwned == true) {
		
		position = "NC2";
		
		mainDialogue.setText("You enter a large cavern. It seems to be a dead end, but one of the walls looks suspiciously flat. You take a closer look and notice a hole in the wall. What do you do?");
		
		//CHOICES
		option1.setText("Place amulet into wall");
		option2.setText("Head back");   //THIS ONLY TRIGGERS IF YOU HAVE AN AMULET IN INVENTORY, this then sends you to NC3
		option3.setText(" ");
		option4.setText(" ");
		
		}
		
		else {
			
			position = "NC2noamulet";
			
			mainDialogue.setText("You enter a large cavern. It seems to be a dead end, but one of the walls looks suspiciously flat. You take a closer look and notice a hole in the wall. You have nothing that could fit in that hole, maybe asking around town will help?");
			
			//CHOICES
			option1.setText("Return to Town");
			option2.setText(" ");   //THIS ONLY TRIGGERS IF YOU HAVE AN AMULET IN INVENTORY, this then sends you to NC3
			option3.setText(" ");
			option4.setText(" ");
			
			
		}
		
	}

	public static void NC3() {
		
		position = "NC3";
		
		mainDialogue.setText("Setting the amulet into the wall slides a portion of the wall to the right, revealing a path going deeper in. Proceed?");
		
		//CHOICES
		option1.setText("Continue...");  //returns you to NC1
		option2.setText("Take out amulet and head back");
		option3.setText(" ");
		option4.setText(" ");
		
	}

	public static void NC4() {
		
		position = "NC4";
		
		mainDialogue.setText("You travel down the dimly lit corridor until you eventually notice a light ahead. As you get closer you notice they are burning braziers. You aren't sure what to make of this. Keep going?");
		
		//CHOICES
		option1.setText("Continue...");
		option2.setText("Head back"); //sends you back to NC3
		option3.setText(" ");
		option4.setText(" ");
	}

	public static void NC5() {
		
		position = "NC5";
		
		mainDialogue.setText("You follow the lights until you start to be able to see a brighter light up head. As you get closer you notice it is a room. Upon entering the room you notice a bed in one of the corners. Upon this bed lies the sleeping princess you came out to rescue. Wake her?");
		
		//CHOICES
		option1.setText("Wake her");		//game is win
		option2.setText("Head back");		//brings you to NC6
		option3.setText(" ");
		option4.setText(" ");
	}
	
	public static void victory() {
		
		position = "victory";
		
		mainDialogue.setText("You did it! You saved the princess! Congratulations! You're a true hero!");
		
		//CHOICES
		option1.setText("Restart?");		//game is win
		option2.setText(" ");		//brings you to NC6
		option3.setText(" ");
		option4.setText(" ");
	}

	public static void NC6() {
		
		position = "NC6";
		
		mainDialogue.setText("You turn around and begin to walk away. You manage a few steps out of the room when you suddenly trip over yourself while you were thinking about why you didn't just wake her. You were not prepared for a fall so you hit a hard landing and break your neck in the process. You spend your last waking moments wondering why you didnt just do it.");
		
		//CHOICES
		option1.setText("You died!");		//dead
		option2.setText(" ");
		option3.setText(" ");
		option4.setText(" ");
		
	}
	
public static void startSouth() {
		
		position = "startSouth";
		
		mainDialogue.setText("You find yourself on a small beach. It stretches further off into the east. Where do you go?");
		
		//CHOICES
		option1.setText("North: Go Back");
		option2.setText("East: Head East");
		option3.setText("South: Enter the Water");
		option4.setText(" ");
		
	}//end startSouth
	
public static void SE() {
		
		position = "SE";
		
		mainDialogue.setText("You find yourself on a small beach. It stretches further off into the west. Where do you go?");
		
		//CHOICES
		option1.setText("North: Go Back");		//sends you to startEast
		option2.setText("West: Head West");	//sends you to startSouth
		option3.setText("South: Enter the Water");	//SENDS YOU TO SE1
		option4.setText(" ");
	}

public static void SE1() {
	
	position = "SE1";
	
	mainDialogue.setText("You enter the shore, the water lapping gently against your feet. It's cold but pleasant. Where do you go?");
	
	//CHOICES
	option1.setText("North: Go Back");	//sends u back to SE
	option2.setText("South: Go deeper into the water.");	//SENDS YOU TO SE2
	option3.setText(" ");
	option4.setText(" ");	
}

public static void SE2() {
	
	position = "SE2";
	
	mainDialogue.setText("You wade deeper into the water. It is up to your waist now. You are soaked but It's not too late to head back.");
	
	//CHOICES
	option1.setText("North: Go Back");      //sends u back to SE1
	option2.setText("South: Go deeper into the water.");   //sends u to SE3
	option3.setText(" ");
	option4.setText(" ");	
}

public static void SE3() {
	
	position = "SE3";
	
	mainDialogue.setText("You decide to keep going further into the water, but suddenly you get caught by a strong current and carried out to sea. You struggle against the waves but get brought further and further out to sea. Eventually you become too tired to struggle and just fall to the floor of the ocean, slowly fading from consciousness.");
	
	//CHOICES
	option1.setText("You died!");       //dead
	option2.setText(" ");
	option3.setText(" ");
	option4.setText(" ");	
}

public static void SS1() {
	
	position = "SS1";
	
	mainDialogue.setText("You enter the shore, the water lapping gently against your feet. It's cold but pleasant. Where do you go?");
	
	//CHOICES
	option1.setText("North: Go Back");	//sends u back to startSouth
	option2.setText("South: Go deeper into the water.");	//SENDS YOU TO SS2
	option3.setText(" ");
	option4.setText(" ");	
}

public static void SS2() {
	
	position = "SS2";
	
	mainDialogue.setText("You wade deeper into the water. It is up to your waist now. You are soaked but It's not too late to head back.");
	
	//CHOICES
	option1.setText("North: Go Back");      //sends u back to SS1
	option2.setText("South: Go deeper into the water.");   //sends u to SS3
	option3.setText(" ");
	option4.setText(" ");	
}

public static void SS3() {
	
	position = "SS3";
	
	mainDialogue.setText("You decide to keep going further into the water, but suddenly you get caught by a strong current and carried out to sea. You struggle against the waves but get brought further and further out to sea. Eventually you become too tired to struggle and just fall to the floor of the ocean, slowly fading from consciousness.");
	
	//CHOICES
	option1.setText("You died!");       //dead
	option2.setText(" ");
	option3.setText(" ");
	option4.setText(" ");	
}

///////END OF DIALOGUES//////////////////////////
	/*
	 * public static void placeholder() {
		
		position = "placeholder";
		
		mainDialogue.setText("");
		//CHOICES
		option1.setText("");
		option2.setText("");
		option3.setText("PlaceHolder");
		option4.setText("PlaceHolder");
		
	}//end XX
	 * 
	 * 
	 */
}//end of class
