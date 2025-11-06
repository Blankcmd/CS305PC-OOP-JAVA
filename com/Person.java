//ABSTRACTION

package Student;

abstract class Person{
	protected String name;
	
	Person(String name){
		this.name = name;
	}
	
	abstract String getDetails();	// abstract method
}

/*	How to Compile:
	---------------
	Command: javac -d . Person.java

	Explanation:
	------------
   	javac  	--  java compiler
   	-d		--  directory
   	. | example	--  current directory
   	
 */
