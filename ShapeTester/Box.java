    import java.util.*;
    import java.io.*;
    import java.awt.*; 
    import javax.swing.*; 
    import java.time.*;
    import java.time.temporal.*;
    import java.lang.Math.*;
    public class Box {
     double vol = 0;
     double sArea = 0;
     double length;
     double width;
     double height;
     public Box() {
         this.length = 0;
         this.width = 0;
         this.height = 0;

     }
     public void calcVol() {
         vol = length * width * height;
         System.out.println("Volume = " + vol + "m³");	
     }
     public void calcsArea() {
        sArea = 2 * (length * width + length * height + height * width);
        System.out.println("Surface Area = " + sArea + "m²");
    }
} 
