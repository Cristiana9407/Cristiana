package Lectia11;

import java.io.*;

public class Createfile {
    public static void main(String[] args) throws IOException {
        String file = "exemple.txt";
        File fisier = new File(file);
        if (fisier.createNewFile()) {
            System.out.println("fisierul este creat");
        } else {
            System.out.println("fisier exista");
        }
        try(
            PrintWriter writer = new PrintWriter(new FileWriter(file))){
                writer.println("Salut");
            }
        try (BufferedReader reader=new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    fisier.delete();

        }
    }



