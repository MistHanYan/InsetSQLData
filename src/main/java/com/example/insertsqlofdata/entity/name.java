package com.example.insertsqlofdata.entity;

import com.example.insertsqlofdata.util.ToolOfCharExtract;

import java.util.ArrayList;

public class name {
    private static final String namePath = "src/main/resources/data/name.txt";
    private static final String lastNamePath = "src/main/resources/data/lastName.txt";

    public ArrayList<String> getName(){
        return new ToolOfCharExtract().initFile(namePath,"、");
    }

    public ArrayList<String> getLastName(){
        return new ToolOfCharExtract().initFile(lastNamePath,"");
    }
}
