package com.example.alexr.wiredbraincoffeeco;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void getStarted(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
