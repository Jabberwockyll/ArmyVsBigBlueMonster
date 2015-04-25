package com.polyarch.cs295.armyvsbigbluemonster;

/**
 * Created by polyarch on 2/24/15.
 */
public class Monster extends Entity
{
    private int stamina; //When this reaches 0 or lower the monster feints.
    private int attack = 0; //This decides how many soliders are defeated when the monster attacks.
    private int challengeRating; //This is an indicator of the monsters strength and how much influence one will gain from beating the monster.

    private boolean alive = true;

    public Monster(String type, int stamina, int challengeRating, int attack)
    {
        this.type = type;
        this.stamina = stamina;
        this.attack = attack;
        this.challengeRating = challengeRating;
    }
    public Monster()
    {
        type = "default";
        stamina = 10;
    }
    public int getAttack()
    {
        return attack;
    }
    public void damage(int damage)
    {
        stamina -= damage;
    }
    public int getStamina()
    {
        return stamina;
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
