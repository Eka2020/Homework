package com.company;

import java.util.Random;

public class Boss {
    private int healthBoss;
    private int DamageBoss;
    private int defenceType;

    public int getHealthBoss() {
        return healthBoss;
    }

    public void setHealthBoss(int healthBoss) {
        if (healthBoss < 0) {
            System.out.println("Воин выиграл!!");
        }
        this.healthBoss = healthBoss;
    }

    public int getDamageBoss() {
        return DamageBoss;
    }

    public void setDamageBoss(int Damage) {
        this.DamageBoss = Damage;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    /*public static void changeBossDefence() {
        Random r = new Random();
        int randomIndex = r.nextInt(Hero.class.this.attaktype);
        this.defenceType = this.attackType[randomIndex];
    }*/

}
