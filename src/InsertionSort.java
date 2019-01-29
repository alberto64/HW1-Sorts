import java.util.Random;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr1 = new int[100];
		Random rand = new Random();
		System.out.print("[ ");
		for(int idx = 0; idx < arr1.length; idx++) {
			arr1[idx] = rand.nextInt(1000);
			System.out.print(arr1[idx] + " ");
		}
		System.out.println("]");
		insertionSort(arr1);
		System.out.print("[ ");

		for(int idx = 0; idx < arr1.length; idx++) {
			System.out.print(arr1[idx] + " ");
		}
		System.out.print("]");

	}
	
	public static void insertionSort(int[] arr) {
		
		for(int idx = 1; idx < arr.length; idx++) {
			for(int j = 0 ; j < idx ; j++) {
				if(arr[idx] < arr[j]) {
					int value = arr[idx];
					for(int shift = idx; shift > j; shift--) {
						arr[shift] = arr[shift-1];
					}
					arr[j] = value;
				}
			}
		}
	}

}
