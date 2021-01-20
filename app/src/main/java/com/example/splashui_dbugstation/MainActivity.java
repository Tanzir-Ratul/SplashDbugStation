package com.example.splashui_dbugstation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonGo;
    private TextView textViewStudio, textViewtattoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudio = findViewById(R.id.tvStudioID);
        textViewtattoo = findViewById(R.id.tvTattooID);
        buttonGo = findViewById(R.id.btnGoId);
        //custom font
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/poppins_italic.ttf");
        textViewtattoo.setTypeface(customfont);
        buttonGo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnGoId) {
            Toast.makeText(this, "GO Button works", Toast.LENGTH_SHORT).show();
        }


    }
}