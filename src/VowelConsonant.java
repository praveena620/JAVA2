import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a character");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
        {
            System.out.println("it is a vowel" );
        }
        else {
            System.out.println("it is a consonant");

        }
    }
}


