package com.mahatma.esempiomvp.Presenter;

import com.mahatma.esempiomvp.Contract;
import com.mahatma.esempiomvp.Model.RandomNamesModel;

import java.util.ArrayList;
import java.util.Arrays;

public class Presenter implements Contract.Presenter {

    private Contract.View view;
    private RandomNamesModel model;

    public Presenter(Contract.View view){
        String[] names = {"Andrea", "Umberto", "Francesco", "Giuseppe", "Giovanni", "Gennaro", "Michele", "Paolo"};
        model = new RandomNamesModel(new ArrayList<>(Arrays.asList(names)));
        this.view = view;
    }

    @Override
    public void requestName() {
        String name = model.getName();
        view.setName(name);
    }

    @Override
    public void storeNewName(String name) {
        model.setNewName(name);
        view.newNameStored();
    }
}
