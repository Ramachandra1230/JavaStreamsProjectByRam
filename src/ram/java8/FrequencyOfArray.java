package ram.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		
		Map<String, Long> frequency = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequency of each string is ****"+frequency);

	}

}
