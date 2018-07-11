
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "december 22th";
		String dadsBirthday = "november 30th ";
		String myBirthday = "december 7th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String birthday= JOptionPane.showInputDialog(null, ("which birthday do u want use?"));

		// 3. Print out what the user typed
		System.out.println(birthday);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equals("momsBirthday")) {
			JOptionPane.showMessageDialog(null,("december 22nd"));
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birthday.equals("dadsBirthday")) {
			JOptionPane.showMessageDialog(null,("november 30th"));
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (birthday.equals("myBirthday")) {
			JOptionPane.showMessageDialog(null,("december 7th"));
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null," sorry i dont remember that person's birthday!" );
		}
	} 
}
