//WriteamethodnamedisEventhatacceptsanintargument.
// Themethodshouldreturntrueiftheargumentiseven,
// orfalseotherwise.Alsowriteaprogramtotestyourmethod
import java.util.*;
public class OddEven {

    public static boolean IsEven(int num){

        if(num%2==0){
            return true ;
        }else {
            return false ;
        }
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:  ");
        int number=sc.nextInt();
        System.out.println(IsEven(number));
    }
}
