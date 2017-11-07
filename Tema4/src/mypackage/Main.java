package mypackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CoffeMachine coffeMachine = new CoffeMachine();
        Scanner scan = new Scanner(System.in);
        System.out.println("Suma introdusa: ");
        String action = scan.nextLine();
        String currentValue = coffeMachine.transition(action);

        while ( !action.equals("q")){ //q pt a iesi din aplicatie
            System.out.println("1.Introduceti o alta bancnota");
            System.out.println("2.Cumparati un produs");
            action = scan.nextLine();
            if (action.equals("1")) {
                System.out.println("Suma introdusa: ");
                action = scan.nextLine();
                currentValue = coffeMachine.transition(action);
            } else if (action.equals("2")) {
                System.out.println("Produs: ");
                action = scan.nextLine();
                currentValue = coffeMachine.transition(action);
            } else {
                System.out.println("Operatie nereusita");
            }
            if (currentValue == null) {
                System.out.println("Operatie nereusita.");
            } else if (currentValue.equals("0")) {
                return;
            }
        }
    }
}


