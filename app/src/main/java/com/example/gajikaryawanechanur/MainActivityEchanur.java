package com.example.gajikaryawanechanur;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityEchanur extends AppCompatActivity {

    private Button btnGaji, btnPetunjuk, btnTentang, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_echanur);

        btnGaji = findViewById(R.id.btnGajiEchanur);
        btnPetunjuk = findViewById(R.id.btnPetunjukEchanur);
        btnTentang = findViewById(R.id.btnTentangEchanur);
        btnExit = findViewById(R.id.btnExitEchanur);

        btnGaji.setOnClickListener(v -> startActivity(new Intent(MainActivityEchanur.this, GajiActivityEchanur.class)));
        btnPetunjuk.setOnClickListener(v -> startActivity(new Intent(MainActivityEchanur.this, PetunjukActivityEchanur.class)));
        btnTentang.setOnClickListener(v -> startActivity(new Intent(MainActivityEchanur.this, TentangActivityEchanur.class)));
        btnExit.setOnClickListener(v -> finishAffinity());
    }
}