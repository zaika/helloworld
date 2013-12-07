package am.zara.shop.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "employeeUserData", eager = true)
@SessionScoped
public class EmployeeUserData implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String dept;
	private int age;
	private double salary;

	private static final ArrayList<Employee> employees = new ArrayList<Employee>(
			Arrays.asList(new Employee("John", "Marketing", 30, 2000.00),
					new Employee("Robert", "Marketing", 35, 3000.00),
					new Employee("Mark", "Sales", 25, 2500.00), new Employee(
							"Chris", "Marketing", 33, 2500.00), new Employee(
							"Peter", "Customer Care", 20, 1500.00)));

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee() {
		Employee employee = new Employee(name, dept, age, salary);
		employees.add(employee);
	}

	public void deleteEmployee(Employee employee) {
		employees.remove(employee);
	}

	public void editEmployee(Employee employee) {
		employee.setCanEdit(true);
	}

	public void saveEmployees() {
		// set "canEdit" of all employees to false
		for (Employee employee : employees) {
			employee.setCanEdit(false);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String department) {
		this.dept = department;
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
}
