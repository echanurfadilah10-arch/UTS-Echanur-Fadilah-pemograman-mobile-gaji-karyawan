package com.example.gajikaryawanechanur;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TentangActivityEchanur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_echanur);

        Button btnKembali = findViewById(R.id.btnKembaliTentangEchanur);
        btnKembali.setOnClickListener(v -> finish());
    }
}