package ram.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Rama", "Prasad", "Siva", "Karthi");
		
		List<String> names11 = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
		System.out.println("Names starts with S::"+names11);
		
		List<String> names4 = names.stream().filter(name->name.length()>4).collect(Collectors.toList());
		System.out.println("Names with Length above 4::"+names4);
		

	}

}
