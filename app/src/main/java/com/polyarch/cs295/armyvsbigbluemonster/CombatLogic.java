package com.polyarch.cs295.armyvsbigbluemonster;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Grabclaw on 4/24/2015.
 */
public class CombatLogic
{
    static Random rand = new Random();
    static ArrayList<Soldier> soldiersInstance;

    static public int monsterAttack(Monster myMonster)
    {
        System.out.println("Monster Attacks!");
        int rollNumber = rand.nextInt( (myMonster.getAttack() - 1) + 1) + 1;

        //calculating total number of soldiers
        int totalNumberOfSoldiers = 0;

        soldiersInstance = Shop.returnSoldierList();
        for(int i = 0; i < 1; i++)
        {
            totalNumberOfSoldiers = totalNumberOfSoldiers + soldiersInstance.get(i).getCount();
        }

        for (int idx = 1; idx <= myMonster.getAttack(); ++idx)
        {
            int randomInt = rand.nextInt(totalNumberOfSoldiers - 1) + 1;

            if( randomInt  <= soldiersInstance.get(0).getCount() && soldiersInstance.get(0).getCount() != 0 )
            {
                soldiersInstance.get(0).killSolider();
            }
           // else if (randomInt  <= (soldiersInstance.get(1).count + soldiersInstance.get(1).count)&& soldiersInstance.get(1).count != 0 )
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
