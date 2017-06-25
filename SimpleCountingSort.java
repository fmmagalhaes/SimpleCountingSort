public class SimpleCountingSort {

	public int[] sort(int[] array) {
		return sort(array, getMaxValue(array));
	}

	public int[] sort(int[] array, int max) {
		int[] sortedArray = new int[array.length];
		int[] countArray = createHistogram(array, max);
		int counter = 0;
		for (int i = 0; i < countArray.length; i++)
			for (int j = 0; j < countArray[i]; j++)
				sortedArray[counter++] = i;
		return sortedArray;
	}

	// calculates histogram of key frequencies
	private int[] createHistogram(int[] array, int max) {
		int[] v = new int[max + 1];
		for (int i = 0; i < array.length; i++)
			v[array[i]] += 1;
		return v;
	}

	private int getMaxValue(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		return max;
	}
}