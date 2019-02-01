import static org.junit.Assert.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

public class SortsTester {
	final int LIST_LENGHT = 100;
	final int NUMBER_LIMIT = 1000;
	int[] insertList = new int[LIST_LENGHT];
	int[] mergeList = new int[LIST_LENGHT];
	int[] insertMergeList = new int[LIST_LENGHT];
	Random rand = new Random();

	@Test
	public void insertionSortTest() {
		for(int idx = 0; idx < LIST_LENGHT; idx++) {
			insertList[idx] = rand.nextInt(NUMBER_LIMIT) + 1;
		}
		InsertionSort.insertionSort(insertList);
		for(int idx = 1; idx < insertList.length; idx++) {
			assertTrue("This list should be in ascending order", insertList[idx-1] <= insertList[idx]);
		}
	}	
	
	@Test 
	public void mergeSortTest() {
		for(int idx = 0; idx < LIST_LENGHT; idx++) {
			mergeList[idx] = rand.nextInt(NUMBER_LIMIT) + 1;
		}
		MergeSort.mergeSort(mergeList);

		for(int idx = 1; idx < mergeList.length; idx++) {
			assertTrue("This list should be in ascending order", mergeList[idx-1] <= mergeList[idx]);
		}	
	}	
	
	@Test
	public void insertMergeSortTest() {
		for(int idx = 0; idx < LIST_LENGHT; idx++) {
			insertMergeList[idx] = rand.nextInt(NUMBER_LIMIT) + 1;
		}
		MergeInsertionSort.mergeInsertionSort(insertMergeList, 100);

		for(int idx = 1; idx < insertMergeList.length; idx++) {
			assertTrue("This list should be in ascending order", insertMergeList[idx-1] <= insertMergeList[idx]);
		}
	}

}
