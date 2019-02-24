package edu.temple.colorthing;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        Bundle b = getIntent().getExtras();
        String color = b.getString("color");
        View back = findViewById(R.id.background2);
        if(color.equals("DKGRAY")){
            back.setBackgroundColor(-12303292);
        }
        else if(color.equals("ROJO")){
            back.setBackgroundColor(Color.parseColor("RED"));
        }
        else if(color.equals("AZUL")){
            back.setBackgroundColor(Color.parseColor("BLUE"));
        }
        else if(color.equals("VERDE")){
            back.setBackgroundColor(Color.parseColor("GREEN"));
        }
        else if(color.equals("GRISOSCURO")){
            back.setBackgroundColor(-12303292);
        }
        else if(color.equals("CIAN")){
            back.setBackgroundColor(Color.parseColor("CYAN"));
        }
        else if(color.equals("GRIS")){
            back.setBackgroundColor(Color.parseColor("GRAY"));
        }
        else if(color.equals("AMARILLO")){
            back.setBackgroundColor(Color.parseColor("YELLOW"));
        }
        else if(color.equals("BLANCO")){
            back.setBackgroundColor(Color.parseColor("WHITE"));
        }
        else if(color.equals("NEGRO")){
            back.setBackgroundColor(Color.parseColor("BLACK"));
        }
        else{
            back.setBackgroundColor(Color.parseColor(color));
        }

    }

}
