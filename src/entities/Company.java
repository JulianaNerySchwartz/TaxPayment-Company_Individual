package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;
	
	//Constructors
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	//Getters and Setters
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	//Actions
	
	public double tax() {
		if (numberOfEmployees < 10) {
			return anualIncome * 0.16;
		} else {
			return anualIncome * 0.14;
		}
	}
	
}
