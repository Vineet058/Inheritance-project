// This code developed in BlueJ.
// Project : Basic Calculater for (Adding , Subtrating , Multiplying and Dividing) value.
// Using Inheritence with switch case function (Data Structures). 

import java.util.*;
class demo2
{
    int c;
    void sum(int a, int b)
    {
        c=a+b;
        System.out.print("Result after Adding values"+" "+c);
    }
    int z;
    void sub(int x,int y)
    {
        z=x-y;
        System.out.print("Result after Subtracting values"+" "+z);
    }
}
class demo1 extends demo2
{
    int o;
    void multiply(int m,int n)
    {
        o=m*n;
        System.out.println("Result after Multiplying values"+" "+o);
    }
    int f;
    void divide(int d,int e)
    {
        f=d/e;
        System.out.println("Result after Dividing values"+" "+f);
    }
}
public class demo extends demo1 
{
    public static void main() {
        int a,b,ch,n=1;
        demo1 ob = new demo1();
        Scanner in = new Scanner (System.in) ;
        while (n==1)
        {
            System.out.println("Enter 1st numbers :");
            a=in.nextInt();
            System.out.println("Enter 2st numbers :");
            b=in.nextInt();
            System.out.println();
            System.out.println("Press 1 : To find the addition of given values :");
            System.out.println("Press 2 : To find the subtraction of given values :");
            System.out.println("Press 3 : To find the multiplication of given values :");
            System.out.println("Press 4 : To find  the division of given values :");
            System.out.println();
            System.out.println("Enter your choice :");
            ch=in.nextInt();
            switch (ch)
            {
                case 1:
                if (ch==1)
                {
                    ob.sum(a, b);
                }
                case 2:
                if (ch==2)
                {
                    ob.sub(a, b);
                }
                case 3:
                if (ch==3)
                {
                    ob.multiply(a,b);
                }
                case 4:
                if (ch==4)
                {
                    ob.divide(a,b);
                }
            }
            System.out.println();
            System.out.println("Press 1 to reapet the program Or any number to quit :");
            n=in.nextInt();
        }        
    }
} 