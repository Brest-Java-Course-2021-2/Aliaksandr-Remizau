package com.epam.brest;
import com.epam.brest.calc.CalcImpl;
import com.epam.brest.file.JSONFileReader;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    private static final String WEIGHT_PRICE ="weight_price.json";
    private static final String LENGTH_PRICE ="length_price.json";

    public static void main(String[] args) throws IOException {

        BigDecimal weight;
        BigDecimal length;

        //new JSONFile
        //add file to resources
        //fix method main

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                weight = getValueFromConsole(scanner, "Enter weight:");
                length = getValueFromConsole(scanner, "Enter length(km):");

                System.out.println("Result = " + new CalcImpl().handle(weight,length));
                scanner.nextLine();
                if( "q".equalsIgnoreCase(userConsoleChoose(scanner))){
                    break;
                }
            } while (true);
        }
    }

    private static BigDecimal getValueFromConsole(Scanner scanner,String outputMessage){
        BigDecimal enteredValue = BigDecimal.valueOf(0);
        System.out.println(outputMessage);
        try{
            enteredValue = scanner.nextBigDecimal().setScale(2, RoundingMode.HALF_UP);
        }catch (NumberFormatException e){
        System.out.println("Entered value has wrong format.Try again  and enter BigDecimal format");
        }
      return enteredValue;
    }

    private static String userConsoleChoose(Scanner scanner){
        System.out.println("Enter ' q ' if you want to exit.");
        return scanner.nextLine();
    }
}
