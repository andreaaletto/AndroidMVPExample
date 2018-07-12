package com.mahatma.esempiomvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mahatma.esempiomvp.Contract;
import com.mahatma.esempiomvp.Presenter.Presenter;
import com.mahatma.esempiomvp.R;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private Presenter presenter;

    private TextView nameTextView;
    private Button getNameButton;
    private Button setNameButton;
    private EditText newNameEditText;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Model View Presenter");

        presenter = new Presenter(this);

        attachViews();
        attachButtonListners();
    }

    private void attachViews(){
        this.nameTextView = findViewById(R.id.name_tv);
        this.getNameButton = findViewById(R.id.btn_get);
        this.setNameButton = findViewById(R.id.btn_set);
        this.newNameEditText = findViewById(R.id.new_name_et);
    }

    private void attachButtonListners(){
        this.getNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.requestName();
            }
        });

        this.setNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.storeNewName(newNameEditText.getText().toString());
            }
        });
    }

    @Override
    public void setName(String name) {
        this.nameTextView.setText(name);
    }

    @Override
    public void newNameStored() {
        if(toast != null) toast.cancel();
        toast = Toast.makeText(this, newNameEditText.getText().toString() + " stored succesfully", Toast.LENGTH_SHORT);
        toast.show();
    }
}
