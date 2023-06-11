import java.util.Scanner;

public class tut35q9{

    static void strpt(int a){
        if(a==1|| a==0){
            System.out.println("*");
        }

        else{
            for(int i = 0; i<a; i++){
                System.out.print("* ");
            }
            System.out.println();

            strpt(a-1);
        }
        
    }


    public static void main(String[] args) {
                System.out.println("Enter the number : ");

                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                strpt(num);
    }
}