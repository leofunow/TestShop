package com.lfs.testshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout newLayot;
    private ScrollView mainprod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainprod = findViewById(R.id.scr1);
        newLayot = findViewById(R.id.scr2);
        newLayot.setVisibility(View.GONE);
    }
    public void ButtonClicked(View view){
        newLayot.setVisibility(View.VISIBLE);
    }
    public void ButtondeClicked(View view){
        newLayot.setVisibility(View.GONE);
    }
}
