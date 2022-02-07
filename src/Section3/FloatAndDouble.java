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
	}
}
