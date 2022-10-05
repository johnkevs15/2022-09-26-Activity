// package 10-03-22; 
import java.util.*;
public class Main {
    public static void main(String[] args)throws InterruptedException{
        int number[] = {1,3,4,6};
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String ans = s.nextLine();
            number<String> n = new number<String>();
            n.setNum(ans);
            System.out.println("Welcome to geussing game Mr. " + n.getNum());
      
            while(true){
                int integer = Integer.MAX_VALUE;
                Thread.sleep(3000);
                System.out.println("""
                        Do you want to play the game??
                        1 for Yes
                        2 for No
                        """);
                        System.out.println("Choose an Option: ");
                        String choice = s.nextLine(); 
                        
                        try {
                            integer = Integer.parseInt(choice);
                            try{
                            
                                if(integer < 0){
                                    throw new ChoiceException("Please input only postive number");
                                    
                                }
                                if(integer > 2){
                                    throw new ChoiceException("There are only Two option!!!!!");
                                }
                                
                                 
                            }catch( ChoiceException e){
                                System.out.println(e.getMessage());
                            } 
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Error! Invalid integer. Try again.");
                        } 
                        if(integer == 1) {
                        while(true){
                            Thread.sleep(3000);
                            System.out.println("""
                                Guess my favorite Number
                                        Select 1 for number 1
                                        Select 2 for number 3
                                        Select 3 for number 4
                                        Select 4 for number 6

                                    """);
                                    System.out.println("Enter your Guess: ");
                                    String guess = s.nextLine();
                                    try {
                                        integer = Integer.parseInt(guess);
                                        try{
                                        
                                            if(integer < 0){
                                                throw new ChoiceException("Please input only postive number");
                                            }
                                            if(integer > 4){
                                                throw new ChoiceException("There are only Four options!!!!!");
                                            }
                                            
                                             
                                        }catch( ChoiceException e){
                                            System.out.println(e.getMessage());
                                        } 
                                    }
                                    catch (NumberFormatException e) {
                                        System.out.println("Error! Invalid integer. Try again.");
                                        continue;
                                    } 
                                    
                                    if(integer == 1){
                                        System.out.println("Sorry my favorite number is not: "+number[0]);
                                      
                                    }if(integer == 2){
                                        System.out.println("Sorry my favorite number is not: "+number[1]);

                                    }if(integer == 3){
                                        System.out.println("Sorry my favorite number is not: "+number[2]);

                                    }if(integer == 4){
                                        System.out.println("You guess it right my favorite number is: "+number[3]);
                                        System.out.println("""
                                                **************************
                                                *   Congratulations      *
                                                **************************
                                                """);
                                       
                                                   break;
                                                
                                                                    }
                                                                    
                                    
                        }

                    }else if(integer ==2){
                        System.out.println("Good Bye!!!");
                        System.exit(0);
                    } 
               
                    
            }
        }
        
    
     }
    
  
}
