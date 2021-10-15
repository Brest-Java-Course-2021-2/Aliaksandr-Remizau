package com.epam.brest.file;
import com.epam.brest.price.Price;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class JSONFileReader implements FileReader{
    Price prices;
    @Override
     public  Price readFileFromResources(String fileName) throws IOException {
        /*Map<BigDecimal,BigDecimal> mapReadFile = new TreeMap<>();
        InputStream inputStream = getClass().getResourceAsStream("/" + fileName);
        try(InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            JsonElement root = new JsonParser().parse(bufferedReader)))
            /*JsonObject object = root.getAsJsonObject().get("shopping_list").getAsJsonObject();

            Gson gson = new Gson();
            for (Entry<String, JsonElement> entry : object.entrySet()) {
                ShoppingList shoppingList = gson.fromJson(entry.getValue(), ShoppingList.class);
                System.out.println(shoppingList.getLabel());
            }
        }
        return Price;
    }
}
