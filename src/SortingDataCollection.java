import static org.junit.Assert.assertTrue;

import java.util.Random;

public class SortingDataCollection {
	final static int SMALL_ARR = 10;
	final static int MED_ARR = 100;
	final static int LARGE_ARR = 1000;
	final static int NUM_LIMIT = 1000;
	
	public static void main(String[] args) {
		int[] insSmallArr = new int[SMALL_ARR];
		int[] mergeSmallArr = new int[SMALL_ARR];
		int[] insMergeSmallArr = new int[SMALL_ARR];
		int[] insMedArr = new int[MED_ARR];
		int[] mergeMedArr = new int[MED_ARR];
		int[] insMergeMedArr = new int[MED_ARR];	
		int[] insLargeArr = new int[LARGE_ARR];
		int[] mergeLargeArr = new int[LARGE_ARR];
		int[] insMergeLargeArr = new int[LARGE_ARR];
		Random rand = new Random();
		for(int idx = 0; idx < LARGE_ARR; idx++) {
			if(idx < SMALL_ARR) {
				insSmallArr[idx] = rand.nextInt(NUM_LIMIT);
				mergeSmallArr[idx] = rand.nextInt(NUM_LIMIT);
				insMergeSmallArr[idx] = rand.nextInt(NUM_LIMIT);
			} 
			if(idx < MED_ARR) {
				insMedArr[idx] = rand.nextInt(NUM_LIMIT);
				mergeMedArr[idx] = rand.nextInt(NUM_LIMIT);
				insMergeMedArr[idx] = rand.nextInt(NUM_LIMIT);
			}
			insLargeArr[idx] = rand.nextInt(NUM_LIMIT);
			mergeLargeArr[idx] = rand.nextInt(NUM_LIMIT);
			insMergeLargeArr[idx] = rand.nextInt(NUM_LIMIT);
		}	
		
		System.out.println("Size\tIns\tMerge\tInsMerge");
		System.out.print(SMALL_ARR+"\t");
		long preTime = System.nanoTime();
		InsertionSort.insertionSort(insSmallArr);
		System.out.print((System.nanoTime()-preTime) + "\t");
		preTime = System.nanoTime();
		MergeSort.mergeSort(mergeSmallArr);
		System.out.print((System.nanoTime()-preTime) + "\t");
		preTime = System.nanoTime();
		MergeInsertionSort.mergeInsertionSort(mergeSmallArr, (int) Math.round(Math.log(SMALL_ARR)/Math.log(2)));
		System.out.println((System.nanoTime()-preTime) + "\t");
		
		System.out.print(MED_ARR+"\t");
		preTime = System.nanoTime();
		InsertionSort.insertionSort(insMedArr);
		System.out.print((System.nanoTime()-preTime) + "\t");
		preTime = System.nanoTime();
		MergeSort.mergeSort(mergeMedArr);
		System.out.print((System.nanoTime()-preTime) + "\t");
		preTime = System.nanoTime();
		MergeInsertionSort.mergeInsertionSort(mergeMedArr, (int) Math.round(Math.log(SMALL_ARR)/Math.log(2)));
		System.out.println((System.nanoTime()-preTime) + "\t");
		
		System.out.print(LARGE_ARR+"\t");
		preTime = System.nanoTime();
		InsertionSort.insertionSort(insLargeArr);
		System.out.print((System.nanoTime()-preTime) + "\t");
		preTime = System.nanoTime();
		MergeSort.mergeSort(mergeLargeArr);
		System.out.print((System.nanoTime()-preTime) + "\t");
		preTime = System.nanoTime();
		MergeInsertionSort.mergeInsertionSort(mergeLargeArr, (int) Math.round(Math.log(SMALL_ARR)/Math.log(2)));
		System.out.println((System.nanoTime()-preTime) + "\t");

	}
}
