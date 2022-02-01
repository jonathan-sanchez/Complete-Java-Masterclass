package Section3;

public class ByteShortIntLong {

	public static void main(String[] args) {

		int myValue = 10000;

		//Int (much larger range, occupies 32 bits - has a width of 32)
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);

		System.out.println();

		//Busted MIN/MAX value
		System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

		//Max int test
		int myMaxIntTest = 2147483647;

		System.out.println();

		//Byte (occupies 8 bits - has a width of 8)

	}
}
