import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {
	class HelloWorld {
		public static void main(String[] args) {
		Stream<String> stream = Stream.of("john", "doe", "doe", "tom", "john");
		Set<String> items = new HashSet<>();

		stream.filter(n -> !items.add(n))
		        .collect(Collectors.toSet())
		        .forEach(System.out::println);
		}
	}
}
