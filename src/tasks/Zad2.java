package tasks;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

//		Напишете програма, която отпечатва на конзолата 
//		числата от 1 до N, които не се делят на 3 и 7. 
//		Числото N се въвежда от конзолата.
		
		int num = 1;
		System.out.println("Input number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(num=1; num<=n; num++){
			if((num % 3 != 0) && (num % 7 != 0)) {
				System.out.println(num);
			}
		}
	}
}
