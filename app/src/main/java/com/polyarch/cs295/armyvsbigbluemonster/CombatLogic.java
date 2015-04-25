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

    static public void monsterAttack(Monster myMonster)
    {
        System.out.println("Monster Attacks!");
        int rollNumber = rand.nextInt( (myMonster.getAttack() - 1) + 1) + 1;

        //calculating total number of soldiers
        int totalNumberOfSoldiers = 0;

        soldiersInstance = Shop.returnSoldierList();

        for(int i = 0; i < Shop.returnSoldierList().size(); i++)
        {
            totalNumberOfSoldiers = totalNumberOfSoldiers + soldiersInstance.get(i).getCount();
        }

        int soldier = 0;
        int j = 0;

        //Spill over soldier hit calculator.
        for (int idx = 1; idx <= rollNumber; ++idx)
        {
           int randomInt = rand.nextInt(totalNumberOfSoldiers - 1) + 1;

           while( randomInt > soldier)
           {
               soldier += soldiersInstance.get(j).getCount();
               j++;
           }
           soldiersInstance.get(j - 1).killSolider();
        }
    }

    static public void playerAttack(Monster myMonster)
    {
        System.out.println("Player Attacks!");
        int totalAttack = 0;

        for(int i = 0; i < Shop.returnSoldierList().size(); i++)
        {
            totalAttack += Shop.returnSoldierList().get(i).getAttack() * Shop.returnSoldierList().get(i).getCount();
            System.out.println(Shop.returnSoldierList().get(i).getAttack());
            System.out.println(Shop.returnSoldierList().get(i).getCount());
        }

        int rollNumber = rand.nextInt( (totalAttack - 1) + 1) + 1;
        myMonster.damage(rollNumber);
        int t = 0;
        if(myMonster.getStamina() <= 0)
        {
            myMonster.setAlive(false);
            t =  Player.getInfluence() + myMonster.challengeRating;
            Player.setInfluence(t);

        }
    }


}
