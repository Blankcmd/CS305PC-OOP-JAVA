import java.util.Scanner;
enum Fruit{ 
 										      Apple('a'),Banana('b'),Citrus('c'),DragonFruit('c'),Grapes('d'),Fig('f');
private char a;
Fruit(char a){
	this.a = a;	
	}
	public char get(){
	return a;		 	 	
	}
}
public class Enumex{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	String st = s.next();
	char ch = st.charAt(0);
	ch = Character.toLowerCase(ch);
	for(Fruit f: Fruit.values()){
	if(f.get() == ch)
		System.out.println(f);
		}
	}     	 	
 }
