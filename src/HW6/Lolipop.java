package HW6;

public class Lolipop extends Sweets {

	
		private double massFractionOfLolipop;

		public Lolipop(String name, double weight, double calories, double priceForWeight, double massFractionOfLolipop) {
		super(name, weight, calories, priceForWeight);
		this.massFractionOfLolipop= massFractionOfLolipop;
	}
			
			
		    public double getLolipopWeight(){
		        return getWeight() * massFractionOfLolipop;
		    }

		    @Override
		    public String toString() {
		        return  name +
		                ", weight " + getWeight() +
		                ", calories" + getsugarForWeight() +
		                ", price " + getPriceForWeight()+
		                ", chocolate weight " + getLolipopWeight();
		    }
		}
		


