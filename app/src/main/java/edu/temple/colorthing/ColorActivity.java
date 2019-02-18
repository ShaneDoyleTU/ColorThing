package edu.temple.colorthing;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Context;

public class ColorActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    //String[] colorlist;

    class ColorAdapter extends BaseAdapter{
        Context context;
        String[] colors;
        public ColorAdapter(Context context,int arrayid){
            this.context = context;
            colors = context.getResources().getStringArray(arrayid);
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
            //LinearLayout layout;
            TextView tv;

            if(convertView!=null){
                //layout = (LinearLayout) convertView;
                tv = (TextView) convertView;
            }
            else{
                //layout = new LinearLayout(context);
                //LayoutInflater l = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //convertView = l.inflate(android.R.layout.simple_spinner_dropdown_item,parent,false);
                tv = new TextView(context);
            }


            //layout.setOrientation(LinearLayout.VERTICAL);
            tv.setText(colors[position]);
            if(colors[position].equals("DKGRAY")){
                tv.setBackgroundColor(-12303292);
            }
            else {
                tv.setBackgroundColor(Color.parseColor(colors[position]));
            }
            //layout.addView(tv);
            //String color = parent.getItemAtPosition(position).toString();
            //tv.setBackgroundColor(Color.parseColor(color));
            return tv;

        }

        /*private View initView(int position, View convertView, ViewGroup parent){
            if(convertView == null){
                convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_dropdown_item, parent, false);
            }
            TextView tv = convertView.
            return convertView;
        }*/


    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Spinner spinner = findViewById(R.id.spinner);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
        ColorAdapter adapter = new ColorAdapter(this, R.array.colors);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //adapter.initView()
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //colorlist = getResources().getStringArray(R.array.colors);

        //RelativeLayout current = (RelativeLayout) findViewById(R.id.background);
        //current.setBackgroundColor(Color.RED);

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //view.setBackgroundColor(Color.());

        //((TextView) parent.getChildAt(0)).setBackgroundColor(Color.);
        //view.setBackgroundColor(Color.parseColor(parent.getItemAtPosition(position).toString()));
        String color = parent.getItemAtPosition(position).toString();
        View back = findViewById(R.id.background);
        if(color.equals("DKGRAY")){
            back.setBackgroundColor(-12303292);
        }
        else {
            back.setBackgroundColor(Color.parseColor(color));
        }
        //parent.setBackgroundColor(Color.WHITE);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //View back = findViewById(R.id.background);
        //back.setBackgroundColor(Color.CYAN);

    }
}
