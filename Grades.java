import java.util.Scanner;

public class Grades
{
    public static void main(String args[])
    {
        int mark[] = new int[5];
        int i;
        float sum=0, avg;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Marks Obtained in 3 Subjects : ");
        for(i=0; i<3; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }

        avg = sum/5;

        System.out.print("Your Grade is ");
        if(avg>90)
        {
            System.out.println("A");
        }
        else if(avg>70 && avg<=90)
        {
            System.out.println("B");
        }
        else if(avg>50 && avg<=70)
        {
            System.out.println("C");
        }
        else if (avg<=50)
        {
            System.out.println("F");
        }
    }
}