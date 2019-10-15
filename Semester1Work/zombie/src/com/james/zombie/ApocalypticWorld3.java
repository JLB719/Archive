package com.james.zombie;
public class ApocalypticWorld3 {
    public static void main(String[] args) {
        BasicZombie integercall = new BasicZombie();
        Level2Zombie integerfirstcall = new Level2Zombie();
        if (integerfirstcall.isthiscalled() == 1) {
            System.out.println("Level2Zombie is being called");
        }
        System.out.println(integerfirstcall.isthiscalled());
        System.out.println(integercall.isthiscalled());

        /*
        Level2Zombie z1 = new Level2Zombie();
        Level2Zombie z2 = new Level2Zombie("Steven");
        Level2Zombie z3 = new Level2Zombie(5.2f, "Brian");
        System.out.println(z1.name);
        System.out.println(z2.name);
        System.out.println(z3.name);
        */
    }
}
