package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("story.txt");
        Scanner scanner = new Scanner(file);
        int lineCount = 1;

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            int words = countWords(line);
            System.out.println("Line " + lineCount + " has " + words + " words");
            lineCount += 1;
        }
        scanner.close();
    }

    private static int countWords(String line)
    {
        Scanner temp = new Scanner(line);
        int count = 0;

        while (temp.hasNext())
        {
            temp.next();
            count += 1;
        }

        return count;
    }
}