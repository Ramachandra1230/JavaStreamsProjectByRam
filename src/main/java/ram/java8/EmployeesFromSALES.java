package ram.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesFromSALES {
	
	//    https://websparrow.org/java/java-8-stream-filter-method-example

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee22> emp = Arrays.asList(new Employee22(101, "Ram", 150000, "IT"),
											new Employee22(102, "Siva", 145000, "SALES"),
											new Employee22(103, "Prasad", 99000, "SALES"),
											new Employee22(104, "Priyanka", 80000, "HR")
				);
		
		
		List<Employee22> emp11 = emp.stream().filter(emp1 -> emp1.getDept().equals("SALES")).collect(Collectors.toList());
		System.out.println("SALES EMP DETAILS:::::"+emp11);
		emp.stream().filter(emp1->emp1.getDept().equals("SALES")).map(e->e.getName()).forEach(System.out::println);//print only names who belongs to SALES DEPT 
		
		
		//Employees salary > 90000
		emp.stream().filter(emp1->emp1.getSal()>90000).collect(Collectors.toList()).forEach(System.out::println);
		emp.stream().filter(emp1->emp1.getSal()>90000).map(e->e.getName()).forEach(System.out::println);//print only names
		
		//Employees from IT & salary > 15000---this is little bit tricky
		List<Employee22> emp22 = emp.stream().filter(emp1->emp1.getSal()>99000 && emp1.getDept().equals("IT")).collect(Collectors.toList());
		System.out.println("SEmployees from IT & salary > 99000:::::"+emp22);
		emp.stream().filter(emp1->emp1.getSal()>99000 && emp1.getDept().equals("IT")).map(e->e.getName()).forEach(System.out::println);

	}

}
