package com.filehandling;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Session10 {
    public static void main(String[] args) {
        String filename = "text";  
        Map<String, Integer> map = new HashMap<>();

        try (FileReader fr = new FileReader(filename)) {
            int byteData;
            while ((byteData = fr.read()) != -1) {
            	Character character = (char) byteData;
            	String str = character.toString().toUpperCase();
                
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }

        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}