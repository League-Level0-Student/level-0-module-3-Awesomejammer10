
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 24th";
		String dadsBirthday = "March 19th";
		String myBirthday = "November 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String wantedBday = JOptionPane.showInputDialog("Whose birthday do you want to see?");
		// 3. Print out what the user typed
	System.out.println(wantedBday);
	if(wantedBday.equals("dad")){
		System.out.println(dadsBirthday);
	}
	else if(wantedBday.equals("mom")){
		System.out.println(momsBirthday);
	}
	
	else	if(wantedBday.equals("jeremy")){
			System.out.println(myBirthday);
		}
		else {
		JOptionPane.showMessageDialog(null, "Sorry! I don't have that one.");
		}
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 

