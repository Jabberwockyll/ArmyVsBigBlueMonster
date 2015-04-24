package com.polyarch.cs295.armyvsbigbluemonster;

/**
 * Created by polyarch on 2/24/15.
 */
public class Monster extends Entity
{
    private int killNumber;

    private boolean alive = true;

    public void battle(Soldier sol)
    {
        if(sol.attack() >= killNumber)
        {
            System.out.println("I am dead, blarrrgglrlrlrlrrlrl!!!");
            alive = false;
        }

        System.out.println("Attack");
        sol.death(1);

    }

    public Monster(String type, int killNumber)
    {
        this.type = type;
        this.killNumber = killNumber;
    }
    public Monster()
    {
        type = "default";
        killNumber = 10;
    }

    public int getKillNumber()
    {
        return killNumber;
    }

    public void setKillNumber(int killNumber)
    {
        this.killNumber = killNumber;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }
}
