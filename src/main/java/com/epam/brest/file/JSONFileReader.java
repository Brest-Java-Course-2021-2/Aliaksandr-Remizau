package com.epam.brest.file;
import com.epam.brest.model.Price;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class JSONFileReader implements FileReader{

    @Override
    public Map<Integer, BigDecimal> readFileFromResources(String filePath) throws IOException {
        Map<Integer,BigDecimal> resultMap = new TreeMap<>();
        InputStream inputStream = getClass().getResourceAsStream("/" + filePath);
        Map<String,Map<Integer,BigDecimal>>result = new ObjectMapper().readValue(inputStream, Map.class);
            resultMap= (Map<Integer, BigDecimal>) result.values().stream().map(m);


        return resultMap;
    }
}

