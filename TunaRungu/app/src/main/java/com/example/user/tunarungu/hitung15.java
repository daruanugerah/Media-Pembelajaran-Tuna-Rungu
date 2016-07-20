package com.example.user.tunarungu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class hitung15 extends AppCompatActivity {
    private Button btnkembali, btnlihat;
    private EditText edtsoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung15);
        getSupportActionBar().setTitle("Soal Kelimabelas");

        btnkembali = (Button)findViewById(R.id.btn_kembali);
        btnlihat = (Button)findViewById(R.id.btn_lihat);
        edtsoal = (EditText)findViewById(R.id.edt_soal);

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hitung15.this, hitung14.class);
                startActivity(intent);
                finish();
            }
        });

        btnlihat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (edtsoal.getText().toString().equals("")) {
                    Toast.makeText(hitung15.this, "ISI DAHULU JAWABANNYA", Toast.LENGTH_SHORT).show();
                } else if (edtsoal.getText().toString().equals("81")) {

                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.toast_benar,
                            (ViewGroup) findViewById(R.id.toastbenar));

                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                } else {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.toast_salah,
                            (ViewGroup) findViewById(R.id.toastsalah));

                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();

                }


            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hitung1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            kali();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void kali() {
        Intent i = new Intent(hitung15.this, perkalian.class);
        startActivity(i);

    }
}
