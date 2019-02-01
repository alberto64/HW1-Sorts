
public class MergeSort {

	public static void mergeSort(int[] mergeList) {
		mergeSortHelper(mergeList, 0 , mergeList.length-1);

	}
	
	private static void mergeSortHelper(int[] mergeList, int lowerIdx, int higherIdx) {
		if(lowerIdx < higherIdx) {
			int middleIdx = (higherIdx + lowerIdx)/2;
			mergeSortHelper(mergeList, lowerIdx , middleIdx);
			mergeSortHelper(mergeList, middleIdx + 1 , higherIdx);
			merge(mergeList, lowerIdx, middleIdx, higherIdx);
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
}
