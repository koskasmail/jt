package javaCore.a_basic.c_javaBasicVariableStringObject;

public class C_java_BasicVariable_GenerateRandomNumber {

	public C_java_BasicVariable_GenerateRandomNumber() {
		GenerateRandomNumber(99);
	}

	public void GenerateRandomNumber(int intMaxNumber) {
		int intRandomNumber = 0;
		intMaxNumber++;

		intRandomNumber = (int) (Math.random() * intMaxNumber);

		System.out.println("\nRandom number is (0-" + intMaxNumber + ") == " + intRandomNumber);
	}
}
