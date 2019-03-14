package edu.temple.colorthing;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PaletteFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PaletteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaletteFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private PaletteFragmentListener listener;

    public interface PaletteFragmentListener {
        void colorSend(String color);
    }

    private OnFragmentInteractionListener mListener;

    public PaletteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PaletteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PaletteFragment newInstance(String param1, String param2) {
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_palette, container, false);
        // Inflate the layout for this fragment
        Spinner spinner = v.findViewById(R.id.spinner3);
        ColorAdapter adapter = new ColorAdapter(getActivity(), R.array.colors);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        return inflater.inflate(R.layout.fragment_palette, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PaletteFragmentListener) {
            listener = (PaletteFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement PaletteFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String color = parent.getItemAtPosition(position).toString();
        listener.colorSend(color);
            /*View back = findViewById(R.id.background);
            if (color.equals("DKGRAY")) {
                back.setBackgroundColor(-12303292);
            } else {
                back.setBackgroundColor(Color.parseColor(color));
            }*/
        //Intent intent = new Intent(this, ColorActivity.class);
        //Bundle b = new Bundle();
        //b.putString("color",color);
        //intent.putExtras(b);
        //startActivity(intent);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    class ColorAdapter extends BaseAdapter {
        Context context;
        String[] colors;
        public ColorAdapter(Context context, int arrayid){
            //this.PaletterFragment = context;
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
            else if(colors[position].equals("ROJO")){
                tv.setBackgroundColor(Color.parseColor("RED"));
            }
            else if(colors[position].equals("AZUL")){
                tv.setBackgroundColor(Color.parseColor("BLUE"));
            }
            else if(colors[position].equals("VERDE")){
                tv.setBackgroundColor(Color.parseColor("GREEN"));
            }
            else if(colors[position].equals("GRISOSCURO")){
                tv.setBackgroundColor(-12303292);
            }
            else if(colors[position].equals("CIAN")){
                tv.setBackgroundColor(Color.parseColor("CYAN"));
            }
            else if(colors[position].equals("GRIS")){
                tv.setBackgroundColor(Color.parseColor("GRAY"));
            }
            else if(colors[position].equals("AMARILLO")){
                tv.setBackgroundColor(Color.parseColor("YELLOW"));
            }
            else if(colors[position].equals("BLANCO")){
                tv.setBackgroundColor(Color.parseColor("WHITE"));
            }
            else if(colors[position].equals("NEGRO")){
                tv.setBackgroundColor(Color.parseColor("BLACK"));
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
}

