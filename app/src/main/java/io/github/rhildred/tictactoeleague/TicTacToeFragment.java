package io.github.rhildred.tictactoeleague;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;


public class TicTacToeFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    Spinner spinner1, spinner2;

    public TicTacToeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);
        // in here link the controls with view.findViewById
        // You will also need this.getActivity().getSharedPreferences if you use things like shared preferences.
        // this.getActivity may also be helpful for communicating between fragments
        this.spinner1 = (Spinner) view.findViewById(R.id.player1);
        this.spinner2 = (Spinner) view.findViewById(R.id.player2);
        return view;
    }
    //*****************************************************
    // Event handler for the Spinner
    //*****************************************************
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position,
                               long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing
    }

}
