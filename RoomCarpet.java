public class RoomCarpet
{
   private RoomDimension size;
   private CarpetPrice carpetPrice;
   private double totalCost;
   
   public RoomCarpet(RoomDimension dim, CarpetPrice cost)
   {
      size = new RoomDimension(dim.getLength(), dim.getWidth());
      carpetPrice = new CarpetPrice(cost.getMaterial());
   }
   
   public double getTotalCost()
   {
      return carpetPrice.getPrice() * size.getArea();
   }
   
   public String toString()
   {
      String str = ("Cost: $" + getTotalCost());
      return str;
   }  
}