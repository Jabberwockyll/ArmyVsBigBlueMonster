package com.polyarch.cs295.armyvsbigbluemonster;

/**
 * Created by polyarch on 2/24/15.
 */
public class Soldier
{
    private int count = 0;

    public void recruit(int amount)
    {
        count += amount;
    }

    public int attack()
    {
        int rollNumber = 0; //This will be a random number.
        return rollNumber;
    }

    public void death(int amount)
    {
        count -= amount;
    }
}
