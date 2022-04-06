package S105N1Ex2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class DirectoryTree {
    public static void main(String[] args) {

        directoryTree(new File("C:\\Users\\formacio\\IdeaProjects\\Java Utils\\src\\S105N1Ex2"));//Call the method with the route inside the object File()
    }


    public static void directoryTree(File directory) {

        System.out.println("D: " + directory);

        File[] list = directory.listFiles();
        Arrays.sort(list); //Ordenamos alfabéticamente
        if (list != null) {
            for (File file : list) {
                if (file.isDirectory())
                    directoryTree(file);
                else {
                    System.out.println("F: " + file + "***" + new Date(file.lastModified()));
                }
            }

        }
        else{
                System.out.println("F: " + directory);

            }


        }

    }

