package com.polyarch.cs295.armyvsbigbluemonster;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class CombatActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final Button menuButton = (Button) findViewById(R.id.menuButton);
        final Button fightButton = (Button) findViewById(R.id.fightButton);
        final TextView countText = (TextView) findViewById(R.id.countTextView);
        final TextView gameMessageText = (TextView) findViewById(R.id.gameMessageTextView);
        final Button BYRDSUCKSBUTTON = (Button) findViewById(R.id.pwrBtn);
        final PopupMenu popupMenu = new PopupMenu(this, BYRDSUCKSBUTTON);

        Shop.initSoldiers();
        final Monster mon = new Monster("Blue", 10, 2, 1);
        Shop.addGrunt(25);

        View.OnClickListener menuButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent menuIntent = new Intent(CombatActivity.this, MainActivity.class);
                //Tell Android to do something with the new intent
                startActivity(menuIntent);
            }
        };

        View.OnClickListener fightButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CombatLogic.monsterAttack(mon);
                Shop.getGruntCount();
                CombatLogic.playerAttack(mon);

                if (!mon.isAlive())
                {
                    gameMessageText.setText("You have killed the monster!");
                }
            }
        };

        popupMenu.inflate((R.menu.popup_menu));

        BYRDSUCKSBUTTON.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                popupMenu.show();
            }
        });

        popupMenu.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Power_1:
                        Toast.makeText(getApplicationContext(), "Power 1 Clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.Power_2:
                        Toast.makeText(getApplicationContext(), "Power 2 Clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.Power_3:
                        Toast.makeText(getApplicationContext(), "Power 3 Clicked", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return true;
            }
        });

        fightButton.setOnClickListener(fightButtonListener);

        menuButton.setOnClickListener(menuButtonListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
