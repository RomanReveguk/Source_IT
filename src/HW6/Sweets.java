package HW6;

public class Sweets implements Comparable<Sweets>{
	public final String name;
	private double weight;// kg
	public final double sugarForWeight;
	public final double priceForWeight;

	public Sweets(String name, double weight, double sugarForWeight, double priceForWeight) {
		this.name = name;
		this.weight = weight;
		this.sugarForWeight = sugarForWeight;
		this.priceForWeight = priceForWeight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void addWeight(double weight){
        this.weight += weight;
    }

	public String getName() {
		return name;
	}

	public double getsugarForWeight() {
		return sugarForWeight;
	}

	public double getPriceForWeight() {
		return priceForWeight*weight;
	}

	@Override
	public String toString() {
		return  name + ", Weight()=" + getWeight()  
				+ ", getCaloriesForWeight()=" + getsugarForWeight() + ", getPriceForWeight()=" + getPriceForWeight()
				+ "]";
	}
	
	@Override
    public int compareTo(Sweets o) {
        if (this.weight > o.getWeight()) return 1;
        if (this.weight < o.getWeight())return -1;
        return 0;
    }

	
}
