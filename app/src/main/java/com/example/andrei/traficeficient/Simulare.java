package com.example.andrei.traficeficient;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Simulare.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Simulare#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Simulare extends Fragment  {

    View view;

    Button random ;
    Button numerar;

    CheckBox trei;
    CheckBox patru;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Simulare() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Simulare.
     */
    // TODO: Rename and change types and number of parameters
    public static Simulare newInstance(String param1, String param2) {
        Simulare fragment = new Simulare();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_simulare, container, false);

        getActivity().setTitle("Simulare");

        random = (Button)view.findViewById(R.id.button4);
        numerar = (Button)view.findViewById(R.id.button5);

        trei = (CheckBox)view.findViewById(R.id.checkBox3);
        patru = (CheckBox)view.findViewById(R.id.checkBox4);

        trei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(patru.getVisibility()==View.INVISIBLE){
                    patru.setVisibility(View.VISIBLE);
                    numerar.setVisibility(View.INVISIBLE);
                    random.setVisibility(View.INVISIBLE);
                }
                else {
                    patru.setVisibility(View.INVISIBLE);
                    numerar.setVisibility(View.VISIBLE);
                    random.setVisibility(View.VISIBLE);
                }
            }
        });

        patru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(trei.getVisibility()==View.INVISIBLE){
                    trei.setVisibility(View.VISIBLE);
                    numerar.setVisibility(View.INVISIBLE);
                    random.setVisibility(View.INVISIBLE);
                }
                else {
                    trei.setVisibility(View.INVISIBLE);
                    numerar.setVisibility(View.VISIBLE);
                    random.setVisibility(View.VISIBLE);
                }

            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(patru.getVisibility()==View.INVISIBLE){

                    Intent i = new Intent(getContext(), Aleatoriu.class);
                    i.putExtra("3 drumuri", "1");
                    startActivity(i);

                }
                else if(trei.getVisibility()==View.INVISIBLE){

                    Intent i = new Intent(getContext(), Aleatoriu.class);
                    i.putExtra("4 drumuri", "2");
                    startActivity(i);

                }

            }
        });

        numerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(patru.getVisibility()==View.INVISIBLE){

                    Intent i = new Intent(getContext(), Numerar.class);
                    i.putExtra("3 drumuri", "1");
                    startActivity(i);

                }
                else if(trei.getVisibility()==View.INVISIBLE){

                    Intent i = new Intent(getContext(), Numerar.class);
                    i.putExtra("4 drumuri", "2");
                    startActivity(i);

                }

            }
        });

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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

}
