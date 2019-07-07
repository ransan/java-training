import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LongestSubstring {
	public static void main(String[] args) {
		String value = "analyst";
		String sub = "";
		int ite = 0;
		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		Map<Integer,String> map = new TreeMap<>();
		for(int i=ite;i<value.length();i++) {
			if(!sub.contains(String.valueOf(value.charAt(i)))) {
				sub=sub+String.valueOf(value.charAt(i));
			}else {
				list.add(sub);
				sub = "";
				ite =i;
				i = i-1;
				continue;
			}
		}
		list.add(sub);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			int size = list.get(i).length();
			map.put(size, list.get(i));
		}
		map.values().forEach(r -> {
			list1.add(r);
		});
		System.out.println(list1.get(list1.size() -1));
	}
}
