package tasks;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
//		Напишете програма, която чете от конзолата поредица от цели числа 
//		(примерно 5 числа) и отпечатва най-малкото и най-голямото от тях.
		int n = 1;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++){
			System.out.println("Input number: ");
			n = sc.nextInt();
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		sc.close();
		
		
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
	}
}

