package com.polyarch.cs295.armyvsbigbluemonster;

import java.util.Random;

/**
 * Created by Grabclaw on 4/24/2015.
 */
public class CombatLogic
{
    static Random rand = new Random();

    static public int monsterAttack(int monsterAttack, Monster myMonster)
    {
        System.out.println("Monster Attacks!");
        int rollNumber = rand.nextInt( (monsterAttack - 1) + 1) + 1;

        //calculating total number of soldiers
        int totalNumberOfSoldiers = 0;
        ArrayList<Soldier> soldiersInstance = Shop.returnSoldierList();
        for(int i = 0; i < 13; i++)
        {
            totalNumberOfSoldiers = totalNumberOfSoldiers + soldiersInstance.get(i).count;

        }
        int soldier = 0;
        int j = 0;
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= myMonster.getAttack(); ++idx) {
            int randomInt = randomGenerator.nextInt(totalNumberOfSoldiers - 1) + 1;

           while( randomInt > soldier)
           {
               soldier = soldier + soldiersInstance.get(j).count;
               j++;

           }
           soldiersInstance.get(j - 1).count--;

        }






        return rollNumber;
    }

    static public int playerAttack(int playerAttack)
    {
        System.out.println("Player Attacks!");
        int rollNumber = rand.nextInt( (playerAttack - 1) + 1) + 1;

        return rollNumber;
    }


}
