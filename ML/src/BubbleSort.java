/**
 * Keep on swapping is bubble sort TC - O(n*n)
 * 
 * @author SRK
 */
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int data : arr) System.out.println(data);
	}
}
