import java.util.*;
class RomanNumbers
{
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number From 1 to 3000");
        int Num = in.nextInt();

        // Initializing The Root Symbols of Roman Numbers to Diffrent Arrays
        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
             
        // Converting to roman
        String Thousands = m[Num/1000];
        String Hundereds = c[(Num%1000)/100];
        String Tens = x[(Num%100)/10];
        String Ones = i[Num%10];
             
        String Ans = Thousands + Hundereds + Tens + Ones;
             
        System.out.println("The Roman Number of "+Num+" is = "+Ans);

     }
}