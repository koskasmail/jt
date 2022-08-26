package javaCore.a_basic.c_javaBasicVariableStringObject;

public class C_java_BasicVariable_CastingNumbers {

	public C_java_BasicVariable_CastingNumbers() {

		byte byteNumber = 10;
		short shortNumber = 20;
		int intNumner = 30;
		long longNumber = 33l;
		float floatNumber = 12.32F;
		double doubleNumber = 1234.432;

		byte float2byte = (byte) floatNumber;
		int float2int = (int) floatNumber;
		short float2short = (short) floatNumber;
		long double2long = (long) doubleNumber;

		System.out.println(floatNumber + " (casting float to integer) === " + float2int);
	}
}
