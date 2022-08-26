package javaCore.a_basic.c_javaBasicVariableStringObject;

public class C_java_BasicVariable_StringToPrimitiveVariable {

	public C_java_BasicVariable_StringToPrimitiveVariable() {
		
		String StringVal = "321";
		int intNumber = 0;

		intNumber = Integer.parseInt(StringVal); //String to integer
		System.out.println("StringToPrimitiveVariable >>> String to Integer >>> " + intNumber);
	}
}
