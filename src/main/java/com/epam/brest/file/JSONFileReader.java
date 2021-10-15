package com.epam.brest.file;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class JSONFileReader implements FileReader{
    @Override
    public Map<Integer, BigDecimal> readFileFromResources(String fileName) throws IOException {
        Map<Integer,BigDecimal> resultMap = new TreeMap<>();

        InputStream inputStream = getClass().getResourceAsStream("/" + fileName);
        try(InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            String [] values;
            while ((line = bufferedReader.readLine()) != null){
                values= line.split(",");
                resultMap.put(Integer.valueOf(values[0]),new BigDecimal(values[1]));

            }
        }
        return resultMap;
    }
}