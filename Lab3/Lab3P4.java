import java.util.Scanner;

class Lab3P4{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String b = s.nextLine();
		
		Lab3P4 l = new Lab3P4();
		Lab3P4 l1 = new Lab3P4(a);
		Lab3P4 l2 = new Lab3P4(b);
		Lab3P4 l3 = new Lab3P4(a,b);
		l.show(); l1.show(10); l2.show("String"); l3.show(10,"String");
	}
	Lab3P4(){
		System.out.println("Constructor without params");
	}
	Lab3P4(int x){
		System.out.println("Constructor with int params" +x);
	}
	Lab3P4(String b){
		System.out.println("Constructor with String params" +b);
	}
	Lab3P4(int x,String b){
		System.out.println("Constructor with both int and String params" + x +" " + b);
	}
}
