//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot jere=new Robot("batman");
		jere.setSpeed(100);
		jere.miniaturize();
		jere.penDown();
		//3. Ask the user what color they would like the robot to draw
	String color =	JOptionPane.showInputDialog("What color would you like?");
		//4. Use an if/else statement to set the pen color that the user requested
if(color.equals("red")) {
	jere.setPenColor(255,0,0);
}
if(color.equals("blue")) {
	jere.setPenColor(0,0,255);
}
        //5. If the user doesn’t enter anything, choose a random color
	else{
	jere.setRandomPenColor();
	}
	
	
        //6. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		jere.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
	for(int i = 0; i<=4;i++) {
	jere.move(40);
		jere.turn(90);
	}
	
	
	
	
	
	
	}
	
	
	
	
	
}
	

