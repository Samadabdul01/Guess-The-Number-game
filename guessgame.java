import java.util.Scanner;
import java.util.Random;
class game {
    int computer;
    int num;
    int guess = 0;

    public game() {
        Random rand =new Random();
        this.computer = rand.nextInt(100);
    }
    public void takeUserInput() {
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
    }
    boolean IsCorrectNumber() {
        setGuess();
        if (computer == num) {
            System.out.printf("you guessed the number correct!!The number is %d ",computer);
            System.out.println("you guessed it in " + getGuess() +" attempts!!");
            return true;
        }
        if (computer > num) {
            System.out.println("Too small!!");
        }
            if (computer < num){
                System.out.println("Too big!!");
            }
        return false;
        }
    public int getGuess() {
        return guess;
    }
    public void setGuess() {
        guess = guess+1;
    }

}
        public class guessgame {
            public static void main(String[] args) {
                game player = new game();
                System.out.println("Enter a number between 1-100: ");
               boolean A=false;
               while (!A){
                   player.takeUserInput();
                   A=player.IsCorrectNumber();
               }
            }
        }
