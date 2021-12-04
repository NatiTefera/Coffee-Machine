/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine;

import java.util.Scanner;

/**
 *
 * @author Nathan Daniel
 */
public class CoffeeMachine {

    /**
     * @param args the command line arguments
     */
   static Scanner scan = new Scanner(System.in); 
     static int water = 400;
     static int milk = 540;
     static int beans = 120;
     static int cups = 9;
     static int money = 550;
     public static void main(String[] args) {
         menu();
    }
     static void menu(){
         
          while(true){
          System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
          String input = scan.next();
          
           
          if(input.equals("buy")){
              buyCoffee();
          }
          if(input.equals("fill")){
              fillMachine();
          }
          if(input.equals("take")){
              take();
          }
          if(input.equals("remaining")){
              displaySupply();
          }
          if(input.equals("exit")){
              
               System.exit(0);
          }
          }
     }
     static void displaySupply(){
          System.out.println("\nThe coffee machine has:");
          System.out.printf("%d ml of water\n",water);
          System.out.printf("%d ml of milk\n",milk);
          System.out.printf("%d g of coffee beans\n",beans);
          System.out.printf("%d disposable cups\n",cups);
          System.out.printf("$%d of money\n",money);
     
     }
     static void buyCoffee(){
         
         System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
         String choice = scan.next();
         if(choice.equals("1")){
             if(water>=250&&beans>=16&&cups>0){
             water-=250;
             beans-=16;
             money+=4;
             cups-=1;
            System.out.println("I have enough resources, making you a coffee!");}
             else{System.out.println("Sorry, not enough water!");}
         }
        
         if(choice.equals("2")){
             if(water>=350&&beans>=20&&cups>0){
             water-=350;
             milk-=75;
             beans-=20;
             money+=7;
             cups-=1;
            System.out.println("I have enough resources, making you a coffee!");}
             else{System.out.println("Sorry, not enough water!");}
         }
         
         if(choice.equals("3")){
             if(water>=200&&beans>=12&&cups>0&&milk>=100){
             water-=200;
             milk-=100;
             beans-=12;
             money+=6;
             cups-=1;
             System.out.println("I have enough resources, making you a coffee!");}
             else{System.out.println("Sorry, not enough water!");}
         }
          if(choice.equals("back")){
              menu();
          }
         
     }
     static void fillMachine(){
            System.out.println("\nWrite how many ml of water you want to add:");
            int waterML = scan.nextInt();
            water+=waterML;
            System.out.println("Write how many ml of milk you want to add: ");
            int milkML = scan.nextInt();
            milk+=milkML;
            System.out.println("Write how many grams of coffee beans you want to add: ");
            int beanGM = scan.nextInt();
            beans+=beanGM;
            System.out.println("Write how many disposable cups of coffee you want to add:");
            int num = scan.nextInt();
            cups+=num;
           
            
     }
     static void take(){
         System.out.printf("\nI gave you $%d\n",money);
         money=0;
         
     
     }
     
}
