package Section3;

public class ByteShortIntLong {

	public static void main(String[] args) {

		int myValue = 10000;

		//Int (much larger range, occupies 32 bits - has a width of 32)
		int myMinIntValue = Integer.MIN_VALUE;      //java uses wrapper classes for all eight primitive types. In case of an int we can use Integer
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
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);

		System.out.println();

		//Short (can store a large range of numbers and occupies 16 bits - width of 16)
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);

		System.out.println();

		//Long
		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);

		System.out.println();

		long bigLongLiteralValue = 2147483647234L;
		System.out.println(bigLongLiteralValue);

		short bigSortLiteralValue = 32767;
	}
}
