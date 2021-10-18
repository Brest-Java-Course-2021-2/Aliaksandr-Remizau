package com.epam.brest.model;

import java.math.BigDecimal;
import java.util.Scanner;

import static com.epam.brest.model.StatusType.CALC;

public class Calc implements Status{
    Scanner scanner;

    public Calc(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Status handle() {
        try{
            System.out.println("Result"+userDate.get(0).multiply(BigDecimal.valueOf(1)).add(userDate.get(1).multiply(BigDecimal.valueOf(1))));

        }catch(){

        }finally {
            userDate.clear();
        }

        return new ReadDate(scanner);
    }

    @Override
    public StatusType getType() {
        return CALC;
    }
}
