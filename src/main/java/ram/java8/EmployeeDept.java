package ram.java8;

public class EmployeeDept {
	private String name;
	private int id;
	private int salary;
	private String dept;
	private int age;

	public EmployeeDept(String name, int id, int salary, String dept, int age) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeDept [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + ", age=" + age
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}