package Section3;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {

		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;

		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println(longTotal);
	}
}
