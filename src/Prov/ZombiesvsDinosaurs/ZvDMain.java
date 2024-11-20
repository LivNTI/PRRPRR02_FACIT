package Prov.ZombiesvsDinosaurs;

import java.util.ArrayList;
import java.util.Scanner;

public class ZvDMain {
    public static void main(String[] args) {
        ArrayList<Dinosaur> dinos = new ArrayList<>();
        ArrayList<Zombie> deads = new ArrayList<>();
        Scanner myScan = new Scanner(System.in);

        //asks how many Dinosaurs the user wants
        System.out.print("How many dinosaurs do you want to create? ");
        int creatures = myScan.nextInt();
        //Creates the correct number of dinos and adds them to the list
        for (int i = 0; i < creatures; i++) {
            dinos.add(new Dinosaur());
        }

        //asks how many Zombies the user wants
        System.out.print("How many zombies do you want to create? ");
        creatures = myScan.nextInt();
        //Creates the correct number of zombies and adds them to the list
        for (int i = 0; i < creatures; i++) {
            deads.add(new Zombie());
        }
    }
}


//@author LivNTI