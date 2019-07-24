import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] array = {"flower","flow","flight"};
		Arrays.sort(array);
		String start = array[0];
		String end = array[array.length -1];
		int i=0;
		for( i=1;i<start.length();i++) {
			if(!start.startsWith(end.substring(0, i))) break;
		}
		System.out.println(end.substring(0,i-1));
	}
}
