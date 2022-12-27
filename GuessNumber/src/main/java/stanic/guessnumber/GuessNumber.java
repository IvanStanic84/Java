/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package stanic.guessnumber;

/**
 *
 * @author Korisnik
 */
public class GuessNumber {

    public static void main(String[] args) {

        GuessNumber game = new GuessNumber();
        game.startGame();
    }
    Player p1;
    Player p2;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Zamišljam broj od 0 do 9");

        while (true) {
            System.out.println("Broj za pogoditi je " + targetNumber);

            p1.guess();
            p2.guess();

            guessp1 = p1.number;
            System.out.println("Igrač 1 je zamislio " + guessp1);
            guessp2 = p2.number;
            System.out.println("Igrač 2 je zamislio " + guessp2);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            if (p1isRight || p2isRight) {
                System.out.println("Imamo pobjednika!");
                System.out.println("Igrač 1 " + p1isRight);
                System.out.println("Igrač 2 " + p2isRight);
                System.out.println("Game over...");
                break;
            } else {
                System.out.println("Igrači moraju probati ponovno...");
            }

        }

    }

    public class Player {

        int number = 0;

        public void guess() {
            number = (int) (Math.random() * 10);
            System.out.println("Zamišljam " + number);
        }
    }

}
