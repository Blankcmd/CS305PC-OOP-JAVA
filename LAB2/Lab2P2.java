import java.util.Scanner;
class Lab2P2{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int y = a;
		System.out.println("Output is:"+ a++ + ++a);
		a = y;
		System.out.println("Output is:"+ (a++ + ++a));
		a = y;
		System.out.println(a++ + ++a+": Output is:");				
	}
}
