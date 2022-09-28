
import java.util.*;

public class ARRAY {

    public static void menu() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            boolean go = true; // for starting main outer loop
            boolean run = true; // start inner loop
           
            while (go == true) {
                while (run == true) {

                    System.out.println("""
                                Choose a Option
                                1 for Add
                                2 for Remove
                                3 for Display
                                4 for Clear
                                5 for Exit

                            """);

                    System.out.println("Choose an Option: ");
                    int choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.println("Add a number: ");
                        int add = sc.nextInt();
                        while (true) {// error message
                            if (add < 1) {
                                System.out.println("ERROR Please enter a Positive Number");
                                System.out.println("");
                                System.out.println("Add a number: \n");
                                add = sc.nextInt(); 
                            }else{
                                arr.add(add);
                                System.out.println("Added");
                                break;
                            } 
                        
                        }
                       
                    } else if (choice == 2) {
                        System.out.println("Enter a number to remove: ");

                        int remove = sc.nextInt();

                        arr.remove(Integer.valueOf(remove));
                        System.out.println("");
                    } else if (choice == 3) {
                        // for (int number : arr) {
                        //     System.out.println(number);
                        // }
                        System.out.println("Array ="+arr);
                        System.out.println("");
                    } else if (choice == 4) {
                        arr.clear();
                        System.out.println("");
                        System.out.println("""
                        **********************************
                        *  ArrayList clear successfully  *
                        **********************************
                            """);
                        System.out.println("");
                    } else if (choice == 5) {
                        run = false;
                        if (run == false) {
                            System.out.println("Would you like to run again? Y/N");
                            char again = sc.next().charAt(0);
                            again = Character.toUpperCase(again); // force all leters inputed to upper case, lower would
                                                                  // work too if i change if conditions
                            if (again == 'Y') {
                                run = true;
                            } else if (again == 'N') {
                                System.out.println("Goodbye.");
                                go = false;
                                System.exit(0);
                            } else {
                                System.err.println("Invalid entry. Try again.");
                            }
                        }
                        
                    } else  {
                        System.err.println("Invalid option selected");
                        run = false;
                        if (run == false) {
                            System.out.println("Would you like to run again? Y/N");
                            char again = sc.next().charAt(0);
                            again = Character.toUpperCase(again); // force all leters inputed to upper case, lower would
                                                                  // work too if i change if conditions
                            if (again == 'Y' || again == 'y') {
                                run = true;
                            } else if (again == 'N' || again == 'n') {
                                System.out.println("Goodbye.");
                                go = false;
                                System.exit(0);
                            } else {
                                System.err.println("Invalid entry. Try again.");
                            }
                        }
                    }

                }
                
            }

        }
    }

    

    public static void main(String[] args) {

        menu();
    }
}
