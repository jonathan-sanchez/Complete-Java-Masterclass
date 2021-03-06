package Section3;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {

		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		//Without casting
		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println(longTotal);
		//With casting
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		System.out.println(shortTotal);
	}
}
