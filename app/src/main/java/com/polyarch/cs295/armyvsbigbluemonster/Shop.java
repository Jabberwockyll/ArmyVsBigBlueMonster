package com.polyarch.cs295.armyvsbigbluemonster;

import java.util.ArrayList;

/**
 * Created by Grabclaw on 4/24/2015.
 */
public class Shop
{
    private static ArrayList<Soldier> soldiers = new ArrayList<>();

    public  static void initSoldiers()
    {
        soldiers.get(0).setType("Grunt");
        soldiers.get(0).setAttack(1);
        soldiers.get(0).setCost(1);
    }

    public static void addGrunt(int number)
    {
        soldiers.get(0).setCount(number);
    }
}
