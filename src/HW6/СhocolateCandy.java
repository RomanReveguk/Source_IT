package HW6;

public class СhocolateCandy extends Sweets {
	private final double  massFractionOfChocolate;
		public СhocolateCandy(String name, double weight, double calories, double priceForWeight, double massFractionOfChocolate) {
		super(name, weight, calories, priceForWeight);
	    this.massFractionOfChocolate = massFractionOfChocolate;
	}
		
		
	    public double getСhocolateWeight(){
	        return getWeight() * massFractionOfChocolate;
	    }

	    @Override
	    public String toString() {
	        return  name +
	                ", weight " + getWeight() +
	                ", calories" + getsugarForWeight() +
	                ", price " + getPriceForWeight()+
	                ", chocolate weight " + getСhocolateWeight();
	    }
	}
	

