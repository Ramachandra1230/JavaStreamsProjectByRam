package ram.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "Java Concept Of The Day";
		Map<String, Long> seq = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequency Of Each Character is ****"+seq);

	}

}
