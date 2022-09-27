import java.util.*;

public class Array{

    public static void main(String args[]) throws InterruptedException{
        ArrayList<String> array= new ArrayList<String>(5);
        
        Scanner s = new Scanner(System.in);
        System.out.println("Your Fevorite Colors");
        Thread.sleep(5000);
        System.out.println(" ");
        for(int i = 0;i <= 5; i++){
            System.out.println("Enter your First Fevorite Color");
            String ans1=s.next();
            array.add(ans1);
            System.out.println("Enter your Second Fevorite Color");
            String ans2=s.next();
            array.add(ans2);
            System.out.println("Enter your Thrid Fevorite Color");
            String ans3=s.next();
            array.add(ans3);
            System.out.println("Enter your Fourth Fevorite Color");
            String ans4=s.next();
            array.add(ans4);
            System.out.println("Enter your Fifth Fevorite Color");
            String ans5=s.next();
            array.add(ans5);
            // System.out.println("Array ="+array);
            break;
        }
        s.close();
        System.out.println("Your Top 5 Fevorites Color Are:");
        for (String Colors: array) {
            System.out.println(Colors);
        }
    }
}