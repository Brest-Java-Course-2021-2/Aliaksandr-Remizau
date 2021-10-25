package com.epam.brest.file;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public interface FileReader {
 Map<Integer,BigDecimal> readFileFromResources(String filePath) throws IOException;
}
