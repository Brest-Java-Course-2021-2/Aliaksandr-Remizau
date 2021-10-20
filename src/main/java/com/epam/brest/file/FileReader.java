package com.epam.brest.file;

import com.epam.brest.price.Price;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public interface FileReader {
 Map<Integer,BigDecimal> readFileFromResources(String filePath) throws IOException;
}
