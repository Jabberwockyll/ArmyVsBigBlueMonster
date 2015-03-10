package com.polyarch.cs295.armyvsbigbluemonster;

import java.util.Random;

/**
 * Created by polyarch on 2/24/15.
 */
public class Soldier
{

    Random rand = new Random();

    private int count = 25;

    public void recruit(int amount)
    {
        count += amount;
    }

    public int attack()
    {
        int rollNumber = rand.nextInt( (count - 1) + 1) + 1;
        return rollNumber;
    }

    public void death(int amount)
    {
        count -= amount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
