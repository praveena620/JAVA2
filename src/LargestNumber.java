import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>=y && x>=z)
        {
            System.out.println("x is largest");
        }
        else if (y>=x && y>=z) {
            System.out.println("y is largest");
        }
            else
            {
                System.out.println("z is largest");
            }
        }
    }

