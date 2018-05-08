class SumObject {
	int sumMmethod(int v) {
		if (v == 1) {
			return 1;
		} else {
			System.out.print(v - 1);
			return (v + sumMethod(v - 1));
		}
	}
}

class Summation {
	public static void main (String a[]) {
		int sumvalue = 0;
		int n = 10;
		SumObject S = new SumObject();
		sumvalue = S.sumMethod(n);
		System.out.println("\n\n" + sumvalue);
	}
}
