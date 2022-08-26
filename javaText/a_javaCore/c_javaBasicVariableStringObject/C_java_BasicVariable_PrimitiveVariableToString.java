package javaCore.a_basic.c_javaBasicVariableStringObject;

public class C_java_BasicVariable_PrimitiveVariableToString {

	public C_java_BasicVariable_PrimitiveVariableToString() {
		int intNumber = 123;
		String StringVal;

		StringVal = Integer.toString(intNumber); // Integer to String
		System.out.println("primitiveVariableToString >>> Integer to String >>> " + StringVal);
	}
}
