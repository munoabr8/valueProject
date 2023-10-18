package dataPrep.loading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DataPreparer {
	public static void main(String[] args) {

		String fileName = "data.txt";
		String path = "./" + fileName; // Relative path with a placeholder for the filename

		String keyword = "berry";

		// Define a Predicate functional interface to filter lines
		Predicate<String> containsKeyword = line -> line.contains(keyword);

		try (Stream<String> lines = Files.lines(Paths.get(path))) {
			long count = lines.filter(containsKeyword) // Use the Predicate to filter lines
					.peek(line -> System.out.println("Found: " + line)).count();

			System.out.println("Total occurrences of '" + keyword + "': " + count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	Consumer<String> consumeStream = data -> {};//clean,transform, validate};}
}