    import java.util.*;
    import java.io.*;
    import java.awt.*; 
    import javax.swing.*; 
    import java.time.*;
    import java.time.temporal.*;
    import java.lang.Math.*;
    public class Sphere {
     double vol = 0;
     double sArea = 0;
     double radius;
     public Sphere() {
         this.radius = 0;
     }
     public void calcVol() {
         vol = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
         System.out.println("Volume = " + vol + "ft³");
     }
     public void calcsArea() {
      sArea = 4 * Math.PI * Math.pow(radius, 2);
      System.out.println("Surface Area = " + sArea + "ft²");
  }
} 