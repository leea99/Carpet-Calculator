public class RoomDimension
{  
   private double length;
   private double width;
   
   public RoomDimension(double l, double w)
   {
      length = l;
      width = w;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public double getArea()
   {
      return length * width;
   }
   public String toString()
   {
      String str = ("Length: " + length + " Width: " + width + " Area: " + getArea());
      return str;
   }  
}