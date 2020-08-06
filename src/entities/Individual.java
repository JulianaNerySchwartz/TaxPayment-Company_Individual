package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	//Constructors
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	//Getters and Setters
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	//Actions
	
	@Override
	public double tax() {
		if (anualIncome < 20000) { 
			return (anualIncome * 0.15) - (healthExpenditures * 0.50);
		} else {
			return (anualIncome * 0.25) - (healthExpenditures * 0.50);
		}
	}

}
