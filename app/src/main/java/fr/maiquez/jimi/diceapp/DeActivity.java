package fr.maiquez.jimi.diceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de);

        launch(null);
    }

    public void launch(View view) {
        Intent intent = getIntent();
        String string_nbr = intent.getStringExtra(MainActivity.STRING_NBR);
        int nbr = (isNumber(string_nbr)) ? Integer.parseInt(string_nbr) : 6;
        int randNbr = (int) ((Math.random() * nbr) + 1);
        String de = String.valueOf(randNbr);
        TextView number;
        number = (TextView) findViewById(R.id.number);
        if (number != null) {
            number.setText(de);
        }
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {}
        return false;
    }
}
