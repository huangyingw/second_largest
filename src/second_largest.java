public class second_largest {
	public static int f(int[] a) {
		int max, sec_max;
		max = sec_max = -1;
		int len=a.length;
		if (len > 1) {
			for (int i = 0; i < len; i++) {
				if (a[i] > max) {
					sec_max = max;
					max = a[i];
				} else if (a[i] < max && a[i] > sec_max) {
					sec_max = a[i];
				}
			}
			return sec_max;
		}
		return sec_max;
	}

	public static void main(String arg[]) {
		int a[] = { 4, 2, 5 };
		System.out.println(f(a));

		int b[] = { 1, 2, 3, 4 };
		System.out.println(f(b));

		int c[] = { 4, 1, 2, 3 };
		System.out.println(f(c));

		int d[] = { 1, 1, 2, 2 };
		System.out.println(f(d));

		int e[] = { 1, 1 };
		System.out.println(f(e));

		int h[] = { 1 };
		System.out.println(f(h));

		int g[] = {};
		System.out.println(f(g));
		/*
		 * 4 3 3 1 -1 -1 -1
		 */
//		return 0;
	}
}
