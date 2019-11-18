package io.github.rhildred.tictactoeleague;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.restart:
                // you will get the action from the menu in the activity
                // to send it to the fragment (main_fragment in our case)
                TicTacToeFragment fragment = (TicTacToeFragment) getSupportFragmentManager().findFragmentById(R.id.main_fragment);
                fragment.restart();
                return true;
            case R.id.scoreboard:
                startActivity(new Intent(getApplicationContext(), ScoreboardActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
