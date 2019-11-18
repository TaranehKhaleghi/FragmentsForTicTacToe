package io.github.rhildred.tictactoeleague;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class TicTacToeFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    Spinner spinner1, spinner2;
    private PlayerDB db;
    // this will contain the selected player
    String sPlayer1 = null, sPlayer2 = null;

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
        db = new PlayerDB(this.getContext());
        updateDisplay();
        return view;
    }

    private void updateDisplay() {
        // create a List of Map<String, ?> objects
        ArrayList<Player> data = db.getPlayers();
        ArrayAdapter<Player> adapter =
                new ArrayAdapter<Player>(this.getContext(),  android.R.layout.simple_spinner_dropdown_item, data);
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
    }

    //*****************************************************
    // Event handler for the Spinner
    //*****************************************************
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position,
                               long id) {
        ArrayList<Player> data = db.getPlayers();
        if(v.getId() == this.spinner1.getId()){
            this.sPlayer1 = data.get(position).get("id");
        }else{
            this.sPlayer2 = data.get(position).get("id");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing
    }

    public void restart() {
        this.updateDisplay();
        Toast.makeText(this.getContext(), "Restart Game", Toast.LENGTH_SHORT).show();
    }
}
