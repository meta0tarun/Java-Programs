import java.util.Scanner;
import java.util.Random;

class GuessTheNumber{

    int randnum;

    boolean ifright;

    public  GuessTheNumber() {
        Random num = new Random();
        int rand = num.nextInt(100);
        randnum = rand;

    }

    public void setnumber(int a){
        if(a == randnum){
            ifright = true;
            System.out.println("You guessed it correctly, the generated number is : " + randnum);

        }
        else{
            if(a<randnum){
                System.out.println("Your digit is lesser than the generated digit!");
            }
            else{
                System.out.println("Your digit is greater than the generated digit!");
            }

            ifright = false;
            
        }
    }








}


public class guess_the_number_oops{
    public static void main(String[] args){
        GuessTheNumber Game = new GuessTheNumber();
        Scanner sc = new Scanner(System.in);
        

    int score = 0;

    do{
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        Game.setnumber(num);



        score++;

    }while(Game.ifright == false);

    System.out.println("Number of tries you took to guess the number : " + score);




    }
}

