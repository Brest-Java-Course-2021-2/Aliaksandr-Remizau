package com.epam.brest;
import com.epam.brest.file.FileReader;
import com.epam.brest.model.ReadDataState;
import com.epam.brest.model.Status;
import com.epam.brest.model.StatusType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        FileReader fileReader = (FileReader) context.getBean("fileReader");

        Map<Integer,BigDecimal> pricePerKgMap = fileReader.readFileFromResources("distance_price.json");
        Map<Integer,BigDecimal> pricePerKmMap = fileReader.readFileFromResources("weight_price.json");

        try (Scanner scanner = new Scanner(System.in)) {
            Status currentStatus = new ReadDataState(scanner,pricePerKgMap,pricePerKmMap);
            while (currentStatus.getType()!= StatusType.EXIT){
                System.out.println("Current  system status :" + currentStatus.getType() );
                currentStatus= currentStatus.handle();
            }
        }
    }
}
