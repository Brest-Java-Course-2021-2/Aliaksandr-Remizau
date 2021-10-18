package com.epam.brest.model;

import java.math.BigDecimal;
import java.util.Scanner;

import static com.epam.brest.model.StatusType.READ_DATE;

public class ReadDate implements Status{
    Scanner scanner;

    public ReadDate(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Status handle() {
        if(userDate.size() <2){
            String inputValue = scanner.next();
            if(inputValue.equalsIgnoreCase("q")){
                return new Exit();
            }else if (isCorrectValue(inputValue)){
                userDate.add(new BigDecimal(inputValue));
            }
        }else{
            return new Calc(scanner);
        }
        return null;
    }


    private boolean isCorrectValue(String inputValue){
        try{
            BigDecimal enteredValue = new BigDecimal(inputValue);

        }catch (NumberFormatException e){
            System.out.println("Incorrect value" + inputValue);
        }
        return false;
    }

    @Override
    public StatusType getType() {
        return READ_DATE;
    }
}
