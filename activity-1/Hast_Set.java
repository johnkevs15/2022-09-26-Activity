import java.util.*;
public class Hast_Set{


    public static void main(String args[]) throws InterruptedException{
        HashSet<String> set=new HashSet<String>(5);      
       
        Scanner s = new Scanner(System.in);
        System.out.println("Your Fevorite Colors");
        Thread.sleep(5000);
        System.out.println(" ");
        for(int i = 0;i <= 5;){
            System.out.println("Enter your First Fevorite Color");
            String ans1=s.next();
            set.add(ans1);
            System.out.println("Enter your Second Fevorite Color");
            String ans2=s.next();
           set.add(ans2);
            System.out.println("Enter your Thrid Fevorite Color");
            String ans3=s.next();
            set.add(ans3);
            System.out.println("Enter your Fourth Fevorite Color");
            String ans4=s.next();
            set.add(ans4);
            System.out.println("Enter your Fifth Fevorite Color");
            String ans5=s.next();
            set.add(ans5);
            // System.out.println("Array ="+array);
            break;
        }
        s.close();
        System.out.println("Your Top 5 Fevorites Color Are:");
        
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
    }
}
        
   