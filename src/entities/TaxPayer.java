package entities;

public abstract class TaxPayer {

	protected String name;
	protected Double anualIncome;
	
	//Constructors
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	//Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	//Actions
	
	public abstract double tax();
	
}
