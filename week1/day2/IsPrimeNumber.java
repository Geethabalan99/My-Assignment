package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int Num=100;
		
		if (Num<=1) {
			System.out.println(Num+" "+"is not a prime number");
			return;
		}
	   for (int i = 2; i <=Num; i++) {
		   if (Num%2==0) {
			   System.out.println(Num+" "+"is not a prime number");
			return;
		
		}
		   System.out.println(Num+" "+"is a prime number");
		   
		
	}
		
		
		}
	}


