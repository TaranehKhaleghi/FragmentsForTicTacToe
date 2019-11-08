package io.github.rhildred.tictactoeleague;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TicTacToeFragment extends Fragment {

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
        return view;
    }

}
