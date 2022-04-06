package S105N1Ex1;

import java.io.File;
import java.util.*;

public class Directory {

    public static void main(String[] args) {

    String route = "C:\\Users\\formacio";

    File directory = new File(route);//directorio a listar

    String[] list = directory.list();

    Arrays.sort(list); //Ordenamos alfabéticamente

    for(int i = 0; i<list.length; i++) {// Recorremos la lista
        System.out.println(list[i]);
    }

    }

}
