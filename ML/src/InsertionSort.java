/**
 * Insertion sort is like Deck of cards i and j is there 
 * we need to compare them TC- O(2n)
 *  
 * @author Ranjith P
 */
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j =i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1]=key;
		}
		for(int data : arr) System.out.println(data);
	}
}
