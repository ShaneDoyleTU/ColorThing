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
        else{
            back.setBackgroundColor(Color.parseColor(color));
        }

    }

}
