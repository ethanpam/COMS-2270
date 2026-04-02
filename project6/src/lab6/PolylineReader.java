package lab6;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import plotter.Plotter;
import plotter.Polyline;

public class PolylineReader
{
    private static Polyline parseOneLine(String line)
    {
        Scanner temp = new Scanner(line);
        Polyline p;

        if (temp.hasNextInt())
        {
            int width = temp.nextInt();
            String color = temp.next();
            p = new Polyline(color, width);
        }
        else
        {
            String color = temp.next();
            p = new Polyline(color);
        }

        while (temp.hasNextInt())
        {
            int x = temp.nextInt();
            int y = temp.nextInt();
            p.addPoint(new Point(x, y));
        }

        return p;
    }

    private static ArrayList<Polyline> readFile(String filename)
            throws FileNotFoundException
    {
        ArrayList<Polyline> list = new ArrayList<>();

        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();

            if (line.trim().length() == 0 || line.startsWith("#"))
            {
                continue;
            }

            list.add(parseOneLine(line));
        }
        scanner.close();

        return list;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<Polyline> list = readFile("hello.txt");
        Plotter plotter = new Plotter();

        for (Polyline p : list)
        {
            plotter.plot(p);
        }
    }
}