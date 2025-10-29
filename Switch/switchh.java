import java.util.*;
public class switchh {
    public static void main(String[] args) {
         System.out.print("enter 1 or 2 = ");
         Scanner sc=new Scanner(System.in);
         int day= sc.nextInt();

         //switch statement
         switch (day) {
            case 1:
                System.out.println("1=Sunday");
                break;
            case 2:
                System.out.println("2=Monday");
                break;
            default:
                System.out.println("other number");
         }

         //switch expression
         String week=switch (day){
            case 1 -> "weekend";
            case 2 -> "weekday";
            default -> "other day";
         };
         System.out.println(week);


    }
}
