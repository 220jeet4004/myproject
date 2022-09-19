abstract class Shape
{
  void Draw(){}
  }
  class Rectangle extends Shape
  {
   void Draw(){
   System.out.print("The shape is Rectangle");}
   }
   class Demo
   {
   public static void main(String args[])
   {
   Shape s=new Rectangle();
   s.Draw();
   }
   }
