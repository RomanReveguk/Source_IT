package Lesson3;

import java.io.*;

public class MyApp {

	public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Введите стоп для завершения");
System.out.println("Введите штат");
 do {
	 str = br.readLine();
	 str = str.trim();
	 if(str.equals("Иллинойс"))
		 System.out.println("Столица - Спрингфилд");
 }while(!str.equals("стоп"));
	 

	}

}
