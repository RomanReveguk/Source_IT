import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("");
		int acdcHex = Integer.parseInt("ACDC", 16);
		System.out.println(acdcHex);

//		if (true) {
//			System.out.println(acdcHex);
//
//		} else if (true) {		System.out.println(acdcHex);
//
//		} else if (true) {		System.out.println(acdcHex);
//		}

//		switch ("a") {
//		case "a":
//			System.out.println("ffjfj");
//			break;
//		default:
//			System.out.println("ffhfh");
//		}
//
//		switch ("LOW") {
//		case "LOW":
//			System.out.println("LOW");
//			break;
//		default:
//			System.out.println("default");
//		}
//
//	}

	/*
	 * public enum Priority { LOW, MEDIUM, HIGH;}
	 */
	
//
//	c:for(i=0; i <= 10; i++) {
//		if(true) {continue c;}
//	}
	
	String [] arr = new String[30];
	String [] arr2 = {"a","b"};
	
	for(String string: arr2) {
		System.out.println("a");
	}
	
	int[][] matrix = {{1,2,3,4},{1,3}};
	
	for(int i = 0; i<matrix.length;i++) {
		
		for(int j=0; j<matrix[i].length;j++) {
			System.out.print(matrix[i][j]+ "\t");
		}
		System.out.println();
	}
	
	int[] arr4 = {100,2,5,66};
	Arrays.sort(arr4);
	System.out.println(arr4);
	System.out.println(Arrays.toString(arr4));
	
	Integer[] arr5= {100,2,45,3};
	Arrays.sort(arr5, (int1,int2) -> int2 - int1);
	
	Arrays.sort(arr5, (int1,int2) ->{
		return
	int2 - int1;
		});

	System.out.println(Arrays.toString(arr5));
	
	
	
	String [] strr = {"Hello","Java","Python","smth","do"};
	
	Arrays.sort(strr, (x, y) -> x.split(" ").length - y.split(" ").length);
    
	//Arrays.sort(strr,(str1,str2)-> { return str2.split(" ").length-str1.split(" ").length)};
	Arrays.sort(strr,(str1,str2)-> str2.length()-str1.length());

	System.out.println(Arrays.toString(strr));
	
	
	
	
	
      }
	}
