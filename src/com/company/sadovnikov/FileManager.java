package com.company.sadovnikov;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManager {

    private static final String FILE_NAME = "file.txt";
    private static final String DATA = "SadovNick\nAlexander\n!!!";

    public void write() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))){
            bufferedWriter.write(DATA);
            bufferedWriter.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void readBytes() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            int digit;
            while ((digit = bufferedReader.read()) != -1){
                System.out.print((char) digit);
            }
        } catch (IOException ex){
            System.out.print(ex.getMessage());
        }
    }

    public void readLines(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public List<String> read(){
        List<String> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
                return list;
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return Collections.emptyList();
    }
}
