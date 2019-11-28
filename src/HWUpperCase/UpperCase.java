package HwUpperCase;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {

	public static void main(String[] args) {
		
		String[] array = {"when i was younger", "I never needed"};
		String str1 = "When I was younger ";
		String str2 = "I never needed";
		 
		  String[] arrays =new String[2];
		  arrays= str1.split("\\s+"); 
		  for(int i=0; i<array.length; i++) {
			  for(int j=0; i<str1.length(); j++) {
			  System.out.print(arrays[j].substring(0, 1).toUpperCase() + arrays[j].substring(1)+" ");
			  
		  }
		  }

		  arrays= str2.split("\\s+"); 
		  for(int i=0; i<array.length; i++) {
			  for(int j=0; i<str2.length(); j++) {
			  System.out.print(arrays[j].substring(0, 1).toUpperCase() + arrays[j].substring(1)+" ");
			

		  }
		  }	
		  
		  
	}
}
