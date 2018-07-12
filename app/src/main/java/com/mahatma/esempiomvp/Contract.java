package com.mahatma.esempiomvp;

public interface Contract {

    interface View {

        void setName(String name);
        void newNameStored();
    }

    interface Presenter {

        void requestName();
        void storeNewName(String name);
    }

}
