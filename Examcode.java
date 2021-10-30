import java.util.Scanner;
public class Examcode
{
    public static double calculate(int value){
        double answer = 0;
        while(value > 0){
            answer = answer + (double) 1 / value;
            value--;
        }
        return answer;

    }
    public static void main(String args[])
    {
        int value ;
        value = Integer.parseInt(args[0]);
        double answer;
        answer = calculate(value);
        System.out.println("Final Sum of Series = "+answer);
    }
}