
import java.util.*;
import java.io.*;
import java.awt.*; 
import javax.swing.*; 
import java.time.*;
import java.time.temporal.*;
public class ShapeTester{
   public static void main(String []args) {
       Scanner input = new Scanner(System.in);
       Scanner shapeType = new Scanner(System.in);
       Box b1 = new Box();
       Sphere s1 = new Sphere();
       Pyramid p1 = new Pyramid();
       System.out.println("Welcome");
       String shape = input.nextLine();   
       shape = shape.toLowerCase();
       if(shape.equals("box")) {
        b1.length = input.nextDouble();
        b1.width = input.nextDouble();
        b1.height = input.nextDouble();
        b1.calcVol();
        b1.calcsArea();
    }else if (shape.equals("sphere")) {
        s1.radius = input.nextDouble();
        s1.calcVol();
        s1.calcsArea();
    }else if (shape.equals("pyramid")) {
        p1.length = input.nextDouble();
        p1.width = input.nextDouble();
        p1.height = input.nextDouble();
        p1.calcVol();
        p1.calcsArea();
    }
}
}
