package tasks;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
//		Напишете програма, която отпечатва 
//		на конзолата числата от 1 до N. Числото N се въвежда от конзолата.
		
		int num = 1;
		System.out.println("Input number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		while (num <= n) {
			System.out.println(num);
			num++;
			}
		}
	}

