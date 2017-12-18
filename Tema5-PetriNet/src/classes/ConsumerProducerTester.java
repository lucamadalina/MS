package classes;

import java.util.Scanner;

/**
 * Created by madalina.luca on 12/18/2017.
 */
public class ConsumerProducerTester {
    public static void main(String[] args) {
        ReadWrite rd = new ReadWrite(4);
        Scanner scan = new Scanner(System.in);
        System.out.println("Operatia introdusa(1-consuma, 3-produce): ");
        String action = scan.nextLine();
        while (!action.equals("q")) { //q pt a iesi din aplicatie
            if(action.equals("1")){
                System.out.println("Cineva consuma");
            } else {
                System.out.println("Cineva produce");
            }
            System.out.println("Continuati? (y/n)");
            action = scan.nextLine();
            if (action.equals("y")) {
                System.out.println("Alta optiune: ");
                action = scan.nextLine();
            } else if (action.equals("2")) {
                System.out.println("Operatia: ");
                action = scan.nextLine();
                if (rd.exec(Integer.parseInt(action)) == true) {
                    System.out.println("Operatie reusita");
                } else {
                    System.out.println("Operatie nereusita");
                }
            } else if(action.equals("n")){
                return ;
            }
            else {
                System.out.println("Operatie nereusita");
            }
        }
    }
}
