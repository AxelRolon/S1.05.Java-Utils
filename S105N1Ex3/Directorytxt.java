package S105N1Ex3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Arrays;


public class Directorytxt {

    public static void main(String[]args) throws IOException {
        FileWriter fw = new FileWriter("Test_1.txt");   // Create de txt.
        PrintWriter pw = new PrintWriter(fw);           // Print the txt

        fileOnDirectory(new File("C:\\\\Users\\\\formacio\\\\IdeaProjects\\\\Java Utils\\\\src\\\\S105N1Ex2"),pw);  //create the method with the route File and the printwriter as parameters
    }

    public static void fileOnDirectory(File directory,PrintWriter pw) throws IOException {
        System.out.println("D: " + directory);
        File[] list = directory.listFiles();
        Arrays.sort(list);
        if (list!=null) {
            for(File file:list) {
                if (file.isDirectory())
                    fileOnDirectory(file,pw);
                else {
                    pw.println("F: "+file+"***"+new Date(file.lastModified())); //Print names on txt with route selected and last modification data
                    System.out.println("F: "+file+"***"+new Date(file.lastModified()));
                }
            }
        }else {
            pw.println("F "+directory);  //Print on txt the names of the folders on the route selected
            System.out.println("F: "+directory);
        }
    }

}

