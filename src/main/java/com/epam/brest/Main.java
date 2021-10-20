package com.epam.brest;
import com.epam.brest.file.CSVFileReader;
import com.epam.brest.model.ReadDataState;
import com.epam.brest.model.Status;
import com.epam.brest.model.StatusType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<Integer,BigDecimal> pricePerKmMap = new CSVFileReader().readFileFromResources("weight_price.csv");
        Map<Integer,BigDecimal> pricePerKgMap = new CSVFileReader().readFileFromResources("distance_price.csv");

        try (Scanner scanner = new Scanner(System.in)) {
            Status currentStatus = new ReadDataState(scanner,pricePerKgMap,pricePerKmMap);
            while (currentStatus.getType()!= StatusType.EXIT){
                System.out.println("Current  system status :" + currentStatus.getType() );
                currentStatus= currentStatus.handle();
            }
        }
    }
}
