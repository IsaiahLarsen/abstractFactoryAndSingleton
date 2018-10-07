package program4;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import static program4.Provider.getFactory;

public class Main {

    public static void main(String[] args) throws IOException {
        //File path for reading low or high resolution
        Path path = Paths.get("factories.txt");
        Path absolutePath = path.toAbsolutePath();

        File file = new File(String.valueOf(absolutePath));

        BufferedReader br = null;
        //try to open file for reading
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CreateFactory factory;
        String st;
        //read file while not null assigning a factory and printing
        while ((st = br.readLine()) != null) {
            factory = getFactory(st);
            factory.print();
        }
    }
}
