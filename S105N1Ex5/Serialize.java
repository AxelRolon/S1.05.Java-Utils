package S105N1Ex5;

import java.util.*;
import java.io.*;

public class Serialize {

    public static void main(String[] args) {

        Admin boss = new Admin ("Charlie", 155000, 2023, 10, 15);
        boss.setIncentive(10000);

        Employee[] workers = new Employee[3];
        workers[0] = boss;
        workers[1] = new Employee("Sean",50000, 2024, 10, 1);
        workers[2] = new Employee("Chris",28000, 2025, 9,5);

        try{
            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("C:\\Users\\formacio\\IdeaProjects\\S1.05.Java Utils.txt"));

            writeFile.writeObject(workers);
            writeFile.close();

            ObjectInputStream backUpFile = new ObjectInputStream(new FileInputStream("C:\\Users\\formacio\\IdeaProjects\\S1.05.Java Utils.txt"));

            Employee[] workers_backUp =(Employee[]) backUpFile.readObject();

            backUpFile.close();

            for (Employee e : workers_backUp) {
                System.out.println(e);

            }

        }catch(Exception e){

        }



    }
}
