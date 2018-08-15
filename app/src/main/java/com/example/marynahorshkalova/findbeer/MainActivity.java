package com.example.marynahorshkalova.findbeer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {

        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());

        List<String> brandsList = expert.getBrands(beerType);

        // build a string using the values in the List
        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand : brandsList) {

            // display each brand on a new line
            brandsFormatted.append(brand).append('\n');

        }

        brands.setText(brandsFormatted);

        // p.73

    }
}
