package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    CardView produk;
    CardView transaksi;
    CardView chatting;
    CardView profile;
    CardView history;
    CardView setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        produk = findViewById(R.id.produk);
        transaksi = findViewById(R.id.transaksi);
        chatting = findViewById(R.id.chatting);
        profile = findViewById(R.id.history);
        setting= findViewById(R.id.setting);

        transaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,activity_transaksi.class));
            }
        });

    }
}
