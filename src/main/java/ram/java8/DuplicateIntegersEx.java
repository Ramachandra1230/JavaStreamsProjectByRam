package ram.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateIntegersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> mySet = new HashSet<Integer>();
		
		List<Integer> duplicateIntegers = myList.stream().filter(n->!mySet.add(n)).collect(Collectors.toList());
		System.out.println("duplicate numbers....." + duplicateIntegers);
	}

}
