package com.polyarch.cs295.armyvsbigbluemonster;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class CityMenuActivity extends ActionBarActivity {

    private ListView cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_menu);
        cityList = (ListView) findViewById(R.id.listOfCitiesInWhichKamiSucks);

        String[] cityNames = {"Shanghai", "Delhi", "Jakarta", "Mexico City", "Karachi",
        "Moscow", "Lagos", "Sao Paulo", "Istanbul", "Seoul"};
        ArrayList<City> cities = new ArrayList<City>();
        for (String name : cityNames){
            City city = new City(name);
            cities.add(city);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_city_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
