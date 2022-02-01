package Section3;

public class Hello {    //the public java keyword is an access modifier.
						//the class keyword is used to define a class with the name following the keyword - Hello in this case.

	public static void main(String[] args) {    //static is needed for java to find our method to run the code we are going to add.
												//A code block is used to define a block of code. It is mandatory to have one in a method declaration.
		System.out.println("Hello, Jon");       //a statement is a complete command to be executed and can include one or more expressions.

		int myFirstNumber = (10 + 5) + (2 * 10);
//		System.out.println(myFirstNumber);

		int mySecondNumber = 12;
//		System.out.println(mySecondNumber);

		int myThirdNumber = myFirstNumber * 2;
//		System.out.println(myThirdNumber);

		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
//		System.out.println(myTotal);

		int myLastOne = 1000 - myTotal;
		System.out.println(myLastOne);
	}
}
