package ram.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author rveerise
 *
 */
public class CountOfMaleFemaleEmployees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeeCount> empList = new ArrayList<>();
		empList.add(new EmployeeCount(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new EmployeeCount(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new EmployeeCount(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new EmployeeCount(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new EmployeeCount(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new EmployeeCount(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new EmployeeCount(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new EmployeeCount(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new EmployeeCount(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

		Map<String, Long> maleFemale = empList.stream()
				.collect(Collectors.groupingBy(EmployeeCount::getGender, Collectors.counting()));

		Map<String, Long> count = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println("Count of male and female EmployeeCounts present in the organization:: \n" + maleFemale);

		System.out.println("Count of male and female EmployeeCounts present in the organization:: \n" + count);

	}

}