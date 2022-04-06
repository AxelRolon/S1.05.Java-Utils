package S105N1Ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DirectoryReadPrint {

    public static void main(String[] args) throws IOException {

        File f1 = new File("Test_1.txt"); //the obj of the File class is created and the name of the txt file that we want to open is passed through parameter
        FileReader fr = new FileReader(f1); //the obj of the filereader class is created looks for the file where it is prompted
        BufferedReader br = new BufferedReader(fr); //the obj of the bufferedreader class is created that is used to read the entry of a file
        String lane = br.readLine(); // through the buffer, the .readLine() function is used to read a single line of text from the console
        System.out.println();

        while(lane!= null) { // if the line is not null it enters the while
            System.out.println(lane); //prints each line of the file
            lane = br.readLine(); //.readLine() used to read a single line of text from the console
        }

    }


}
