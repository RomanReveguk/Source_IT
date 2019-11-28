package HW8.TextEditor;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScannerExampleClass {

	static StringBuffer strBuffer = new StringBuffer();
	static ArrayList<String> list = new ArrayList<String>();
	
	private static final String VOWELS = "aeiouyAEIOUY";
	static int count =0;
	
	static int countWord =0;
	
	
	public static void readFile() throws FileNotFoundException {
		File file = new File("D:\\TestFolder\\newTxt.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		System.out.println("Вывод текста который находится в файле: ");
		StringBuilder sb = new StringBuilder();
		while (scanner.hasNextLine()) {
			sb.append(scanner.nextLine());
		}
		System.out.println(sb);
		for (String string : list) {
			System.out.println(string);
			
		}
	}
	
	// Вводим текст в консоль
	public static void recoursionFunc() {    
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст который хотите записать в файл или введите exit для выхода ");
		String variable = scanner.nextLine();
		if (variable.equals("exit")) {
			System.out.println("вы вышли!");
		} else {
			list.add(variable);
		 recoursionFunc();
		}
	}

	//записывает текст который хранится в листе(считанный из консоли) в файл!
		 public static void writeFileSimpleMethod()  {
		        PrintWriter writer;
				try {
					writer = new PrintWriter("D:\\TestFolder\\newTxt.txt");

					 for (String string : list) {
					writer.println(string);	
						}
					 
				        writer.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
		       
		    }

	

	public static void theContentsSimvol() throws FileNotFoundException {	
	
		for (String s : list)
        {
          for (int i = 0; i < s.length(); i++) {	
        	  count++;
          }
        } System.out.println("Количество символов в файле "+count);
    }
	
	public static void countWord() throws FileNotFoundException {	
		 for(String ss: list) {
			 String[] subStr;
			 subStr = ss.split("\\s+|,\\s*");
			 
			 for(int i = 0; i < subStr.length; i++) { 
		         countWord+=1; 
		         
		      }
		 } System.out.println("Количество слов в файле "+countWord);
	}
		
		
     
    public static boolean isVowel(char ch) {
        
        return VOWELS.indexOf(ch) >= 0;
    }
	
	public static void countChar() throws FileNotFoundException {	
		
		int counter = 0;
		for(String ss: list) {
        for(int i = 0; i < ss.length(); ++i) {
            if(isVowel(ss.charAt(i)))
                ++counter;
            }
        System.out.println("в строке "+counter+" гласных символов");
        counter=0;
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
	
		ScannerExampleClass.recoursionFunc();
		ScannerExampleClass.writeFileSimpleMethod();
		ScannerExampleClass.readFile();
		ScannerExampleClass.theContentsSimvol();
		ScannerExampleClass.countWord();
		ScannerExampleClass.countChar();

		
	}

}