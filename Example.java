public class Example {

	public static void main(String[] args) {
		int length = 10000;
		if (args.length > 0)
			length = Integer.parseInt(args[0]);

		int array[] = createRandomArray(length);

		// int sortedArray[] = new CountSort().sort(array, length-1);
		int sortedArray[] = new SimpleCountingSort().sort(array);
		for (int i = 0; i < sortedArray.length; i++)
			System.out.println(sortedArray[i]);

		System.out.println("DONE!");

	}

	private static int[] createRandomArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++)
			array[i] = (int) (Math.random() * length);
		return array;
	}
}
