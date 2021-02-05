package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int number1 = 0;
	int number2 = 1;
	for(int sum = 1; sum <= 10; sum+=1) {
	int Sum = number1 + number2;
	System.out.println(Sum);
		number1 = number2;
		number2 = Sum;
	}
}
}
