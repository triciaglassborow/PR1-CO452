package code;

import code.InputReader;
import code.Possibility;

public class Forest
{
    int input;
    static boolean weapon;
    static int health;

    int a1;
    String a2;

    public static void main(String[] args)
    {
        //resetting stats
        weapon = false;
        health = 50;
        //printing stats
        stats();
        //crash
        System.out.println("You're plane crash landed in a remote part of the forest.");
        System.out.println("Thankfully, you're not too badly hurt. You now have to try get out");
        System.out.println("");
        //berries
        System.out.println("You start walking and come across some berries, you ate them and felt a bit better (+10HP)");
        health = health + 10;
        stats();
        directionOne();
        fightOne();

    }

    public static void stats()
    {
        System.out.println("\n------------------------");
        System.out.println("Health: "+ health + " Weapon: "+ weapon);
        System.out.println("------------------------");
    }

    public static void directionOne()
    {
        //pick a direction
        System.out.println("You keep walking until you reach a river. You could keep to the path you're on, which would be safer, or you could try cross it?");
        int a1 = InputReader.getInt("Do you cross the river, or stay on the path? 1/2 ");
        
        if(a1==1)
        {
            //calling Possibiltiy, input = %. ie 50 = 50%
            //event happens
            if(Possibility.getPossibility(50) == true)
            {
                System.out.println("\nYou got hurt corssing the river (-20HP)");
                health = health - 20;
                stats();
            }
            //event doesnt happen
            else
            {
                System.out.println("\n You crossed the river safely!");
            }
            //berries+Weapon pick up
            System.out.println("\nAfter drying off, you continue walking and come across a clearing. After looking around you find a tree stump with an axe in it.");
            
            System.out.println("\nYou take the weapon as this could be helpfull later (+Weapon)");
            System.out.println("You also find some berries in the clearing (+10HP)");
    
            weapon = true;
            health = health+10;
            stats();
        }
        else
        {
            System.out.println("\nYou choose to play it safe and stick to the path.");
            System.err.println("\nWhile walking you find some berries along the path (+10HP)");
            health = health + 10;
            stats();
        }
    }

    public static void fightOne()
    {
        System.out.println("\nYou keep on walking until your path is blocked by a Wolf");
        if(weapon == true)
        {
            if(Possibility.getPossibility(10) == true)
            {
                System.out.println("\nYou fought the Wolf and got away but got injured in the process (-20HP)");
                health = health - 20;
                stats();
            }
            else
            {
                System.out.println("\nYou fought the wolf and got away uninjured!");
                stats();
            }
        }
        else
        {
            if(Possibility.getPossibility(50))
            {
                System.out.println("\nYou got away from the wolf but got injured in the proces (-30HP)");
                health = health - 30;
                stats();
            }
            else
            {
                System.out.println("\nYou got away from the wolf uninjured!");
                stats();
            }
        }
    }

}
   
