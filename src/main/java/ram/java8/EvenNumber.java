package ram.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String[] str) {
	
	List<Integer> nums = Arrays.asList(2,8,19,12,55,60);
	List<Integer> evenNumbers = nums.stream().filter(num->num%2==0).collect(Collectors.toList());
	
	System.out.println("Even numbers: " + evenNumbers);

}
}
