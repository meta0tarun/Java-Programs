import java.util.Scanner;

class Library{

    static String book;
    static String studentnum;
    static Scanner scnw = new Scanner(System.in);


    public static String getval(String[] lib,int serial){
        studentnum = lib[serial];
            
            return studentnum;
    }



    public static void Showavailablebooks(String[] array){
        for (int i=0; i<80; i++) {
            book = array[i];
            if(book == null){
                System.out.println("\n");
                i=80;
            }
            else{
        System.out.printf("%d - %s \n", i+1, book);
    }
}
    }

    public static String addbook(){
        System.out.println("Enter the name of the book that you want to add : ");
        String bookinput = scnw.nextLine();
        return bookinput;


    }





}




public class oopexclib {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rep=0;


        
        String[] library = new String[70];
        library[0] = "Fantastic Beasts";
        library[1] = "Harry Potter";
        library[2] = "Wizard of Oz";
        library[3] = "Rich Dad Poor Dad";
        library[4] = "Atomic Habits";
        library[5] = "Alice in Wonderland";

        String[] student = new String[5];

        
        while(rep < 1){
        System.out.println(" 1 - Show available books \n 2 - Add a Book \n 3 - Issue a book \n 4 - Return a book \n 5 - Exit! \n");
        System.out.print("Please choose any option from above : ");
        int choice = sc.nextInt();

        switch(choice){

        case 1 : //Show available books.
                System.out.println("We have the following books available : ");
                Library.Showavailablebooks(library);



        break;

        case 2 : //Add a book.

                for(int i=0;i<80;i++){

                    if(library[i] == null){
                        library[i] = Library.addbook();
                        i = 80;
                    }
                    else{
                        continue;
                    }

                }

                break;

        case 3 :        

                System.out.println("Enter the serial no. of the book you want to issue : ");
                int serial = sc.nextInt();

                //assigning book to a student.
                
                for(int i=0; i<10; i++){
                    if(student[i] == null){
                        student[i] = Library.getval(library, serial-1);
                        i = 11;
                    }
                    else{
                        continue;
                    }
                }

                library[serial-1] = null; // emptying the book space from library.

                //sorting the library array.

                for(int i=69; i >= 0; i--){
                    if(library[i] != null){
                        for(int j = 0; j < 69; j++){
                            if(library[j]==null){
                                library[j] = library[i];
                                library[i] = null ;
                                j = 69;
                            }
                            else{
                                continue;
                            }
                        }
                        i=0;
                    }
                    else{
                        continue;
                    }
                }


                break;


                case 4 : //Return a book

                Library.Showavailablebooks(student);
                System.out.println("Choose the book according to the serial no. from above that you want to return : ");
                int serial2 = sc.nextInt();

                for(int i=0; i<10; i++){
                    if(library[i] == null){
                        library[i] = Library.getval(student, serial2-1);
                        i = 11;
                    }
                    else{
                        continue;
                    }
                }

                student[serial2-1] = null; // emptying the book space from Student's array.


                                //sorting the student array.

                for(int i=4; i >= 0; i--){
                    if(student[i] != null){
                        for(int j = 0; j < 10; j++){
                            if(student[j]==null){
                                student[j] = student[i];
                                student[i] = null ;
                                j = 11;
                            }
                            else{
                                continue;
                            }
                        }
                        i=0;
                    }
                    else{
                        continue;
                    }
                }


                break;






        case 5 : //Exit!
                rep = 1;
                break;

        default :  System.out.println("Enter an appropriate value!");
                    break;


        }
        }
        



    }
}
