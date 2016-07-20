package com.example.user.tunarungu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class soal5 extends AppCompatActivity {
    private EditText edtsoal;
    private Button btnlihat, btnlanjut, btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);
        getSupportActionBar().setTitle("Soal Kelima");

        edtsoal = (EditText) findViewById(R.id.edt_soal);
        btnlihat = (Button) findViewById(R.id.btn_lihat);
        btnlanjut = (Button) findViewById(R.id.btn_lanjut);
        btnkembali = (Button) findViewById(R.id.btn_kembali);

        btnlanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(soal5.this, soal6.class);
                startActivity(intent);
                finish();
            }
        });

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(soal5.this, soal4.class);
                startActivity(intent);
                finish();
            }
        });

        btnlihat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (edtsoal.getText().toString().equals("")) {
                    Toast.makeText(soal5.this, "ISI DAHULU JAWABANNYA", Toast.LENGTH_SHORT).show();
                } else if (edtsoal.getText().toString().equals("SUSI MEMBUANG SAMPAH") || edtsoal.getText().toString().equals("susi membuang sampah")) {

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

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soal5, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
