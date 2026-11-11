package com.example.gajikaryawanechanur;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class GajiActivityEchanur extends AppCompatActivity {

    private EditText etGajiPokok, etTunjJabatan, etHariKerja;
    private EditText etTunjMakan, etTunjTransport, etGajiKotor, etGajiBersih;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_echanur);

        etGajiPokok = findViewById(R.id.etGajiPokokEchanur);
        etTunjJabatan = findViewById(R.id.etTunjJabatanEchanur);
        etHariKerja = findViewById(R.id.etHariKerjaEchanur);

        etTunjMakan = findViewById(R.id.etTunjMakanEchanur);
        etTunjTransport = findViewById(R.id.etTunjTransportEchanur);
        etGajiKotor = findViewById(R.id.etGajiKotorEchanur);
        etGajiBersih = findViewById(R.id.etGajiBersihEchanur);

        btnHitung = findViewById(R.id.btnHitungEchanur);

        btnHitung.setOnClickListener(v -> hitungGaji());
    }

    private void hitungGaji() {
        String strGajiPokok = etGajiPokok.getText().toString();
        String strTunjJabatan = etTunjJabatan.getText().toString();
        String strHariKerja = etHariKerja.getText().toString();

        if (strGajiPokok.isEmpty() || strTunjJabatan.isEmpty() || strHariKerja.isEmpty()) {
            Toast.makeText(this, "Harap lengkapi data Gaji Pokok, Tunjangan, dan Hari Kerja!", Toast.LENGTH_SHORT).show();
            return;
        }

        double gajiPokok = Double.parseDouble(strGajiPokok);
        double tunjJabatan = Double.parseDouble(strTunjJabatan);
        int hariKerja = Integer.parseInt(strHariKerja);

        // Rumus Sesuai Ketentuan Soal UTS
        double tunjMakan = hariKerja * 10000;
        double tunjTransport = hariKerja * 5000;
        double gajiKotor = gajiPokok + tunjJabatan + tunjMakan + tunjTransport;
        double pajak = 0.10 * gajiKotor;
        double gajiBersih = gajiKotor - pajak;

        // Tampilkan Hasil ke Layar
        etTunjMakan.setText(String.format("Rp %.0f", tunjMakan));
        etTunjTransport.setText(String.format("Rp %.0f", tunjTransport));
        etGajiKotor.setText(String.format("Rp %.0f", gajiKotor));
        etGajiBersih.setText(String.format("Rp %.0f", gajiBersih));
    }
}