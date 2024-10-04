import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamApiString {
		public static void main(String[] args) {
			String str = "anand vardhan";
			List<Character> chars = str.replace(" " , "").chars().mapToObj(n -> (char)n).toList();
//			List<Character> nonrepchar = new ArrayList<Character>();
//			List<Character> repchar = new ArrayList<Character>();

		Map<Object, Long> count = new LinkedHashMap<>() ;
                    chars.stream()
						.forEach(c -> count.put(c, count.getOrDefault(c, 0L) + 1));  
//		Stream<String> str2 = Arrays.stream(str.split(" "));
//		IntStream  str3 = str.chars();
//       str2.forEach(System.out::println);
//        str3.forEach(System.out::println);
       System.out.println(chars);
       System.out.println(count);
	
		}
	}

