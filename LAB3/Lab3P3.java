//Method Overloading
class Lab3P3{
	public static void main(String...args){
		//Lab3P3 l = new Lab3P3();
		l.display();
		l.display(10);
		l.display("String");
		l.display(10,"String");
		Lab3P3 l = new Lab3P3();
	}
	public void show(){
			System.out.println("Method without Params");
	}
	public void show(int x){
			System.out.println("Method with Int params" +x);
	}
	public void show(String s){
		System.out.println("Method with String params" +s);
	}
	public void show(int x, String s){
		System.out.println("Method with two params int and String" + x +" "+ s);
	}
}
