
public class MergeInsertionSort {

	public static void mergeInsertionSort(int[] mergeList, int k) {
		mergeSortHelper(mergeList, 0 , mergeList.length-1, k);
	}
	
	private static void mergeSortHelper(int[] mergeList, int lowerIdx, int higherIdx, int k) {
		if(lowerIdx < higherIdx && k > 0) {
			if(k == 0) {
				insertionSort(mergeList, lowerIdx, higherIdx);
			} else {
				int middleIdx = (higherIdx + lowerIdx)/2;
				mergeSortHelper(mergeList, lowerIdx , middleIdx, k-1);
				mergeSortHelper(mergeList, middleIdx + 1 , higherIdx, k-1);
				merge(mergeList, lowerIdx, middleIdx, higherIdx);
			}
		}
	}
	
	private static void merge(int[] mergeList, int lowerIdx, int middleIdx, int higherIdx) { 
        int leftListSize = middleIdx - lowerIdx + 1; 
        int rightListSize = higherIdx - middleIdx; 
  
        int leftList[] = new int [leftListSize]; 
        int rightList[] = new int [rightListSize]; 
  
        for (int idx=0; idx<leftListSize; ++idx) {
        	leftList[idx] = mergeList[lowerIdx + idx];
        }
        
        for (int idx=0; idx<rightListSize; ++idx) {
            rightList[idx] = mergeList[middleIdx + 1+ idx]; 
        }

        int leftIdx = 0, rightIdx = 0;
        int currentIdx = lowerIdx; 
        
        while (leftIdx < leftListSize && rightIdx < rightListSize) { 
            if (leftList[leftIdx] <= rightList[rightIdx]) { 
            	mergeList[currentIdx++] = leftList[leftIdx++];  
            } else { 
            	mergeList[currentIdx++] = rightList[rightIdx++]; 
            } 
        } 
  
        while (leftIdx < leftListSize) { 
        	mergeList[currentIdx++] = leftList[leftIdx++]; 
        } 
  
        while (rightIdx < rightListSize) { 
        	mergeList[currentIdx++] = rightList[rightIdx++]; 
        } 
    } 
	
	public static void insertionSort(int[] insertList, int left, int right) {	
		for(int idx = left; idx <= right; idx++) {
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
