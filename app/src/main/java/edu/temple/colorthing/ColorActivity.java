package edu.temple.colorthing;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    //String[] colorlist;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //colorlist = getResources().getStringArray(R.array.colors);

        //RelativeLayout current = (RelativeLayout) findViewById(R.id.background);
        //current.setBackgroundColor(Color.RED);

    }
    class ColorAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent){
            TextView tv = (TextView) convertView;
            String color = parent.getItemAtPosition(position).toString();
            tv.setBackgroundColor(Color.parseColor(color));
            return tv;
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //view.setBackgroundColor(Color.());

        //((TextView) parent.getChildAt(0)).setBackgroundColor(Color.);
        //view.setBackgroundColor(Color.parseColor(parent.getItemAtPosition(position).toString()));
        String color = parent.getItemAtPosition(position).toString();
        View back = findViewById(R.id.background);
        back.setBackgroundColor(Color.parseColor(color));
        parent.setBackgroundColor(Color.WHITE);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //View back = findViewById(R.id.background);
        //back.setBackgroundColor(Color.CYAN);

    }
}
