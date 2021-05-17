package com.bsejawal.creational.abstract_factory.derek_danas;

import java.util.Scanner;

public class EnemyShipTestingMain {
    public static void main(String[] args) {
//        EnemyShip theEnemy =  null ; //new UFOEnemyShip();
//        Scanner userInput = new Scanner(System.in);
//        String enemyShipOption = "";
//        System.out.println("What type of ship? (U / R)");
//        if(userInput.hasNextLine()){
//            enemyShipOption = userInput.nextLine();
//        }
//        if(enemyShipOption.equals("U")){
//            theEnemy = new UFOEnemyShip();
//        }else if(enemyShipOption.equals("R")){
//            theEnemy = new RocketEnemyShip();
//        }

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type ship? (U / R / B)");
        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        if(theEnemy!=null) {
            doStuffEnemy(theEnemy);
        }else {
            System.out.println("Enter a U, R, or B next time");
        }

    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
