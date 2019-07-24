import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestPalindromeCheck {

	public static void main(String[] args) {
		String value = "abacddc";
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<value.length();i++) {
			for(int j=0;j<value.length();j++) {
				if(i<j) {
					String data = value.substring(i, j+1);
					if(isPalindrom(data)) {
						map.put(data, data.length());
					}
				}
			}
		}
		Map<String, Integer> result = map.entrySet().stream()
				.filter(entry -> entry.getValue().equals(Collections.max(map.values())))
				.collect(Collectors.toMap(data->data.getKey(), data->data.getValue()));
		System.out.println(result);
	}

	private static boolean isPalindrom(String data) {
		String reverse = "";
		for(int i=data.length()-1;i>=0;i--) 
			reverse = reverse+String.valueOf(data.charAt(i));
		if(data.equals(reverse)) return true;
		return false;
	}
}
