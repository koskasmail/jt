

public class JavaArithmeticOperatorsShorthand {

	public JavaArithmeticOperatorsShorthand(int number) {

		System.out.println("\nJava Arithmetic Operators Short hand\n");
		System.out.println("number = " + number);

		// +=
		System.out.println(" number (" + number + ") += 2 ==> " + (number += 2));

		// -=
		System.out.println(" number (" + number + ") -= 3 ==> " + (number -= 3));

		// *=
		System.out.println(" number (" + number + ") *= 2 ==> " + (number *= 2));

		// /=
		System.out.println(" number (" + number + ") /= 5 ==> " + (number /= 5));

		// %=
		System.out.println(" number (" + number + ") %= 2 ==> " + (number %= 2));

		// \n
		System.out.print("\n");

		// number++
		System.out.println(" number (" + number + ") ++ ==> " + (number++));

		// ++number
		System.out.println(" number (" + number + ") ++ ==> " + (++number));

		// number--
		System.out.println(" number (" + number + ") -- ==> " + (number--));

		// --number
		System.out.println(" number (" + number + ") -- ==> " + (--number));

		float flNumber = 0;
		int num1 = 10, num2 = 5;
		System.out.println("---------");
		System.out.println("*** modulo int to int ==> " + num1 + " / " + num2 + " === " + (num1 / num2));
		System.out.println("*** modulo int to float ==> " + num1 + " / " + num2 + " === " + (flNumber = num1 / num2));
	}
}
