JAVA PROGRAMMING

INSTAL
	1. Install java and make sure it's up to date
	2. java.sun.com
		Downloads
			- Java JDK ( Java Development Kit, SE: Standard Edition, EE: Enterprise Edition ... )
		Install
			- yes check the boxes and stuff

	( The JDK is like a Java Compiler. )

	3. Configure

		Environmental Properties / path. add: ( Control Panel\All Control Panel Items\System )

			C:\Program Files\Java\jdk1.7.0_25\bin

	4. ECLIPSE for JAVA PROGRAMMING
		( Eclipse makes it easy to develop java applications )
		It has error handling and compiles and runs.

		1. https://eclipse.org/downloads/index.php

			EE: IDE JAVA Developers

		2. new Java Project 
		3. right click on src folder and new/class
		4. yes add java and click run!

		5. configure for line error debugging
			window / preferences / general / editor / text editor / show line editor / checkit


CMD

	1. javac

	Quick test:
		
		1. test1.java
		2. cd to test1.java

		Compile Java

		3. javac test1.java

		Run / Execute
 
		4. java test1


JAVA BEGINNERS

	1. All Java apps need a class
	2. All classes need a main method

	3. Method headers:
		
		public static void main(String args[]){

	4. Variables

		double name; (is has numbers on left and right of decimal)

		int a, b, c;         // Declares three ints, a, b, and c.
		int a = 10, b = 10;  // Example of initialization
		byte B = 22;         // initializes a byte type variable B.
		double pi = 3.14159; // declares and assigns a value of PI.
		char a = 'a';        // the char variable a iis initialized with value 'a'

	5. Print

		System.out.print(dec);
		System.out.println(" cars");
		System.out.printf("Your first pet was %s", arg);

	6. SCANNER

		Java built in plugin
			- it captures the users input
			import java.util.Scanner;
	
		code:
			Scanner name = new Scanner(System.in);
			System.out.println(name.nextLine());

			name.nextDouble() ( for numbers )
			name.nextLine() ( for strings )
			name.nextInt() ( guess... ) 

	7. Math

		% modulous is used for remainder. literally returns remainder.
		ex. 3/7 with int will equal 2
			3 % 7 with int will return 1.

		COUNTER

			increments after i is rendered  : i++
			increments before i is rendered : ++i

			i += 5;

	8. CONDITIONS

		if(){
		}
		else if(fnum == 2 && condition || condition){
		}else{
		}

		switch statement 

			switch()
				case 
				default
					break;

		CONDITION 			TRUE		FALSE
		variable > 12 ?   "yes"     :   "no"

	9. loops

		1.
			for (int i=0; i < 10; i++){

			}

		2. 
			int counter = 0;
			do{
				// do stuff
			}
			while(counter < 10);

		3. 
			int counter = 0;
			while(counter < 10){
				//do stuff
			}

	10. Constructor method

		needs to be the same as the class name


	11. toString

			whenever you have a toString method as below:
				System.out.printf("%s", this);
			It uses this method:
				public String toString(){
					return String.format("%d,%s", 22, "hey");
				}

	12. COMPOSITION

		references to other objects in other classes

	13. ENUMERATION

			kind of like classes. they declare constants 

			public enum class1{

				object1("cool", "mon"),
				object2("warm", "sat"),
				object3("hot", "tues");

				private final String we;
				private final String d;


				class1(String weather, String day)
				{
					we = weather;
					d = day;
				}

				public String getWe(){
					return we;
				}

				public String getD(){
					return d;
				}
			}



			package composition;

			import java.util.EnumSet;

			public class app {

				public static void main(String[] args) {
					class2 class2obj1 = new class2(2,3,4);
					class1 class1obj1 = new class1("frisco", class2obj1 );
					System.out.println(class1obj1);
					
					
					System.out.println();
					for( classEnum object: classEnum.values()){
				//			System.out.println(object);
				//			System.out.println(object.getWe());
				//			System.out.println(object.getD());
						System.out.printf("object: %s\t weather: %s\tday: %s",object, object.getWe(), object.getD() );
						System.out.println();
					}
					System.out.println();	
					for( classEnum object: EnumSet.range(classEnum.object2, classEnum.object5 )){
						System.out.printf("object: %s\t weather: %s\tday: %s",object, object.getWe(), object.getD() );
						System.out.println();
					}
				}

			}


	14. STATIC

		Static will change that value for all instances of that class

			public class class1{
				private String first;
				private String last;
				private static int members;
			}

	15. FINAL

		when a variable is set to final, the variable will always be set to that number. FOREVER!!!
		
		ex. 1
			private final int NUMBER = 2;

		ex. 2
			private final int NUMBER;

			public class1(int x){
					NUMBER = x;
			}


	16. INHERITANCE

		ONLY PUBLIC METHODS CAN BE INHERITATED .... DUH!


		public class superClass{
			public void method(){
				System.out.println("i am a method son!");
			}
		}


			public class subClass1 extends superClass{
				// has superclass methods
			}
			public class subClass2 extends superClass{
				// you overrided this method
				public void method(){
					System.out.println("i am a method son!");
				}

			
			}


		public static void main(String[] args) {

			subClass1 class1 = new subClass1();
			subClass1 class2 = new subClass2();


		}


	17. CONVERT


		int num1 = Integer.parceInt(fn);
		int num2 = Integer.parceInt(sn);


	18. GUI

		A.  import javax.swing.JOptionPane;
			import java.awt.FlowLayout;
			import javax.swing.JFrame;
			import javax.swing.JLabel;


	19. Polymorphism

		when java compiles a class instance...

			class1 test1 = new class1();
			class1 test2 = new class1();
			
			class2 test1 = new class2();
			class2 test2 = new class2();

			superClass test1 = new class1();
			superClass test2 = new class1();
			superClass test1 = new class2();
			superClass test2 = new class2();

		yeah I just did that.

		
		A. Overriding Method rules

			When using polymorphism all methods in sub classes need 
			to be consistent with the superclasses.

			ex. a method returns a string in the superclass
			ex. a method takes an int as a parameter
			ex. public, private

		CLASSES

			"abstract" before the superClass
				you cannot add an object to the class. this is used for superclasses
				the sole purpose is for superclass, INHERITANCE

			"concrete" class is specific enough to make objects and define stuff

		METHODS

			"abstract" methods are methods in superclass that must be over-written
					
					abstract class superClass{
						public abstract void eat();			
					}

					subclasses need to have public methods!!!

					
		ADAPTER CLASS

			allows you to not have to override all methods in a class when you implement or inherit it.

		EXCEPTION HANDLING ( AKA Error handling )


	STRINGS

		Sting a = "hey";
		String b = "HEY";
		a.length() = 3
		a.equals(b) returns false
		a.equalsIgnoreCase(b) returns true


	Recursion

		a method that calls itself

		5! (5x4x3x2x1)

	Collections

		Is like an arrray that holds dynamic stuff
		
		set
		list
		Iterator goes through arrays item by item


	Stack

		is like a stack of dishes
		pushing is like putting a dish on the stack
		poping is like taking a dish off the stack

	Queue

		line at the grocery store
		like apster downloads

	Applet
		use a java app through yo browser


		
