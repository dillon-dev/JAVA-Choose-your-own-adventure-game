package adventure;

import java.util.*;
import javax.swing.border.*;
import javax.swing.*;
import java.beans.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class choiceButtons implements ActionListener{
	
	static choiceButtons choiceButtons = new choiceButtons();

	public static void main(String[] args) {
		
		

	}//end main
	
	public void actionPerformed(ActionEvent e) {
		
		//DEV USE ONLY
		System.out.println("Button is functional");
		//END DEV USE ONLY
		
		String optionButtonResult = e.getActionCommand();//WILL GET THE ACTION COMMAND STRING FROM BUTTONS 1 2 3 4
		
		switch(mainGame.position) {
		
		//////////////START OF OPTIONS///////////
		/*
		 * THE TEMPLATE FOR THIS SECTION IS AS FOLLOWS:
		 * 
		 * case "NAME_OF_POSITION": //SEE MAINGAME.JAVA LINE 245 FOR EXPLINATION
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.NAME_OF_PATH1(); break;
			case "Command2":mainGame.NAME_OF_PATH2(); break;
			case "Command3":mainGame.NAME_OF_PATH3(); break;
			case "Command4":mainGame.NAME_OF_PATH4(); break;
			
			}//end switch case NAME_OF_POSITION
			 break;
			
		 * YOU MUST KEEP MAINGAME IN THE case "Command1":mainGame.startNorth(); break; LINES BECAUSE MAINGAME IS THE CLASS WHERE THESE METHODS (STARTNORTH()) ETC ARE STORED
		 * YOU MUST break; AFTER EVERY SWITCH STATEMENT OR THE CODE WILL NOT WORK
		 * 
		 */
		
		//MORE OF THESE NEED TO BE WORKED ON AND THEY NEED TO BE FILED IN A LOGICAL ORDER
		
		case "start":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.startNorth(); break;
			case "Command2":mainGame.startEast(); break;
			case "Command3":mainGame.startSouth(); break;
			case "Command4":mainGame.startWest1(); break;
			
			}//end switch case START
			
			break;
			
		case "startEast":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.Oxen(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			case "Command2":mainGame.eastEast(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			case "Command3":mainGame.SE(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			case "Command4":mainGame.backToStart(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "Oxen":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.OxenDeath(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			case "Command2":mainGame.OxenDeath(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.SE(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.start(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "OxenDeath":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.death(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.OxenDeath(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.SE(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.start(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "bar1":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.bar2(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			case "Command2":mainGame.bar3(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			case "Command3":mainGame.townNorth(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.townNorth(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "bar1smallgoblin":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townNorth(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.bar3(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.townNorth(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.townNorth(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "bar1adultgoblin":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townNorth(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.bar3(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.townNorth(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.townNorth(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "bar1wolf":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townNorth(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.bar3(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.townNorth(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.townNorth(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "bar1mino":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townNorth(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.bar3(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.townNorth(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.townNorth(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "bar2":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.bar1(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.OxenDeath(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.SE(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.townNorth(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "bar3":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.bar1(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.OxenDeath(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.SE(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.townNorth(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "death":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.start(); break; //THIS SECTION NEEDS TO BE CHANGED, IT'S JUST A DEMONSTRATION
			//case "Command2":mainGame.eastEast(); break; //THESE ARE THE START METHODS, OBVIOUSLY YOU'VE ALREADY GONE EAST IN THIS SITUATION SO YOU DON'T NEED TO START AGAIN
			//case "Command3":mainGame.SE(); break; //THE WAY YOU EDIT THESE IS BY MAKING NEW public static void NAME_OF_PATH() METHODS IN THE MAINGAME.JAVA, SEE MAINGAME.JAVA LINE 243 FOR TUTORIAL
			//case "Command4":mainGame.start(); break;
			
			}//end switch case STARTEASt
			
			break;
			
		case "eastEast":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townSouth(); break; 
			case "Command2":mainGame.guardDeath(); break; 
			case "Command3":mainGame.townSouth(); break; 
			case "Command4":mainGame.startEast(); break;
			
			}//end switch case eastEast
			
			break;
			
		case "eastEastnotalk":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townSouth(); break; 
			case "Command2":mainGame.startEast(); break; 
			//case "Command3":mainGame.townSouth(); break; 
			//case "Command4":mainGame.startEast(); break;
			
			}//end switch case eastEast
			
			break;
			
		case "guardDeath":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.death(); break; 
			//case "Command2":mainGame.placeholder(); break; 
			//case "Command3":mainGame.townSouth(); break; 
			//case "Command4":mainGame.startEast(); break;
			
			}//end switch case eastEast
			
			break;
			
		case "deadBegger":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townSouth(); break; 
			//case "Command2":mainGame.placeholder(); break; 
			//case "Command3":mainGame.townSouth(); break; 
			//case "Command4":mainGame.startEast(); break;
			
			}//end switch case eastEast
			
			break;
			
		case "placeholder":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.death(); break;
			case "Command2":mainGame.death(); break; 
			case "Command3":mainGame.death(); break;
			case "Command4":mainGame.death(); break;
			
			}//end switch case eastEast
			
			break;
			
		case "startWest":
					
			switch(optionButtonResult) {
			
			case "Command1":mainGame.placeholder(); break;
			case "Command2":mainGame.placeholder(); break; 
			case "Command3":mainGame.placeholder(); break;
			case "Command4":mainGame.placeholder(); break;
			
			}//end switch case eastEast
			
			break;
			
		case "townSouth":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.townNorth(); break; //head to north of town
			case "Command2":mainGame.BS1(); break; //go to blacksmith
			case "Command3":mainGame.tBeggar1(); break; //THERE ARE THREE DIFFERENT PLACES YOU CAN BE SENT TO, tBeggar1 IS WITH NOTHING, tBeggar2 is with rust sword, tBeggar 3 is with baguette
			case "Command4":mainGame.eastEast(); break; //to plains
			
			}//end switch case eastEast
			
			break;
			
			case "townNorth":
			
			switch(optionButtonResult) {
			
			case "Command1":mainGame.startForest1(); break; //forest
			case "Command2":mainGame.bar1(); break; //tavern
			case "Command3":mainGame.townSouth(); break; //south town
			//case "Command4":mainGame.empty(); break; //empty
			
			}//end switch case eastEast
			
			break;
			
			case "startForest1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFNorth1(); break; //north
				case "Command2":mainGame.sFEast1(); break; //east
				case "Command3":mainGame.sFWest1(); break; //west
				case "Command4":mainGame.townNorth(); break; ////south
				
				}//end switch case eastEast
				
				break;
				
			case "startForest2":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.townNorth(); break; //north
				case "Command2":mainGame.startForest3(); break; //east
				//case "Command3":mainGame.sFWest1(); break; //west
				//case "Command4":mainGame.townNorth(); break; ////south
				
				}//end switch case eastEast
				
				break;
				
			case "startForest3":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFNorth1(); break; //north
				case "Command2":mainGame.sFEast1(); break; //east
				case "Command3":mainGame.sFWest1(); break; //west
				case "Command4":mainGame.townNorth(); break; ////south
				
				}//end switch case eastEast
				
				break;
				
			case "startForest3noguard":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFNorth1(); break; //north
				case "Command2":mainGame.sFEast1(); break; //east
				case "Command3":mainGame.sFWest1(); break; //west
				case "Command4":mainGame.townNorth(); break; ////south
				
				}//end switch case eastEast
				
				break;
				
			case "dietoforestguard":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //north
				//case "Command2":mainGame.sFEast1(); break; //east
				//case "Command3":mainGame.sFWest1(); break; //west
				//case "Command4":mainGame.townNorth(); break; ////south
				
				}//end switch case eastEast
				
				break;
				
			case "sFNorth1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.snakeFight(); break; //attack
				case "Command2":mainGame.startForest1(); break; //retreat
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFNorth1snakedead":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.townSouth(); break; //attack
				//case "Command2":mainGame.startForest1(); break; //retreat
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFNorth1killsnake":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startForest1(); break; //attack
				case "Command2":mainGame.townSouth(); break; //retreat
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFNorth1dietosnake":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //attack
				//case "Command2":mainGame.startForest1(); break; //retreat
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "bar1serp":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.townNorth(); break; //attack
				//case "Command2":mainGame.startForest1(); break; //retreat
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFEast1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFEast2(); break; //left
				case "Command2":mainGame.sFEast3(); break; //right
				case "Command3":mainGame.startForest1(); break; //back
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFEast2":
					
					switch(optionButtonResult) {
					
					case "Command1":mainGame.startForest1(); break; //back
					//case "Command2":mainGame.empty(); break; //BLANK
					//case "Command3":mainGame.empty(); break; //BLANK
					//case "Command4":mainGame.empty(); break; //BLANK
					
					}//end switch case eastEast
					
					break;
					
			case "sFEast3":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFEast4(); break; //ATTACK
				case "Command2":mainGame.startForest1(); break; //BACK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFEast3goblindead":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startForest1(); break; //ATTACK
				//case "Command2":mainGame.startForest1(); break; //BACK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFEast4": //VICTORY VS GOBLIN
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startForest1(); break; //return
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}//end switch case eastEast
				
				break;
				
			case "sFEast4die": //DEATH VS GOBLIN
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //dead
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFEast4killgoblin": //kill VS GOBLIN
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startForest1(); break; //dead
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWest1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFWestL1(); break; //left
				case "Command2":mainGame.sFWestM1(); break; //forward
				case "Command3":mainGame.sFWestR1(); break; //right
				case "Command4":mainGame.startForest1(); break; //back
				
				}
				
				break;
				
			case "sFWestL1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFWestL2(); break; //attack
				case "Command2":mainGame.startForest1(); break; //back
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestL1goblindead":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFWestL1(); break; //attack
				case "Command2":mainGame.startForest1(); break; //back
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestL2": //VICTORY VS GOBLIN
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startForest1(); break; //VICTORY
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestL2death": //death VS GOBLIN
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //VICTORY
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestL3": //DEATH VS GOBLIN
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //RESTART
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestM1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFWestM2(); break; //attack
				case "Command2":mainGame.sFWest1(); break; //back
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestM1minodead":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFWest1(); break; //attack
				case "Command2":mainGame.sFWest1(); break; //back
				////case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestM2": //VICTORY VS MINOTAUR
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.townSouth(); break; //back
				///case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestM3": //DEATH VS MINOTAUR
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //RESTART
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestM2dead": //DEATH VS MINOTAUR
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //RESTART
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestR1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFWestR3(); break; //approach wolf
				case "Command2":mainGame.sFWest1(); break; //back
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestR2": //VICTORY VS WOLF
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.sFWest1(); break; //back
				//case "Command2":mainGame.empty(); break; //back
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "sFWestR3": //DEATH VS WOLF
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //back
				//case "Command2":mainGame.empty(); break; //back
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				
				break;
				
			case "startWest1": //PLAYS IF YOU HAVE TOP STATS
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.West1(); break; //forward
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "startWest2": //PLAYS IF YOU HAVE LESS THAN TOP STATS
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.backToStart(); break; //continue
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "W1": 

                switch(optionButtonResult) {

                case "Command1":mainGame.WN1(); break; //north
                case "Command2":mainGame.WW1(); break; //west
                case "Command3":mainGame.WS1(); break; //plant
                case "Command4":mainGame.backToStart(); break; //back

                }
                break;
                
			case "WN1": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.WN2(); break; //examine lake
				case "Command2":mainGame.WN3(); break; //straight for sword
				case "Command3":mainGame.West1(); break; //back
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}
				break;
			case "WN2": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.West1(); break; //BACK
				//case "Command2":mainGame.empty(); break; //BLANK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WN3": //DEATH
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //BLANK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WS1": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.WS1Plant(); break; //DEATH
				case "Command2":mainGame.West1(); break; //BLANK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WS1Plant": //DEATH
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //BLANK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WW1": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.WW2(); break; //DEATH
				case "Command2":mainGame.West1(); break; //BACK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WW1amuletowned": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.West1(); break; //DEATH
				//case "Command2":mainGame.West1(); break; //BACK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WW2": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.WW3(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //BACK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WW3": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.WW4(); break; //draw sword
				case "Command2":mainGame.WW6(); break; //speak 
				case "Command3":mainGame.WW5(); break; //run
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WW4": //death vs sphinx
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}	break;	
				
			case "WW5": //death vs sphinx
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //BLANK 
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}	break;
				
			case "WW6":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.WW7(); break; //attempt riddle
				case "Command2":mainGame.WW8(); break; //DEATH
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "backToStart":
				
				switch(optionButtonResult) {
							
				case "Command1":mainGame.startNorth(); break;
				case "Command2":mainGame.startEast(); break;
				case "Command3":mainGame.startSouth(); break;
				case "Command4":mainGame.startWest1(); break;
				
				}//end switch case START 
				break;
				
			case "WW7":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.WW8(); break; //Death
				case "Command2":mainGame.WW9(); break; //Life
				case "Command3":mainGame.WW8(); break; //Death
				case "Command4":mainGame.WW5(); break; //DEATH
				
				}	break;
				
			case "WW8":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "WW9":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.townSouth(); break; //GAIN AMULET 
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "startNorth":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.N1(); break; //continue
				case "Command2":mainGame.backToStart(); break; //go back
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "N1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.N2(); break; //DEFEND
				case "Command2":mainGame.N4(); break; //RUN AWAY
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "N2": //DEATH VS WOLVES
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //respawn
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "N3": //victory VS WOLVES
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.N5(); break; //continue
				//case "Command2":mainGame.empty(); break; //BLANK
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "N4": //DIE RUNNING FROM WOLVES
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //respawn
				//case "Command2":mainGame.empty(); break; //RUN AWAY
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "N1wolfdead": //wolf already dead
			
				switch(optionButtonResult) {
				
				case "Command1":mainGame.townSouth(); break; //respawn
				case "Command2":mainGame.N5(); break; //RUN AWAY
				//case "Command3":mainGame.empty(); break; //BLANK
				//case "Command4":mainGame.empty(); break; //BLANK
				
				}break;
				
			case "N5": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.N8(); break; //NORTH
				case "Command2":mainGame.N6(); break; //BEAR
				case "Command3":mainGame.NC1(); break; //CAVE
				case "Command4":mainGame.startNorth(); break; //BACK
				
				}break;
				
			case "N6": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.N7(); break; //STARTLE BEAR
				case "Command2":mainGame.N5(); break; //BACK
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "N7": //DIE VS BEAR
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //RESPAWN
				//case "Command2":mainGame.empty(); break; //empty
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "N8":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.N5(); break; //back
				//case "Command2":mainGame.empty(); break; //empty
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "NC1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.NC2(); break; //CONTINUE
				case "Command2":mainGame.N5(); break; //BACK
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "NC2":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.NC3(); break; //PLACE AMULET
				case "Command2":mainGame.N5(); break; //BACK
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "NC2noamulet":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.townSouth(); break; //PLACE AMULET
				//case "Command2":mainGame.N5(); break; //BACK
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "NC3":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.NC4(); break; //PROCEED
				case "Command2":mainGame.NC1(); break; //BACK
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "NC4":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.NC5(); break; //PROCEED
				case "Command2":mainGame.NC3(); break; //BACK
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "NC5":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.victory(); break; //VICTORY
				case "Command2":mainGame.NC6(); break; //LOSE GAME
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "NC6":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //empty
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "victory":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.start(); break; //DEATH
				//case "Command2":mainGame.empty(); break; //empty
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "startSouth":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.backToStart(); break; //back
				case "Command2":mainGame.SE(); break; //east
				case "Command3":mainGame.SS1(); break; //south enter water
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "SE":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startEast(); break; //back
				case "Command2":mainGame.startSouth(); break; //east
				case "Command3":mainGame.SE1(); break; //south enter water
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "SE1":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startEast(); break; //back
				case "Command2":mainGame.SE2(); break; //into water
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "SE2":
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.SE1(); break; //back
				case "Command2":mainGame.SE3(); break; //into water
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "SE3": //DIE IN WATER
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //RESPAWN
				//case "Command2":mainGame.empty(); break; //empty
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "SS1": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.startSouth(); break; //back
				case "Command2":mainGame.SS2(); break; //deeper
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "SS2": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.SS1(); break; //back
				case "Command2":mainGame.SS3(); break; //deeper
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "SS3": //DIE TO WATER
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.death(); break; //respawn
				//case "Command2":mainGame.empty(); break; //empty
				//case "Command3":mainGame.empty(); break; //empty
				//case "Command4":mainGame.empty(); break; //empty
				
				}break;
				
			case "BS1": //blacksmith 1
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS2(); break;	//weapons menu
				case "Command2":mainGame.BS3(); break;	//armour menu
				case "Command3":mainGame.townSouth(); break;
				//case "Command4":mainGame.placeholder(); break;
				
				}break;
				
			case "BS2": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BSpurchaseLevel1Wep(); break;	//deduct 5 gold and add level 1 wep
				case "Command2":mainGame.BSpurchaseLevel2Wep(); break;	//deduct 10 gold and add level 2 wep
				case "Command3":mainGame.BSpurchaseLevel3Wep(); break;	//deduct 15 gold and add level 3 wep
				case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BSpurchaseLevel1Wep": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS1(); break;	//deduct 5 gold and add level 1 wep
				//case "Command2":mainGame.BS4(); break;	//deduct 10 gold and add level 2 wep
				//case "Command3":mainGame.BS4(); break;	//deduct 15 gold and add level 3 wep
				//case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BSpurchaseLevel2Wep": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS1(); break;	//deduct 10 gold and add level 2 wep
				//case "Command2":mainGame.BS4(); break;	//deduct 10 gold and add level 2 wep
				//case "Command3":mainGame.BS4(); break;	//deduct 15 gold and add level 3 wep
				//case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BSpurchaseLevel3Wep": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS1(); break;	//deduct 15 gold and add level 3 wep
				//case "Command2":mainGame.BS4(); break;	//deduct 10 gold and add level 2 wep
				//case "Command3":mainGame.BS4(); break;	//deduct 15 gold and add level 3 wep
				//case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BSpurchaseLevel1Arm": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS1(); break;	//deduct 5 gold and add level 1 wep
				//case "Command2":mainGame.BS4(); break;	//deduct 10 gold and add level 2 wep
				//case "Command3":mainGame.BS4(); break;	//deduct 15 gold and add level 3 wep
				//case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BSpurchaseLevel2Arm": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS1(); break;	//deduct 10 gold and add level 2 wep
				//case "Command2":mainGame.BS4(); break;	//deduct 10 gold and add level 2 wep
				//case "Command3":mainGame.BS4(); break;	//deduct 15 gold and add level 3 wep
				//case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BSpurchaseLevel3Arm": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS1(); break;	//deduct 15 gold and add level 3 wep
				//case "Command2":mainGame.BS4(); break;	//deduct 10 gold and add level 2 wep
				//case "Command3":mainGame.BS4(); break;	//deduct 15 gold and add level 3 wep
				//case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BS3": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BSpurchaseLevel1Arm(); break;	//deduct 5 gold and add level 1 armour
				case "Command2":mainGame.BSpurchaseLevel2Arm(); break;	//deduct 10 gold and add level 2 armour
				case "Command3":mainGame.BSpurchaseLevel3Arm(); break;	//deduct 15 gold and add level 3 armour
				case "Command4":mainGame.BS1(); break;
				
				}break;
				
			case "BS4": 
				
				switch(optionButtonResult) {
				
				case "Command1":mainGame.BS1(); break;	//Thank you come again and return to the convo
				//case "Command2":mainGame.BS4(); break;	//deduct 10 gold and add level 2 armour
				//case "Command3":mainGame.BS4(); break;	//deduct 15 gold and add level 3 armour
				//case "Command4":mainGame.BS1(); break;
				
				}break;
				

			case "tBeggar1": 
	
				switch(optionButtonResult) {
	
				case "Command1":mainGame.tBeggar2(); break; //aggressive 
				case "Command2":mainGame.tBeggar4(); break; //polite
				case "Command3":mainGame.tBeggar5(); break;	//removes 1 coin
				case "Command4":mainGame.townSouth(); break;
	
				}break;
	
			case "tBeggar2": 
	
				switch(optionButtonResult) {
	
				case "Command1":mainGame.tBeggar3(); break; //depends on weapon
				case "Command2":mainGame.townSouth(); break; 
				//case "Command3":mainGame.tBeggar8(); break;	//removes 1 coin
				//case "Command4":mainGame.townSouth(); break;
	
				}break;
	
			case "tBeggar3IronDagger": 
	
				switch(optionButtonResult) {
	
				case "Command1":mainGame.townSouth(); break;
				//case "Command2":mainGame.tBeggar4(); break;
				//case "Command3":mainGame.tBeggar8(); break;	//removes 1 coin
				//case "Command4":mainGame.townSouth(); break;
	
				}break;
				
			case "tBeggar3IronSword": 
				
				switch(optionButtonResult) {
	
				case "Command1":mainGame.townSouth(); break;
				//case "Command2":mainGame.tBeggar4(); break;
				//case "Command3":mainGame.tBeggar8(); break;	//removes 1 coin
				//case "Command4":mainGame.townSouth(); break;
	
				}break;
				
			case "tBeggar3IronGreatsword": 
				
				switch(optionButtonResult) {
	
				case "Command1":mainGame.townSouth(); break;
				//case "Command2":mainGame.tBeggar4(); break;
				//case "Command3":mainGame.tBeggar8(); break;	//removes 1 coin
				//case "Command4":mainGame.townSouth(); break;
	
				}break;
				
			case "tBeggar3Death": 
				
				switch(optionButtonResult) {
	
				case "Command1":mainGame.death(); break;
				//case "Command2":mainGame.tBeggar4(); break;
				//case "Command3":mainGame.tBeggar8(); break;	//removes 1 coin
				//case "Command4":mainGame.townSouth(); break;
	
				}break;
	
			case "tBeggar4": 
	
				switch(optionButtonResult) {
	
				case "Command1":mainGame.death(); break;
				//case "Command2":mainGame.tBeggar(); break;
				//case "Command3":mainGame.tBeggar(); break;
				//case "Command4":mainGame.tBeggar(); break;
	
				}break;
	
			case "tBeggar5": 
	
				switch(optionButtonResult) {
	
				case "Command1":mainGame.townSouth(); break;	//DEAD
				//case "Command2":mainGame.tBeggar(); break;
				//case "Command3":mainGame.tBeggar(); break;
				//case "Command4":mainGame.tBeggar(); break;
	
				}break;
				
		}//end switch position
		
		//////////////END OF OPTIONS////////////////////////
		
	}//end of event

}//end class


