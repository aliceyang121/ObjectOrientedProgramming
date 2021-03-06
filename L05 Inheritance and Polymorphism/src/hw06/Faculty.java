package hw06;

public class Faculty extends Person {
	
	private double salary;
	private String rank;
	private String discipline;

	public Faculty(String firstName, String lastName, long phoneNumber, double salary, String rank, String discipline) {
		super(firstName, lastName, phoneNumber);
		this.salary = salary;
		this.rank = rank;
		this.discipline = discipline;
	}
	
	public double getSalary() {
		return salary;
	}

	public String getRank() {
		return rank;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	@Override
	public String toString() {
		return super.toString() + "\tSalary: " + salary + "\tRank: " + getRank() + "\tDiscipline: " + getDiscipline();
	}
}
