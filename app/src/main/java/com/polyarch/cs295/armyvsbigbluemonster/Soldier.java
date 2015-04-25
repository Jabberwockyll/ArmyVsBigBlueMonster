package com.polyarch.cs295.armyvsbigbluemonster;

import java.util.Random;

/**
 * Created by polyarch on 2/24/15.
 */
public class Soldier
{
    private int count = 25;
    private int attack;
    private int cost;

    private String type;

    public void setType(String type)
    {
        this.type = type;
    }

    public void recruit(int amount)
    {
        count += amount;
    }

    public void death(int amount)
    {
        count -= amount;
    }

    public int getCount()
    {
        return count;
    }

    public void killSolider()
    {
        count--;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public int getAttack()
    {
        return attack;
    }

    public void setAttack(int attack)
    {
        this.attack = attack;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int count)
    {
        this.cost = cost;
    }

}
