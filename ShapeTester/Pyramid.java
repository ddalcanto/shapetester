    import java.util.*;
    import java.io.*;
    import java.awt.*; 
    import javax.swing.*; 
    import java.time.*;
    import java.time.temporal.*;
    public class Pyramid {
     double vol = 0;
     double sArea = 0;
     double length;
     double width;
     double height;
     public Pyramid() {
         this.length = 0;
         this.width = 0;
         this.height = 0;
     }
     public void calcVol() {
      vol = length * width * height / 3;
      System.out.println("Volume = " + vol + "m³");
  }
  public void calcsArea() {
    sArea = length * width + length * Math.sqrt(Math.pow((width / 2.0), 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow((length / 2.0), 2) + Math.pow(height, 2));
    System.out.println("Surface Area = " + sArea + "m²");
}
} 