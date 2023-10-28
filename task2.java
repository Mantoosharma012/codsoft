import java.util.Scanner;

public class task2 {
    public static void main (String orgs[])
    {
        int maths,physics,chemistry,hindi,english;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the marks of maths"+" ");
        maths=sc.nextInt();
        System.out.print("enter the marks physics"+" ");
        physics=sc.nextInt();
        System.out.print("enter the marks of chemistry"+" ");
        chemistry=sc.nextInt();
        System.out.print("enter the marks of hindi"+" ");
        hindi=sc.nextInt();
        System.out.print("enter the marks of english"+" ");
        english=sc.nextInt();
        int total=maths+physics+chemistry+hindi+english;
        System.out.println("obtained marks"+"="+ total);
        float percentage=total/5;
        System.out.println("average percentage"+"="+percentage);
        if(percentage>=90 && percentage<=100)
        {
            System.out.println("passed with grade A");
        }
        else if (percentage>=70 && percentage<90)
        {
            System.out.println("passed with grade B");
        }
        else if (percentage>=50 && percentage<70)
        {
            System.out.println("passed with grade C");
        }
        else
        {
            System.out.println(" failed , grade  D");
        }
    }
}
