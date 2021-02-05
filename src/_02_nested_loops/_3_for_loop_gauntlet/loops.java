package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class loops {
public static void main(String[] args) {
	for(int number = 0; number <= 100; number += 1) {
		System.out.println(number);
	}
	for(int number =  100;number >= 0; number -= 1) {
		System.out.println(number);
	}
	for(int number = 1; number <= 100; number += 1) {
		
		if(number % 2 == 0) {
			System.out.println(number);
		}
}
	for(int number = 1; number <= 100; number += 1) {
if(number % 2 == 1) {
	System.out.println(number);
}
	}
	for(int number = 1; number <= 500; number += 1) {
		if(number % 2 == 0) {
			System.out.println(number + " is even");
		}
		else {
			System.out.println(number + " is odd");
		}
	}
	for(int number = 7; number <= 777; number += 7) {
		System.out.println(number);
	}
	String age = JOptionPane.showInputDialog("How old are you?");
	int Age = Integer.parseInt(age);
	for(int number = 0; number <= Age; number += 1) {
		int year = 2021 - Age+number;
		
		System.out.println("In " +year+", I was " +number+" years old.");
	}
	
	
}
}
