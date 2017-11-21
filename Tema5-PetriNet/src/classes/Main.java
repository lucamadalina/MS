package classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();
        Scanner scan = new Scanner(System.in);
        System.out.println("Suma introdusa: ");
        String action = scan.nextLine();
        while ( !action.equals("q")){ //q pt a iesi din aplicatie
            System.out.println("1.Introduceti o alta bancnota");
            System.out.println("2.Cumparati un produs");
            action = scan.nextLine();
            if (action.equals("1")) {
                System.out.println("Suma introdusa: ");
                action = scan.nextLine();
            } else if (action.equals("2")) {
                System.out.println("Produs: ");
                action = scan.nextLine();
                if(coffeMachine.exec(Integer.parseInt(action)) == true){
                    System.out.println("Produs cumparat");
                } else {
                    System.out.println("Operatie nereusita");
                }
            } else {
                System.out.println("Operatie nereusita");
            }
        }
    }
}

