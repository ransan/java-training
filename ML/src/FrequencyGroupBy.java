import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyGroupBy {

	public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,10,2,8,10,8,8,10,10);
       Map<Integer, Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       Map<Integer,Long> finalMap = new LinkedHashMap<>();
       count.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByKey().reversed()).forEachOrdered(data->{
    	   finalMap.put(data.getKey(),data.getValue());
       });
       finalMap.entrySet().forEach(entry->{
    	   for(int i=0;i<finalMap.size();i++) {
    		   System.out.print(entry.getKey());
    		   System.out.print(" ");
    	   }
       });
       
	}

}
