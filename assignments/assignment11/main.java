package com.zemoso.java.assignments.assignment11;

import java.io.*;
import java.util.HashMap;

class CharFinder {
    HashMap<Character, Integer> Map = new HashMap<Character, Integer>();

    public void characterCount(){
        try {
            FileReader fileread = new FileReader("C:\\Users\\risha\\IdeaProjects\\hello\\src\\com\\zemoso\\java\\assignments\\assignment11\\word.txt");
            int index;
            //converts every character to its ascii value
            while((index = fileread.read())!= -1) {
                if(index!=32) {
                    if(Map.containsKey((char)index)) {
                        Map.put((char)index, Map.get((char)index)+1);
                    }
                    else {
                        Map.put((char)index, 1);
                    }
                }
            }
            save();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {
            File f = new File("C:\\Users\\risha\\IdeaProjects\\hello\\src\\com\\zemoso\\java\\assignments\\assignment11\\word2.txt");
            FileWriter filewrite = new FileWriter(f);
            filewrite.write(Map.toString());
            filewrite.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class main {
    public static void main(String[] args) {
        CharFinder obj = new CharFinder();
        obj.characterCount();
    }
}
