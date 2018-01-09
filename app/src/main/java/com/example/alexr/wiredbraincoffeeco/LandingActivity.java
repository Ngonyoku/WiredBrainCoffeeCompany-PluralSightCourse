package com.example.alexr.wiredbraincoffeeco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.alexr.wiredbraincoffeeco.Helpers.UrlHelper;
import com.squareup.picasso.Picasso;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        ImageView logo = (ImageView) findViewById(R.id.wired_brain);

        Picasso.with(this).load(UrlHelper.BaseUrl + "wired-brain-coffee-logo.png").fit().centerCrop().into(logo);
    }

    public void getStarted(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
