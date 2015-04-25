package com.polyarch.cs295.armyvsbigbluemonster;

import java.util.ArrayList;

/**
 * Created by Grabclaw on 4/24/2015.
 */
public class Player
{
    private static String name;
    private static int influence;

    public Player(String name, int influence, int challengeRating)
    {
        this.name = name;
        this.influence = influence;
    }
    public Player()
    {
        this.name = "default";
        this.influence = 10;
    }
    public static void setInfluence(int influenceVal)
    {
       influence = influenceVal;
    }
    public static int getInfluence()
    {
        return influence;
    }
}
