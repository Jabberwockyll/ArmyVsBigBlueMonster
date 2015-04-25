package com.polyarch.cs295.armyvsbigbluemonster;

/**
 * Created by polyarch on 4/24/15.
 */
public class City {

    private String name;
    private boolean inDanger;
    private Monster monster;

    public City(String name){
        this.name = name;
        inDanger = false;
    }

    public void attackCity(Monster monster){
        this.monster = monster;
        inDanger = true;
    }
    public void monsterDefeated(){
        this.monster = null;
        inDanger = false;
    }

}
