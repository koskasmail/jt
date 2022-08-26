package javaCore.a_basic.c_javaBasicVariableStringObject;

public class C_java_BasicVariable_TextFormatingPrintF {

	public C_java_BasicVariable_TextFormatingPrintF() {
		byte byteNumber = -1;
		short shortNumber = 21;
		int intNumner = 321;
		long longNumber = 54321;
		float floatNumber = 12.32F;
		double doubleNumber = 1234.432;
		char ch = 'A';
		String welcome = "good morning";

		String[] stText = { "this", "is", "some", "text" };
		int[] number = { 62, 73, 81, 64, 55, 43, 92, 54, 63, 74 };

		String StFormat = "";
		System.out.println("\nprintf(\"byte  =  %-,5d \\n\" ,byteNumber);");
		System.out.println("% [flags] [width] [.precision] conversion-character");

		// bytes/ short/ int/ long/ === %d
		System.out.printf("byte  =  %10d \n", byteNumber);
		System.out.printf("short =  %10d \n", shortNumber);
		System.out.printf("int   =  %10d \n", intNumner);
		System.out.printf("long  =  %10d \n", longNumber);
		System.out.printf("long  =  %,10d \n", longNumber);

		// bytes/ short/ int/ long/ === %d
		System.out.printf("byte  =  %,-10d \n", byteNumber);
		System.out.printf("short =  %,-10d \n", shortNumber);
		System.out.printf("int   =  %,-10d \n", intNumner);
		System.out.printf("long  =  %,-10d \n", longNumber);

		// bytes/ short/ int/ long/ === %d
		System.out.printf("byte  =  %,010d \n", byteNumber);
		System.out.printf("short =  %,010d \n", shortNumber);
		System.out.printf("int   =  %,010d \n", intNumner);
		System.out.printf("long  =  %,010d \n", longNumber);

		// char === %c
		System.out.printf("char  =  %-10c \n", ch);

		// float / float === %f
		System.out.printf("float  =  %-,10.5f \n", floatNumber);
		System.out.printf("double =  %-,10.5f \n", doubleNumber);

		System.out.println("----------------------");
		System.out.printf("%nString = %s %n         to you", welcome);
		System.out.printf("%nString = %S %n         to you", welcome);
		System.out.printf("%n");
		System.out.println("----------------------");

		for (String StringOutput : stText) {
			System.out.printf("%10s", StringOutput);
		}
		
		System.out.println();
		StFormat = StFormat.format("%n+---------+---------+/");
		System.out.printf("%s", StFormat);
		StFormat = StFormat.format("%n| index   |  value  |/");
		System.out.printf("%s", StFormat);

		StFormat = StFormat.format("%n+---------+---------+/");
		System.out.printf("%s", StFormat);

		for (int i = 0; i < number.length; i++) {
			StFormat = StFormat.format("%n|  %05d  |   %05d |/", (i + 1), number[i]);
			System.out.printf("%s", StFormat);
		}

		StFormat = StFormat.format("%n+---------+---------+/");
		System.out.printf("%s", StFormat);
	}
}
