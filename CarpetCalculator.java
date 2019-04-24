import java.util.Scanner;

public class CarpetCalculator
{
   public static void main(String[] args)
   {
      double length;
      double width;
      String material;
      double materialNum;
      RoomDimension dimensions;
      CarpetPrice price;
      RoomCarpet room;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What material would you like to use?");
      System.out.println("Acrylic\t $10 per square foot");
      System.out.println("Nylon\t\t $8 per square foot");
      System.out.println("Polyester $7 per square foot");
      material = keyboard.nextLine();
      
      while (!material.equalsIgnoreCase("acrylic") && !material.equalsIgnoreCase("nylon") && !material.equalsIgnoreCase("polyester"))
      {
         System.out.println("Please enter one of the three materials.");
         material = keyboard.nextLine();
      }
      
      if (material.equalsIgnoreCase("acrylic"))
      {
         materialNum = 1;
      }
      else if (material.equalsIgnoreCase("nylon"))
      {
         materialNum = 2;
      }
      else
      {
         materialNum = 3;
      }
      
      System.out.println("Enter the length of the room in feet: ");
      length = keyboard.nextDouble();
      
      System.out.println("Enter the width of the room in feet: ");
      width = keyboard.nextDouble();
      
      System.out.println();
      
      keyboard.close();
      dimensions = new RoomDimension(length, width);
      price = new CarpetPrice(material);
      room = new RoomCarpet(dimensions, price);
      
      System.out.println(dimensions);
      System.out.println(room);
      
   }
}