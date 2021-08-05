package adventure;

import java.util.*;
import javax.swing.border.*;
import javax.swing.*;
import java.beans.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class titleScreenButton implements ActionListener{
	
	static titleScreenButton titleScreen = new titleScreenButton();

	public static void main(String[] args) {


	}//end main
	
	public void actionPerformed(ActionEvent e) {
		
		//DEV USE ONLY
		System.out.println("Button is functional");
		//END DEV USE ONLY
		
		mainGame.gamePlay();
		
	}//end event

}//end class
