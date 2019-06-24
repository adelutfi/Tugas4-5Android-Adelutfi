package com.example.lenovo.androiddasar3listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //logt
    private  static  final  String TAG = "DetailActivity";

    TextView tvnamaBuah;
    ImageView ivgambarbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namaBuah = getIntent().getStringExtra(Konstanta.DATANAMA);
        int gambarBuah = getIntent().getIntExtra(Konstanta.DATAGAMBAR, 0);

        //log
        Log.d(TAG, "Nama: "+ namaBuah);
        Log.d(TAG, "Gambar: "+ gambarBuah);

        tvnamaBuah = findViewById(R.id.tv_detail_nama);
        ivgambarbuah = findViewById(R.id.iv_detail_gambar);

        tvnamaBuah.setText(namaBuah);
        ivgambarbuah.setImageResource(gambarBuah);
    }
}
