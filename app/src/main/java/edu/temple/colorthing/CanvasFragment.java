package edu.temple.colorthing;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class CanvasFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public View v;



    public CanvasFragment() {
        // Required empty public constructor
    }
    public void colorChange(String color){
        View back = v.findViewById(R.id.back);
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

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CanvasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CanvasFragment newInstance(String param1, String param2) {
        CanvasFragment fragment = new CanvasFragment();
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_canvas, container, false);
        this.v = v;
        return inflater.inflate(R.layout.fragment_canvas, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

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


}
