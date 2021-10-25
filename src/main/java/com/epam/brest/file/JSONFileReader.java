package com.epam.brest.file;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class JSONFileReader implements FileReader{

    @Override
    public Map<Integer, BigDecimal> readFileFromResources(String filePath)  {
        InputStream inputStream = getClass().getResourceAsStream("/" + filePath);
        Map<Integer,BigDecimal> resultMap = new TreeMap<>();
        try(InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){

            Map<String,Map<Integer,BigDecimal>>mapPrices = new ObjectMapper().readValue(bufferedReader, HashMap.class);

            for (Map<Integer, BigDecimal> map : mapPrices.values()) {
                for (Map.Entry<Integer, BigDecimal> entry : map.entrySet()) {
                    resultMap.put( Integer.parseInt(String.valueOf(entry.getKey())),
                            new BigDecimal(String.valueOf(entry.getValue())));
                }
            }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println(resultMap);
        return resultMap;
    }
}

