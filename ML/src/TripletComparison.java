import java.util.ArrayList;
import java.util.List;

public class TripletComparison {
	public static void main(String[] args) {
		int[] aliceArray = {17,28,30}; 
		int[] bobArray = {99,16,8};
		int alicePoint = 0;
		int bobPoint = 0;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<aliceArray.length;i++) {
			if(aliceArray[i] > bobArray[i]) ++alicePoint;
			else if(aliceArray[i] < bobArray[i]) ++bobPoint;
		}
		list.add(alicePoint);
		list.add(bobPoint);
		System.out.println(list);
	}
}
