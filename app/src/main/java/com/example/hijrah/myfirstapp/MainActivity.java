package com.example.hijrah.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hijrah.myfirstapp.R;

public class MainActivity extends AppCompatActivity {

    private EditText edtData;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        isi variabel / casting
        edtData = (EditText) findViewById(R.id.edt_data);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        setBtnSubmitClicked();
    }

    //abuabu method belum dipanggil
    private void setBtnSubmitClicked() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                String data = edtData.getText().toString();

                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("dataku", data);
                startActivity(detailIntent);
            }
        });
    }
}
