package HWTextEditor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TextEdit {
	
	//считывает с файла текст
	private static void printFileWithFileInputStream(String path) throws IOException, FileNotFoundException {
		try (FileInputStream fis = new FileInputStream(path)) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}
	}
	
	//считывает с файла текст
	private static void printFileWithFileReader(String path) throws IOException, FileNotFoundException {
		try (FileReader fr = new FileReader(path)) {
			int content;
			while ( (content = fr.read()) != -1) {
				System.out.print((char) content);
			}
		}
	}
	
	// записывает текст в файл с параметра метода
	private static void writeFileToPathFileWriter(String path, String textToWrite) throws IOException {
		try (FileWriter fw = new FileWriter(path)) {
			fw.write(textToWrite);
		}
	}
	
	// записывает текст в файл с параметра метода
	private static void writeFileToPath(String path, String textToWrite) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream(path)) {
			byte[] bytes = textToWrite.getBytes();
			fos.write(bytes);
		}
	}
	
	
	
	

	
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\TestFolder\\newTxt.txt";
	//writeFileToPathFileWriter("D:\\\\TestFolder\\\\newTxt.txt", "some text to write \nand more text");// записывает текст с параметра в файл
	
//	printFileWithFileInputStream(filePath); //считывает с файла текст
	//	printFileWithFileReader(filePath);  //считывает с файла текст
		
		Path p = Paths.get("folder1", "folder2", "text.txt");
		Charset charset = Charset.forName("UTF-8");
		List<String> lines = new ArrayList<>();
		Files.write(p, lines, charset);
	}
}