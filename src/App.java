public class App {
	public static void main(String[] args) {
		int[][] a = {
				{ -5, -2, -3, 7 },
				{ 1, -5, -2, 2 },
				{ 1, -2, 3, -4 }
		};
		System.out.println(sumColumn(a, 1)); // should print -9
		System.out.println(sumColumn(a, 3)); // should print 5
	}

	public static int sumColumn(int[][] array, int column) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count += array[i][column];
		}
		return count;
		// placeholder
	}

}
