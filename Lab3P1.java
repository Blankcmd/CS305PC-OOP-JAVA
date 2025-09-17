import java.util.Scanner;
class Lab3P1{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = s.nextInt();
		int i = 2;
		
		while(i < n){
			int j = 2,count = 0;
			 if(i == 2) count++;
			 
			 while(j<i){
			   	if(i%j == 0){
			   	count = 0;
			    	break;
			   }
			    else  
			    	count++;
			        i++;
		}
		if(count > 0) 
			System.out.println("the prime numbers are: " +i);
			i++;
		}
	}
}

