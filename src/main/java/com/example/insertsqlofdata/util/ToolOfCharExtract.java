package com.example.insertsqlofdata.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ToolOfCharExtract {

    public ArrayList<String> initFile(String path, String split){
        ArrayList<String> array = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(split);

                // 将拆分后的单词存储在数组中
                for (String word : words) {
                    array.add(i,word);
                    i++;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        return array;
    }
}
