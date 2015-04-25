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
        soldiers.add(new Soldier());
        soldiers.get(0).setType("Grunt");
        soldiers.get(0).setAttack(1);
        soldiers.get(0).setCost(1);
    }

    public static void addGrunt(int number)
    {
        soldiers.get(0).setCount(number);
    }

    public static int getGruntCount()
    {
        System.out.println(soldiers.get(0).getCount());
        return soldiers.get(0).getCount();
    }
    public static ArrayList<Soldier> returnSoldierList()
    {
        return soldiers;
    }
}
