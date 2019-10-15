package com.james.zombie;
import java.lang.Math;
import java.util.ArrayList;
public class ApocalypticWorld {
    
    public static void main(String[] args) {
        Level2Zombie[] individualGeneration = new Level2Zombie[500];
        for (int i = 0; i < 500; i++) {
            individualGeneration[i] = new Level2Zombie(100);
            System.out.print(individualGeneration[i].genecharacter);
        }
        System.out.print(individualGeneration[0].genecharacter);
        ArrayList<Character> messup = new ArrayList<Character>();
        for (int i = 0; i < 500; i++) {
            for(int j = 0; j < 100; j++) {
                char toadd = individualGeneration[i].genecharacter.get(j);
                messup.add(toadd);
            }
        }
        System.out.println(messup);

        for (int i = 0; i < 100; i++) {
            individualGeneration[i].gene = messup;
            System.out.println(individualGeneration[i].gene);
        }
        */
        /*
        for (int j = 0; j < 100; j++) {
            System.out.print(individualGeneration[j]);
        }
        */
        //System.out.println(individualGeneration.gene);
        /*
        BasicZombie zombie = new BasicZombie();
        zombie.health = 15.05f;
        zombie.decompostionRate = 2.0f;
        zombie.angerLevel = 1;
        zombie.name = "Nigel";

        zombie.health = zombie.health + 2.0f;
        zombie.decompostionRate *= 4;

        if (zombie.angerLevel <= 1) {
            zombie.angerLevel++;

        }
        print(zombie.health);
    }
    private static void print(float f) {
        System.out.print(f);
    }
    */


}
