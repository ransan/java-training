
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,80};
		int target = 50;
		int result = doBinarySearch(array,0,array.length,target);
		System.out.println(result);

	}

	private static int doBinarySearch(int[] array, int leftIndex, int rightIndex, int target) {
		while(leftIndex <= rightIndex) {
			int middle = leftIndex + (rightIndex - leftIndex )/2;
			if(array[middle] == target) 
				return middle;
			 if(array[middle] < target)  leftIndex = middle + 1; 
			 else rightIndex = middle - 1;
		}
		return -1;
	}
}
