
/*
 * This class is responsible for keeping the track of 
 * teacher's name,id,salary
 */
public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	


	public Teacher (int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary= salary;
		this.salaryEarned=salaryEarned;
	}
	
	
	public int getId() {
		return id;
	}

/*
	public void setId(int id) {
		this.id = id;
	}
*/

	public String getName() {
		return name;
	}

/*
	public void setName(String name) {
		this.name = name;
	}
*/

	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void recieveSlary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneyEarned(salary);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
