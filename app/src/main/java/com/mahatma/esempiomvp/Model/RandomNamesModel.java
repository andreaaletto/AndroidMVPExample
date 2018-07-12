package com.mahatma.esempiomvp.Model;

import java.util.ArrayList;
import java.util.Random;

public class RandomNamesModel {

    private ArrayList<String> names;

    public RandomNamesModel(){
        names = new ArrayList<>();
    }
    public RandomNamesModel(ArrayList<String> names){
        this.names = names;
    }

    public String getName(){
        return names.get((new Random().nextInt(names.size())));
    }

    public void setNewName(String newName){
        names.add(newName);
    }

}
