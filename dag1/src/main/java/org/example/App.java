package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        int value = 0;
        File myObj = new File("input.txt");
        System.out.println("test");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String values = data.replaceAll("([a-z])", "");
            String[] valueArray = values.split("");
            if (valueArray.length > 1) {
             value += Integer.parseInt(valueArray[0] +valueArray[valueArray.length - 1]);
            }else{
                value += Integer.parseInt(valueArray[0]);
            }


            System.out.println(value);


        }
    }
}
