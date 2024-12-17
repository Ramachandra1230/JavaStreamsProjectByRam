package ram.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeesByCityMedium {
	
	//https://medium.com/@veenaraofr/java8-stream-api-commonly-asked-questions-about-employee-highest-salary-99c21cec4d98

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
		empList.add(new EmployeeCount(10, "Ram", 30,200, "M", "IT", "Hyderabad", 2010));
		
		Map<String, List<EmployeeCount>> empcount = empList.stream().collect(Collectors.groupingBy(EmployeeCount::getCity));
		System.out.println("Employees by City----"+empcount);
		
		//Group the Employees by age.
		Map<Integer, List<EmployeeCount>> empAge = empList.stream().collect(Collectors.groupingBy(e->e.getAge()));
		System.out.println("Employees by Age*******"+empAge);
		
		//Print the names of all departments in the organization.
		System.out.println("Names of all departments in the organization ");
		empList.stream().map(e->e.getDeptName()).distinct().forEach(System.out::println);
		
		//Print employee details whose age is greater than 28.
		List<EmployeeCount> empList11 =  empList.stream().filter(e->e.getAge()>28).collect(Collectors.toList());
		System.out.println("employee details whose age is greater than 28...... "+empList11);
		
		//Find maximum age of employee.
		Optional<EmployeeCount> oldestEmp = empList.stream().max(Comparator.comparingInt(e->e.getAge()));
		System.out.println("Oldest employee details:: \n" + oldestEmp);
		
		//Print the number of employees in each department.
		Map<String, Long> count = empList.stream().collect(Collectors.groupingBy(EmployeeCount::getDeptName, Collectors.counting()));
		Map<String, Long> count11 = empList.stream().collect(Collectors.groupingBy(EmployeeCount::getDeptName, Collectors.counting()));
		System.out.println("Print the number of employees in each department.--- \n" + count);
		
		//Find oldest employee.
		Optional<EmployeeCount> oldEmp = empList.stream().max(Comparator.comparingInt(EmployeeCount::getAge));
		System.out.println("Find oldest employee.:: \n" + oldEmp);
		
		//Find youngest female employee.
		Optional<EmployeeCount> young = empList.stream().min(Comparator.comparingInt(EmployeeCount::getAge));
		System.out.println("Find youngest female employee..:: \n" + young.get().getName());
		
		//Find Highest salary in the organization.
		Optional<EmployeeCount> higSal = empList.stream().max(Comparator.comparingLong(e->e.getSalary()));
		System.out.println("Find Highest salary in the organisation..:: \n" + higSal);
		
		//Find Second Highest salary in the organization.
		Optional<EmployeeCount> higSal2 = empList.stream().sorted(Comparator.comparingLong(EmployeeCount::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Find Second Highest salary in the organization...:: \n" + higSal2);
		
		//16. Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.
		empList.stream().filter(e->e.getCity().equalsIgnoreCase("Blore")).sorted(Comparator.comparing(EmployeeCount::getName)).forEach(e -> System.out.println("Employees staying in Blore:: " + e.getName()));
		List<EmployeeCount> empList12 =  empList.stream().filter(e->e.getCity().equalsIgnoreCase("Blore")).sorted(Comparator.comparing(EmployeeCount::getName)).collect(Collectors.toList());
		System.out.println("Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees....:: \n" + empList12);
		empList.stream().filter(e->e.getCity().equalsIgnoreCase("Blore")).sorted(Comparator.comparing(EmployeeCount::getName)).map(e->e.getName()).forEach(System.out::println);
	

	}

}
