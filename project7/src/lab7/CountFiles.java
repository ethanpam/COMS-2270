package lab7;

import java.io.File;

public class CountFiles {
    public static void main(String args[]){
        File f = new File("."); // all file in project 7
        System.out.println(countFiles(f));
    }

    public static int countFiles(File f){
        if (!f.isDirectory()){ //reg file
            return 1;
        }
        else {
            int count = 0;
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; ++i)
            {
                count += countFiles(files[i]);
            }
            return count;
        }
    }
}
