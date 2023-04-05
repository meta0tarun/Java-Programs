import java.util.Scanner;
import java.util.Random;

public class javaex2 {
    public static void main(String[] args){
        System.out.println("___Rock - Paper - Scissor___\n\n");
        int pscores = 0;
        int cscores = 0;
        int n = 0;

        while(n<=2){ 

            System.out.printf("Choose 1 - For rock\nChoose 2 - For paper\nChoose 3 - For scissor \n");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        Random rmd = new Random();
        int rand = rmd.nextInt(3);
        

            if(choice == 1){
                if(rand == 0){
                    System.out.println("Computer chose rock. \n Round Draw!");
                }
                else if(rand == 1){
                    System.out.println("Computer chose paper. \n Round Lost!");
                    cscores ++;
                }
                else if(rand == 2){
                    System.out.println("Computer chose scissor. \n Round Won!");
                    pscores ++;
                }
            }


            else if(choice == 2){
                if(rand == 0){
                    System.out.println("Computer chose rock. \n Round Won!");
                    pscores ++;
                }
                else if(rand == 1){
                    System.out.println("Computer chose paper. \n Round Draw!");
                    
                }
                else if(rand == 2){
                    System.out.println("Computer chose scissor. \n Round Lost!");
                    cscores ++;
                    
                }
            }


            else if(choice == 3){
                if(rand == 0){
                    System.out.println("Computer chose rock. \n Round Lost!");
                    cscores ++;
                }
                else if(rand == 1){
                    System.out.println("Computer chose paper. \n Round Won!");
                    pscores ++;
                }
                else if(rand == 2){
                    System.out.println("Computer chose scissor. \n Round Draw!");
                }
            }
            else{
                System.out.println("Inappropriate Value, Round Wasted!");
            }

            n ++;


        }
    System.out.printf("Player scores are : %d\n", pscores);
    System.out.printf("Computer scores are : %d\n", cscores);
    if(cscores==pscores){
        System.out.println("Match Draw!");
    }
    if(cscores<pscores){
        System.out.println("Match Won!");
    }
    if(cscores>pscores){
        System.out.println("Match Lost!");
    }



    }
    
}
