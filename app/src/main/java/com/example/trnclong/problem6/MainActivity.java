package com.example.trnclong.problem6;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtSoA, edtSoB;
    TextView txtKetQua;
    Button btnActivity, btnAnonymous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        edtSoA = findViewById(R.id.edtSoA);
        edtSoB = findViewById(R.id.edtSoB);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnActivity = findViewById(R.id.btnActivity);
        btnAnonymous = findViewById(R.id.btnAnonymous);
    }

    private void addEvents() {
        // Su kien Anonymous listener
        btnAnonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = edtSoA.getText().toString();
                String b = edtSoB.getText().toString();
                if(kiemTraNhapDuLieu(a,b)==true) {
                    try{
                        int soA = Integer.parseInt(a);
                        int soB = Integer.parseInt(b);
                        txtKetQua.setText(soA+soB+"");
                    }
                    catch (Exception ex) {
                        Toast.makeText(MainActivity.this,"Vui Long Nhap So",Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Vui Long Nhap Du Lieu",Toast.LENGTH_LONG).show();
                }
            }
        });
        //
        btnActivity.setOnClickListener(this);
    }

    // Su kien Activity is listener
    @Override
    public void onClick(View v) {
        String a = edtSoA.getText().toString();
        String b = edtSoB.getText().toString();
        if(kiemTraNhapDuLieu(a,b)==true) {
            try{
                int soA = Integer.parseInt(a);
                int soB = Integer.parseInt(b);
                txtKetQua.setText(soA+soB+"");
            }
            catch (Exception ex) {
                Toast.makeText(MainActivity.this,"Vui Long Nhap So",Toast.LENGTH_LONG).show();
            }
        }
        else {
            Toast.makeText(MainActivity.this,"Vui Long Nhap Du Lieu",Toast.LENGTH_LONG).show();
        }
    }

    // Su kien onClick
    public void tinhTongBangOnClick(View view) {
        String a = edtSoA.getText().toString();
        String b = edtSoB.getText().toString();
        if(kiemTraNhapDuLieu(a,b)==true) {
            try{
                int soA = Integer.parseInt(a);
                int soB = Integer.parseInt(b);
                txtKetQua.setText(soA+soB+"");
            }
            catch (Exception ex) {
                Toast.makeText(MainActivity.this,"Vui Long Nhap So",Toast.LENGTH_LONG).show();
            }
        }
        else {
            Toast.makeText(MainActivity.this,"Vui Long Nhap Du Lieu",Toast.LENGTH_LONG).show();
        }
    }

    public boolean kiemTraNhapDuLieu(String a, String b) {
        if(a.isEmpty() || b.isEmpty()) {
            return false;
        }
        return true;
    }

}
