package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Object Button;
    private TextView politica1;
    private TextView sobre1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener()
                politica1= findViewById(R.id.politica);
                sobre1=findViewById(R.id.sobre);
                politica1.setOnClickListener(new View.OnClickListener() {{
             @Override
            public void onClick(View ) {
                        Intent novaJanela = new Intent(getApplicationContext(), PoliticaActivity.class);
                        startActivity(novaJanela);
                    }
                });
    sobre1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent novaJanela = new Intent(getApplicationContext(), SobreActivity.class);
                            startActivity(novaJanela);
                        }
                    });
            }
        });
    }
    private  void alert (String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}