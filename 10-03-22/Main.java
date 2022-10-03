// package 10-03-22;
import java.util.*;
public class Main {
    public static void main(String[] args){
        int number[] = {1,3,4,6};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String ans = s.nextLine();
        s.close();
        number<String> n = new number<String>();
        n.setNum(ans);
        System.out.println("Welcome to geussing game Mr. " + n.getNum());
        while(true){
            System.out.println("""
                    Do you want to play the game??
                    1 for Yes
                    2 for No
                    """);
                    int choice = s.nextInt(); 
                    try{
                        if(choice!=choice){
                            throw new ChoiceException();
                        }

                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                   
               
                    if(choice == 1) {
                    while(true){
                        System.out.println("""
                            Guess my favorite Number
                                    a 1
                                    b 3
                                    c 4
                                    d 6

                                """);
                                String guess = s.nextLine();
                                if(guess == "a"){
                                    System.out.println("Sorry my favorite number is not: "+number[0]);
                                  
                                }else if(guess == "b"){
                                    System.out.println("Sorry my favorite number is not: "+number[1]);

                                }else if(guess == "c"){
                                    System.out.println("Sorry my favorite number is not: "+number[2]);

                                }else if(guess == "d"){
                                    System.out.println("You guess it right my favorite number is: "+number[3]);

                                }
                    }

                }else if(choice ==2){
                    System.out.println("Good Bye!!!");
                    System.exit(0);
                }   
        }

    
        
    }
}
