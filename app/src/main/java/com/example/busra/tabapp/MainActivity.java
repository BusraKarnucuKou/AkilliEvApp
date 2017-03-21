package com.example.busra.tabapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by busra on 18.03.2017.
 */

public class MainActivity extends AppCompatActivity {

    Button btn_giris;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_container);

        imageView = (ImageView) findViewById(R.id.imageView);

        btn_giris = (Button) findViewById(R.id.btn_giris);

        btn_giris.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TabsActivity.class);//Deneme amaçlı class değiştiriyorum
                startActivity(intent);

            }
        }));


    }
}