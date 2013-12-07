package am.zara.shop.bean;

public class Employee {
	private String name;
	private String department;
	private int age;
	private double salary;
	private boolean canEdit;

	public Employee(String name, String department, int age, double salary) {
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
		this.canEdit = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isCanEdit() {
		return canEdit;
	}

	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
}
