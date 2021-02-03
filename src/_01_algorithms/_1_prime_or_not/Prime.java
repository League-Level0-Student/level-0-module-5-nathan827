package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Please type a number");
int Number = Integer.parseInt(number);
for(int prime = 2; prime < Number; prime+=1) {
	if(Number % prime == 0) {
		JOptionPane.showMessageDialog(null, "That number is not prime");
	}
	else {
		JOptionPane.showMessageDialog(null, "That number is prime");
	}
}
}
}
