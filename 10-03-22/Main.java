// package 10-03-22;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter you Favorite number: ");
        int ans = s.nextInt();
        number<Integer> n = new number<Integer>();
        n.setNum(ans);
        System.out.println("Your Favorite number is: " + n.getNum());
    

    }
}
