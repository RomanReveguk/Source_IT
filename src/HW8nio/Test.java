package HW8nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	    public static void main(String[] args) { 
	        Path startPath = Paths.get("D:\\TestFolder"); 
	         
	        //Строка с glob-шаблоном  
	        String pattern = "glob:*.java"; 
	       
	         
	        try { 
	            Files.walkFileTree(startPath, new MyFileFindVisitor(pattern)); 
	            System.out.println("File search completed! "+ MyFileFindVisitor.count); 
	        } catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
	    } 
	} 

