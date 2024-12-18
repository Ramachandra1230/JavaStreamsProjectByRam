package ram.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number40{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = Arrays.asList(23, 34, 45, 56, 66, 40);
		
		List<Integer> number11 = number.stream().filter(num -> num>=40).collect(Collectors.toList());
		
		System.out.println("Numbers above 40:"+number11);

	}

}
