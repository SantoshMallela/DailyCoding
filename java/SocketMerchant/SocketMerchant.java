	import java.util.*;
	class SocketMerchant{
	   static int socketmerchant(final int n, final int[] ar) {
	   final HashMap<Integer, Integer> pair = new HashMap<>();
	   int pc = 0;
	   for (final int i : ar) {
		if (pair.containsKey(i)) {
		pair.replace(i, pair.get(i) + 1);
		} else {
			pair.put(i, 1);
		       }
		}
		for (final int val : pair.values()) {
			pc += Math.round(val / 2);
		}
		return pc;
	}

	public static void main(final String... args) {

		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt();
		final int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		final int result = socketmerchant(n, ar);
	System.out.println(result);
	in.close();
	
      }
 }
