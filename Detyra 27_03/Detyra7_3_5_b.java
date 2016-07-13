import javax.swing.*;
public class Detyra7_3_5_b
{ 
   public Detyra7_3_5_b()
   {}


   public int product(int a, int b)
   { int total = 1;
      if ( a <= b )
      { total = a;
         int counter = a;
         while ( counter != b )
         { counter = counter + 1;
            total = total * counter;
         }
      }
      return total;}

   public static void main(String[] args)
   {Detyra7_3_5_b test= new Detyra7_3_5_b();
      int a= new Integer(JOptionPane.showInputDialog("Shkruaj nje numer")).intValue();
      int b= new Integer(JOptionPane.showInputDialog("Shkruaj nje numer tjeter")).intValue();
      System.out.println("Prodhimi nga numri "+a+" deri tek nurmi "+b+" eshte: " + test.product(a,b));
     
   }
}