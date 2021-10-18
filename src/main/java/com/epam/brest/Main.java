package com.epam.brest;
import com.epam.brest.model.ReadDate;
import com.epam.brest.model.Status;
import com.epam.brest.model.StatusType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static final String WEIGHT_PRICE ="weight_price.json";
    private static final String LENGTH_PRICE ="length_price.json";

    public static void main(String[] args) throws IOException {

        BigDecimal weight;
        BigDecimal length;

        //fix JSONFile
        //fix method main
        //Price


        try (Scanner scanner = new Scanner(System.in)) {
            Status currentStatus = new ReadDate(scanner);
            while (currentStatus.getType()!= StatusType.EXIT){
                System.out.println("current type" + currentStatus.getType() );
                currentStatus= currentStatus.handle();
            }
        }
    }
}
