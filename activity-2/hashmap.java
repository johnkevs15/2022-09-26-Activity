
// import java.io.ObjectInputStream.GetField;
import java.util.*;

public class hashmap {

    public static boolean isPrime(int in) {
        if (in < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(in); i++) {
            if (in % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     */
    public static void menu() {
        HashMap<Integer, String> hash = new HashMap<Integer, String>(5);
        try (Scanner s = new Scanner(System.in)) {
            boolean go = true; // for starting main outer loop
            boolean run = true; // start inner loop

            while (go == true) {
                while (run == true) {
                    System.out.println("""
                            Choice an Option
                            1 for Add
                            2 for Remove
                            3 for Display
                            4 for Clear
                            5 for Exit
                            """);
                    System.out.println("Select a Option: ");
                    int result = s.nextInt();
                    if (result == 1) {
                        System.out.println("Key: ");
                        int add = s.nextInt();
                        System.out.println("Value: ");
                        String added = s.next();
                        while (true) {
                            if (isPrime(add)) {
                                System.out.println("The Number that you input is a prime number!!!!");
                                System.out.println("");
                                System.out.println("Key: ");
                                add = s.nextInt();
                                System.out.println("Value: ");
                                added = s.next();
                            } else {

                                hash.put(add, added);
                                System.out.println("added");
                                break;
                            }
                        }
                    } else if (result == 2) {
                        System.out.println("Enter a number to remove: ");
                        int remove = s.nextInt();
                        hash.remove(Integer.valueOf(remove));
                        System.out.println("");
                    }

                    else if (result == 3) {
                        System.out.println(hash);
                        System.out.println("");
                    } else if (result == 4) {
                        System.out.println("");
                        hash.clear();
                        System.out.println("""
                            ********************************
                            *  hashmap clear successfully  *
                            ********************************
                                """);
                        
                        System.out.println("");
                    } else if (result == 5) {
                        run = false;
                        if (run == false) {
                            System.out.println("Would you like to run again? Y/N");
                            char again = s.next().charAt(0);
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

                    } else {
                        System.err.println("Invalid option selected");
                        run = false;
                        if (run == false) {
                            System.out.println("Would you like to run again? Y/N");
                            char again = s.next().charAt(0);
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