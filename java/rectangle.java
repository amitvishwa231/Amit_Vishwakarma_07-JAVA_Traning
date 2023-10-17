//package full stack wd;

import java.util.Scanner;

public class rectangle{
public static void main(String args[])
{
Scanner av = new Scanner(System.in);
int height;
int width;
System.out.println("Enter the area of rectengle height: ");
height = av.nextInt();
System.out.println("Enter the area of rectengle width: ");
width = av.nextInt();
int area=width*height;
System.out.println("Area of rectangle is: "+area);
av.close();
}
}