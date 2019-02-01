import java.util.Random;

public class InsertionSort {
	
	public static void insertionSort(int[] insertList) {	
		for(int idx = 1; idx < insertList.length; idx++) {
			for(int j = 0 ; j < idx ; j++) {
				if(insertList[idx] < insertList[j]) {
					int value = insertList[idx];
					for(int shift = idx; shift > j; shift--) {
						insertList[shift] = insertList[shift-1];
					}
					insertList[j] = value;
					break;
				}
			}
		}
	}

}
