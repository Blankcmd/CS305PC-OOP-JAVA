import java.util.Scanner;

class Lab3P2{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = s.nextInt();
		int i = 2;
		do{
			int j = 2, count = 0;
			do{
				if(i == 2){
					count++;
					j++;
					continue;
					}
					if(i % j == 0){
						count = 0;
						break;
						}
						else
						count++;
						j++;
					}
					while(j<i);
					if(count > 0)
						System.out.println(i);
						i++;
				}
				while(i<n);
			}
		}
