package com.example.gajikaryawanechanur;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PetunjukActivityEchanur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk_echanur);

        Button btnKembali = findViewById(R.id.btnKembaliPetunjukEchanur);
        btnKembali.setOnClickListener(v -> finish());
    }
}