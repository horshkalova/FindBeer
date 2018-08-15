package com.example.marynahorshkalova.findbeer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marynahorshkalova on 8/15/18.
 */

public class BeerExpert {

    List<String> getBrands(String color) {

        List<String> brands = new ArrayList<>();

        if (color.equals("amber")) {

            brands.add("Jack Amber");
            brands.add("Red Moose");

        } else {

            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
