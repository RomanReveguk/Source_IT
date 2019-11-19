package HW6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box {

  List<Sweets> sweets = new ArrayList<Sweets>();
	
	
	public Box(List<Sweets> sweets) {
		this.sweets= sweets;
	}
	
	public void sortWeight() {	 
		Collections.sort(sweets);
		System.out.println(sweets);
		}
		

		
//	public Sweets getSweetsFromCaloriesRange(double fromCalories, double toCalories){
//        for(Sweets sweets: sweets){
//            if (sweets.getsugarForWeight() >= fromCalories &&
//                    sweets.getsugarForWeight()<= toCalories)
//                return sweets;
//        }
//        throw new RuntimeException();
//    }
	
	public void  countWeight() {
		int count =0;
		for (Sweets sweets2 : sweets) {
			
			count +=sweets2.getWeight();
		}
		System.out.print(count);
	}

	
	
	public void sugarContent(double i, double j) {
		for (Sweets sweets2 : sweets) {
			if(sweets2.getsugarForWeight() >= i && sweets2.getsugarForWeight()< j ) {
			System.out.println(sweets2+ ", ");
		}
	}
	}

    @Override
    public String toString() {
        String result = "Box: " + "\n";
        for(Sweets candy: sweets){
            result += candy.toString()+ "\n";
        }
        return result;
    }
    
}

