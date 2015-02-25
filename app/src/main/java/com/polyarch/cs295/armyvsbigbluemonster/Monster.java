package com.polyarch.cs295.armyvsbigbluemonster;

/**
 * Created by polyarch on 2/24/15.
 */
public class Monster extends Entity {
    private int killNumber;
    private boolean alive = true;

    public void attack(){
        System.out.println("Attack");
    }

    public void death()
    {
        System.out.println("I am dead, blarrrgglrlrlrlrrlrl!!!");
        alive = false;
    }



    public Monster(String type, int killNumber){
        this.type = type;
        this.killNumber = killNumber;
    }
    public Monster(){
        type = "default";
        killNumber = 10;
    }
}
