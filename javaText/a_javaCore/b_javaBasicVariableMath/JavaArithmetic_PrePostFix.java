

public class MethodPrePostFix {

	public MethodPrePostFix() {
		// prefix
		int a = 2;
		int b = ++a; // a=3, b=3
		System.out.println("prefix >> a = 2, b = ++a ====> a== " + a + " b== " + b);
		//
		// postfix
		int c = 3;
		int d = c--; // d=3 c=2
		System.out.println("postfix >> c = 3, d = c-- ====> c== " + c + " d == " + d);
	}

}
