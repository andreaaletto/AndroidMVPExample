package com.mahatma.esempiomvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mahatma.esempiomvp.Contract;
import com.mahatma.esempiomvp.R;

public class MainActivity extends AppCompatActivity implements Contract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
