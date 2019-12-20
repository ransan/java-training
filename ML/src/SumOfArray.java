import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfArray {
	public static void main(String[] args) {
		long[] array = {1000000001, 1000000002
				,1000000003, 1000000004, 1000000005};
		long data = Arrays.stream(array).boxed().collect(Collectors.toList()).stream()
		          .collect(Collectors.summingLong(Long::longValue));
		System.out.println(data);
	}
}
