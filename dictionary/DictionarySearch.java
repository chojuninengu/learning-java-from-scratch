 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * DictionarySearch reads 'words.txt' and displays each word in the file.
 */
public class DictionarySearch {
    public static void main(String[] args) {
        String filePath = "words.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.nextLine().trim();
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equalsIgnoreCase(searchWord)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.printf("The word '%s' appears %d %s in the dictionary.\n", searchWord, count, count == 1 ? "time" : "times");
            } else {
                System.out.printf("The word '%s' is not found in the dictionary.\n", searchWord);
            }
        } catch (IOException e) {
            System.err.println("Error reading the dictionary file: " + e.getMessage());
        }
    }
} 