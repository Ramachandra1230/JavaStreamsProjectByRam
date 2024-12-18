package ram.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalDeptWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeeDept> emp = new ArrayList<EmployeeDept>();
		emp.add(new EmployeeDept("Ram", 101, 145000, "IT", 35));
		emp.add(new EmployeeDept("Raghu", 101, 99000, "IT", 35));
		emp.add(new EmployeeDept("Vishnu", 101, 49000, "IT", 35));
		emp.add(new EmployeeDept("Koti", 101, 45000, "Admin", 35));
		emp.add(new EmployeeDept("Subbu", 101, 65000, "Admin", 35));
		emp.add(new EmployeeDept("Sahoo", 101, 145000, "Admin", 35));
		emp.add(new EmployeeDept("Janvi", 101, 39000, "Staff", 35));
		emp.add(new EmployeeDept("Ani", 101, 44000, "Staff", 35));
		emp.add(new EmployeeDept("Mru", 101, 49000, "Staff", 35));


		Map<String, Optional<EmployeeDept>> map = emp.stream().collect(Collectors.groupingBy(EmployeeDept::getDept,
				Collectors.maxBy(Comparator.comparingInt(EmployeeDept::getSalary))));
		map.entrySet().forEach(System.out::println);
		
		Map<String, Optional<EmployeeDept>> map1 = emp.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.maxBy(Comparator.comparingInt(e->e.getSalary()))));
		map1.entrySet().forEach(System.out::println);
	}

}
