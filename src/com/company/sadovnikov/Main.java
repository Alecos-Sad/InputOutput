package com.company.sadovnikov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	FileManager fileManager = new FileManager();
	//fileManager.readBytes();
	//fileManager.readLines();
		List<String> list = fileManager.read();
		for (String s : list) {
			System.out.print(s);
		}
    }
}
