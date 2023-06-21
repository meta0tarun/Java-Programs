import java.util.Scanner;

class mycircle{

    static final double pi = 3.14;

    private int radius;
    private double circumference;
    private double area;

    public void setradius(int a){
        radius = a;
    }

    public int getradius(){
        return radius;
    }

    public boolean setcircumference(double num){
        if(num == 2*pi*radius){
            circumference = num;
            return true;
        }
        else{
            return false;
        }
    }

    public double getdefaultcircumference(){
        circumference = 2*pi*radius;
        return circumference;
    }

    public double getcircumference(){
        return circumference;
    }

    public double getarea(){
        area = pi*radius*radius;
        return area;
    }
}


public class circle_properties_oops {

    public static void main(String[] args){

        mycircle circle = new mycircle();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the radius : ");
        int r = sc.nextInt();

        circle.setradius(r);

        System.out.print("Would you like to set the circumference on your own? Enter '1' for yes and '0' for no : ");
        int choice = sc.nextInt();

        System.out.println();

        if(choice == 1){
            System.out.print("Enter the circumference : ");
            double circum = sc.nextDouble();
            if(circle.setcircumference(circum)==true){
                System.out.println("The circumference is : " + circle.getcircumference());
                System.out.println("The area of the circle is : " + circle.getarea());
            }
            else if(circle.setcircumference(circum)==false){
            System.out.println("The circumference does not match with the given radius.");
            }

        }
        
        else if(choice == 0){
            System.out.println("The circumference is : " + circle.getdefaultcircumference());
            System.out.println("The area of the circle is : " + circle.getarea());
        }

        else{
            System.out.println("Enter an appropriate value!");
        }
        


    }
    
}
