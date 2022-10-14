// package 10-03-22; 

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("How many user do you want to add: ");
                String ans = sc.nextLine();
                int integer = Integer.MAX_VALUE;
                try {
                    integer = Integer.parseInt(ans);
                    try {
                        if (integer < 0) {
                            throw new ChoiceException("Input only positive value");
                        }
                        if (integer >= 5) {
                            throw new ChoiceException("Below Five Users Only");
                        }

                    } catch (ChoiceException e) {
                        System.out.println(e.getMessage());

                    }
                    List<User> use = new ArrayList<User>(5);
                    for (int i = 5; i > integer; i++) {
                        System.out.println("Enter your First Name: ");
                        sc.next();
                        String fname = sc.nextLine();

                        System.out.println("Enter your Last Name: ");
                        String lname = sc.nextLine();
                        User user = new User(fname, lname);
                        use.add(user);
                        System.out.println("Successfully Add to UserList");

                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error! Invalid integer. Try again.");

                }
                break;

            }
        }
    }
}
