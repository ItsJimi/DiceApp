package fr.maiquez.jimi.diceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String STRING_NBR = "fr.maiquez.jimi.diceapp.NBR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submit(View view) {
        Intent newIntent = new Intent(this, DeActivity.class);
        EditText number = (EditText) findViewById(R.id.number);
        String string_nbr = number.getText().toString();
        newIntent.putExtra(STRING_NBR, string_nbr);
        startActivity(newIntent);
    }
}
