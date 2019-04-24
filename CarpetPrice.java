public class CarpetPrice
{
   private String mat;
   double price;
   
   public CarpetPrice(String m)
   {
      mat = m;
      
      if (mat.equalsIgnoreCase("acrylic"))
      {
         price = 10;
      }
      else if (mat.equalsIgnoreCase("nylon"))
      {
         price = 8;
      }
      else
      {
         price = 7;
      }
   }
    
    public double getPrice()
    { 
      return price;
    }
    
    public String getMaterial()
    {
      return mat;
    }
    
    public String toString()
    {
      String str = ("Material: " + mat + " material cost: $" + price);
      return str;
    }  
    
}