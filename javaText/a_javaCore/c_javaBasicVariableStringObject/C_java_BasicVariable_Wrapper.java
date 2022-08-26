package javaCore.a_basic.c_javaBasicVariableStringObject;

public class C_java_BasicVariable_Wrapper {

	public C_java_BasicVariable_Wrapper() {

		int primitivesInt = 55;
		Integer ObjectIntOne = Integer.valueOf(primitivesInt);

		Integer ObjectIntTwo = ObjectIntOne;
		System.out.println("\n");
		System.out.println("Wrapper Examples - int-to-Integer");
		System.out.println(primitivesInt + " " + ObjectIntOne + " " + ObjectIntTwo);
	}
}
