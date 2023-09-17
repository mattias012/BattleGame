        /* Person 1 kan skapa en funktion för att skapa och hantera en karaktär.Funktionen kan hantera karaktärens hälsa,styrka och försvar.
        Exempelvis int createCharacter(String name,int health,int strength,int defense).

        Person 2kan skapa en funktion för att skapa och hantera fiender.Funktionen kan hantera fiendens hälsa,styrka och försvar.
        Exempelvis int createEnemy(String name,int health,int strength,int defense).

        Person 3 kan skapa en funktion för att hantera strider mellan karaktären och fienden.Funktionen kan ta in karaktärens och fiendens hälsa,styrka och försvar och returnera vem som vann striden.
        Exempelvis String battle(int characterHealth,int characterStrength,int characterDefense,int enemyHealth,int enemyStrength,int enemyDefense).

        Person 4 kan skapa en funktion för att hantera spelets huvudloop,där spelaren kan välja att gå vidare till nästa strid eller avsluta spelet.
        Funktionen kan ta in karaktärens hälsa och returnera om spelet ska fortsätta eller inte.Exempelvis boolean gameLoop(int characterHealth).

        Detta skulle ge er en bra grund att börja med och ni kan bygga vidare på det.Kanske lägga till fler fiender,fler attribut för karaktären,eller kanske till och med lite magi? */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Välkommen till spelet");
    }
}