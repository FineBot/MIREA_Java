package Exc_23;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    static void write(String text, String fileName) throws IOException {
        FileWriter file = new FileWriter(fileName);
        file.write(text);
        file.close();
    }

    static String read(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        int c;
        String result = "";
        while ((c = file.read()) != -1) {
            result+=((char) c);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        // C:\Users\kiril\IdeaProjects\MIREA\src\Exc_23\test.txt

        System.out.print("Имя файла: ");
        Scanner sc = new Scanner(System.in);
        String fileName=sc.nextLine();
        System.out.print("Текст: ");
        String text = sc.nextLine();
        write(text,fileName);

        System.out.print("\nКакой файл читать: ");
        fileName=sc.nextLine();
        System.out.println(read(fileName));

        System.out.print("\nчто заменить: ");
        String a=sc.nextLine();
        System.out.print("\nна что заменить: ");
        String b=sc.nextLine();
        String c=read(fileName);
        write(c.replace(a,b),fileName);


        System.out.print("\nКуда записывать: ");
        fileName=sc.nextLine();
        System.out.print("Что записать: ");
        text=sc.nextLine();
        String buff = read(fileName);
        write(buff+"\n\n"+text, fileName);

    }

}
