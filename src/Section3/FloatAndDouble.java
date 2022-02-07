package Section3;

public class FloatAndDouble {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Minimum Value = " + myMinFloatValue);
		System.out.println("Float Maximum Value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Minimum Value = " + myMinDoubleValue);
		System.out.println("Double Maximum Value = " + myMaxFloatValue);

		int myIntValue = 5;
//		float myFloatValue = (float) 5.25; //Example of using casting to correct an error
		float myFloatValue = 5f;
		double myDoubleValue = 5d;

		//Challenge
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Converted Kilograms = " + convertedKilograms);

		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(anotherNumber);
	}
}
