package ram.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class IntegerArraySecondHighestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = Arrays.asList(23, 34, 45, 56, 66, 40, 34, 66,76);
		Optional<Integer> max = number.stream().max(Comparator.naturalOrder());
		System.out.println("highest integer....."+max);
		
		// second highest number
		int max2 = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		 // sort in descending-order and get 2nd largest element
        int secondLargestNumber = number
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
		
        System.out.println("second highest integer....."+secondLargestNumber);
        
        //duplicate intergers
        
        Set<Integer> mySet = new HashSet<>();
        List<Integer> dupli = number.stream().filter(n->!mySet.add(n)).collect(Collectors.toList());
        System.out.println("duplicate intergers....."+dupli);
	}

}
