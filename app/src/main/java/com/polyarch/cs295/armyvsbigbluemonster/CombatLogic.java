package com.polyarch.cs295.armyvsbigbluemonster;

import java.util.Random;

/**
 * Created by Grabclaw on 4/24/2015.
 */
public class CombatLogic
{
    static Random rand = new Random();

    static public int monsterAttack(int monsterAttack)
    {
        System.out.println("Monster Attacks!");
        int rollNumber = rand.nextInt( (monsterAttack - 1) + 1) + 1;

        return rollNumber;
    }

    static public int playerAttack(int playerAttack)
    {
        System.out.println("Player Attacks!");
        int rollNumber = rand.nextInt( (playerAttack - 1) + 1) + 1;

        return rollNumber;
    }
}
