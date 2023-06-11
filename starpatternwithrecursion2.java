import java.util.Scanner;

public class starpatternwithrecursion2 {

    static void prtstr(int a){
        if(a==0){
            return;
        }
        
        prtstr(a-1);

        for(int i=0; i<a; i++){
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args){
        System.out.print("Enter the number : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        prtstr(num);

    }
}
