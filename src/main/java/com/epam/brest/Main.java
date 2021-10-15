package com.epam.brest;
import com.epam.brest.calc.CalcImpl;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigDecimal weight;
        BigDecimal pricePerKg;
        BigDecimal length;
        BigDecimal pricePerKm;
        //new JSONFile
        //add file to resources
        //fix method main



        try (Scanner scanner = new Scanner(System.in)) {
            do {
                weight = getValueFromConsole(scanner, "Enter weight:");
                pricePerKg = getValueFromConsole(scanner, "Enter Price per kilogram:");
                length = getValueFromConsole(scanner, "Enter length(km):");
                pricePerKm = getValueFromConsole(scanner, "Enter price per kilometre:");
            } while (!scanner.hasNext("q"));
            System.out.println("Result = " + new CalcImpl().handle(weight,pricePerKg,length,pricePerKm));
        }
    }

    private static BigDecimal getValueFromConsole(Scanner scanner,String outputMessage){
        BigDecimal enteredValue;
        System.out.println(outputMessage);
        enteredValue = scanner.nextBigDecimal();
      return enteredValue;
    }

}
