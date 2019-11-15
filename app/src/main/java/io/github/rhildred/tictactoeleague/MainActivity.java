package io.github.rhildred.tictactoeleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // you will get the action from the menu in the activity
        // to send it to the fragment (main_fragment in our case)
        // TicTacToeFragment fragment = (TicTacToeFragment) getSupportFragmentManager().findFragmentById(R.id.main_fragment);
        // fragment.<specific_function_name>();
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
