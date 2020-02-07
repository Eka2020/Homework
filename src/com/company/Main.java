package com.company;

public class Main {

    public static void main(String[] args) {
        Hero Warior = new Hero(250, 30, 20);
        {
            System.out.println("Воин");
            System.out.println("---------------");
            System.out.println("Запас жизни " + Warior.healthHero );
            System.out.println("Сила атаки " + Warior.damageHero);
            System.out.println("Cупер способность " + Warior.attakType);
            System.out.println("____________________________");

        }

        Hero Magic = new Hero(260, 20, 60);
        {
            System.out.println("Воин с магической силой");
            System.out.println("---------------");
            System.out.println("Запас жизни " + Magic.healthHero );
            System.out.println("Сила атаки " + Magic.damageHero);
            System.out.println("Cупер способность " + Magic.attakType);
            System.out.println("___________________________");
        }
        Hero Kinetic = new Hero(270, 40, 50);
        {
            System.out.println("Воин с кинетической силой");
            System.out.println("---------------");
            System.out.println("Запас жизни " + Kinetic.healthHero );
            System.out.println("Сила атаки " + Kinetic.damageHero);
            System.out.println("Cупер способность " + Kinetic.attakType);
            System.out.println("___________________________");
        }
        Boss boss = new Boss();
        boss.setHealthBoss(700);
        boss.setDamageBoss(50);
        boss.setDefenceType(40);
        System.out.println("Босс "+ "запас жизни "+ boss.getHealthBoss() +  ", сила атаки "+  boss.getDamageBoss()+
                ", степень защиты "+ boss.getDefenceType());



    }

}
