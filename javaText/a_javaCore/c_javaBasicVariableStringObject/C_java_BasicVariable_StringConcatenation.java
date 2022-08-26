package javaCore.a_basic.c_javaBasicVariableStringObject;

public class C_java_BasicVariable_StringConcatenation {

	public C_java_BasicVariable_StringConcatenation() {
		
		// Declare String variable and assign then a string value
		String stFullName = "", stFirstName = "yaki", stLastName = "maki";
		String stConcatenation = "This is a ";

		// String Concatenation - adding 2 string variable to create a new string
		// variable using the + (plus operator)
		stFullName = stLastName + ", " + stFirstName;

		// print the new string
		System.out.println("My Name is: " + stFullName);

		stConcatenation += " stConcatenation *** ";
		System.out.println(stConcatenation);
	}

}
