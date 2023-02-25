import java.util.*;
public class WeightManagement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String n=sc.nextLine();
        System.out.println("Enter Age(yrs): ");
        int a=sc.nextInt();
        System.out.println("Enter Height(cm): ");
        int h=sc.nextInt();
        System.out.println("Enter Weight(kg): ");
        double w=sc.nextDouble();
        double bf=0;
        double b=0;
        double l=0;
        String s="";
        if(a>0)
        {
            b=((w/(h*h))*10000);
            b=(int)(b*10)+1;
            b=b/10;
            l=(0.407*w)+(0.267*h)-19.2;
            l=(int)(l*10);
            l=l/10;
            bf=(1.20*b)+(0.23*a)-5.4;
            if(b>=0.0 && b<=17.0)
            {
                s="Underweight";
            }
            else if(b>=17.1 && b<=24.2)
            {
                s="Healthy";
            }
            else if(b>=24.3)
            {
                s="Obese";
            }
            System.out.println();
            System.out.println();
            System.out.println("Name: " + n);
            System.out.println("Age: " + a + " yrs");
            System.out.println("Height: " + h+ " cm");
            System.out.println("Weight: " + w + " kg");
            System.out.println("BMI: " + b);
            System.out.println("LBM: " + l + " kg");
            System.out.println("Body Fat: " + bf + "%");
            System.out.println("Weight Status: " + s);
            System.out.println();
            System.out.println("**Remember to input Data in the Excel Sheet**");
        }
        else
        {
            System.out.println("Error 01: He thinks hes younger than 0 yrs old, god help this child");
        }
    }
}