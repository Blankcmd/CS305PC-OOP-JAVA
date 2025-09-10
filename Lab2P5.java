import java.util.Scanner;

class Lab2P5{
	public static void main(String...args){
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the a value");
		int a = s.nextInt();
		
		int i=2;
		while(i<0){
		if(a%i == 0)
		prime = false;
		i++;
		}
		if(prime){
			System.out.println("It is a prime number");
			}else{
				System.out.println("It is not a prime number");
			}
  		
	}
}
