package Lectia11.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class txt {

    public static void main(String[] args) {
        String file = "data.txt";
        File fisier = new File(file);
        Scanner  scanner = new Scanner(System.in);

        try (

                PrintWriter writer = new PrintWriter(new FileWriter(file)))
        {
            for ( int i = 1; i<=3; i++) {
                System.out.println( "Introduceti linia" + i + ":");
                String rand = scanner.nextLine();

                writer.write(rand  + System.lineSeparator());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}