package HW8io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindExample {
	public int count =0;
	
	
	public void Buffer(String s) {
	StringBuffer strBuffer = new StringBuffer();
	strBuffer.append(s);
	System.out.println(strBuffer.toString());
	}
	
	public void fileFind (String k) throws IOException {
		Path p = Paths.get(k);
		
		final int maxDepth = 10;
        @SuppressWarnings("resource")
		Stream<Path> matches = Files.find(p,maxDepth,(path, basicFileAttributes) -> String.valueOf(path).endsWith(".java"));
        matches.map(path -> path.getFileName()).forEach(System.out::println);
        matches.map(path -> path.getFileName()).count();
	}

	
	public void fileFind2(String k) {
		try (Stream<Path> walk = Files.walk(Paths.get(k))) {

			List<String> result = walk
					.map(x -> x.toString())
					.filter(f -> f.endsWith(".java")) //Отбирает  файлы с расш.джава
					
				 	.collect(Collectors.toList());   //Собирает полученние елементи в список   	
					result.forEach(System.out::println);
					System.out.println(result.size());	 // Показывает кол-во файлов с расш.джава 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void buff(String k) {
		try (Stream<Path> walk = Files.walk(Paths.get(k))) {

			List<String> result = walk
					.map(x -> x.toString())
					.filter(f -> f.endsWith(".java")) //Отбирает  файлы с расш.джава
					
				 	.collect(Collectors.toList());   //Собирает полученние елементи в список   	
					result.forEach(System.out::println);
					System.out.println(result.size());	 // Показывает кол-во файлов с расш.джава 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//Выводит файлы в одну строку с помощью СтрингБуфера
	private void searchRecursively(File file, int counter) {
		File[] listFiles = file.listFiles();
		StringBuffer strBuffer = new StringBuffer();
		
		for (File file2 : listFiles) {
			if (file2.isDirectory()) {
				searchRecursively(file2, counter);
			} else {
				if (file2.getName().endsWith(".java")) {
					counter++;
					strBuffer.append(file2);
				}
			}
		} System.out.print(strBuffer.toString()+", ");
	}
	
    public static void main(String... args) throws IOException {
     FindExample ex1 = new FindExample();
    ex1.fileFind2("D:\\TestFolder");
    ex1.searchRecursively(new File("D:\\TestFolder"), 0);
   
    }
}