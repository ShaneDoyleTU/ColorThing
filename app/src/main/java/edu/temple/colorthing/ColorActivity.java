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
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
        ColorAdaprer adapter = new ColorAdapter(this, R.array.colors);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //colorlist = getResources().getStringArray(R.array.colors);

        //RelativeLayout current = (RelativeLayout) findViewById(R.id.background);
        //current.setBackgroundColor(Color.RED);

    }
    class ColorAdapter extends BaseAdapter{
        Context context;
        String[] colors;
        public ColorAdapter(Context context,int arrayid){
            this.context = context;
            colors = context.GetStringArray(arrayid)
        }
        @Override
        public int getCount() {
            return colors.length;
        }

        @Override
        public Object getItem(int position) {
            return colors[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView tv = new TextView(context);
            tv.setText(colors[position]);
            tv.setBackgroundColor(Color.WHITE);
            return tv;
        }
        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent){
            //put if else for convertView
            TextView tv;
            if(convertView!=null){
                tv = (TextView) convertView;
            }
            else{
                tv = new TextView(context);
            }
            tv.setText(colors[position]);
            tv.setBackGroundColor(Color.parseColor(colors[position]);
            //String color = parent.getItemAtPosition(position).toString();
            //tv.setBackgroundColor(Color.parseColor(color));
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
