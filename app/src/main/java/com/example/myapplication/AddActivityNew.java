package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivityNew extends AppCompatActivity {

    EditText title_inputn, author_inputn, name_inputn, fname_inputn;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        title_inputn = findViewById(R.id.title_inputn);
        author_inputn = findViewById(R.id.author_inputn);
        name_inputn = findViewById(R.id.name_inputn);
        fname_inputn = findViewById(R.id.fname_inputn);
        add_button = findViewById(R.id.add_buttonn);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivityNew.this);
                myDB.addBookNew(title_inputn.getText().toString().trim(),
                        author_inputn.getText().toString().trim(), name_inputn.getText().toString().trim(),
                        fname_inputn.getText().toString().trim());
            }
        });
    }
}