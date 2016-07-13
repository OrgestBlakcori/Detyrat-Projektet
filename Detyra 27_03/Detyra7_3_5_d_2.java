import javax.swing.*;
public class Detyra7_3_5_d_2
{Detyra7_3_5_c fac= new Detyra7_3_5_c();
   public Detyra7_3_5_d_2()
   {}
   
   public double cosine(double x)
   { double cos = x;
      int numeruesi = 2;
      while ( numeruesi <= 20 )
      // cos == 1 - (x^2/2!) +...deri te...(x^(numeruesi-2)/(numeruesi-2)!)
      { double d = Math.pow(x, numeruesi)/fac.factoriel(numeruesi);
         if ( (numeruesi % 3) == 2 )
         { cos = 1 - d; }
         else { cos = cos + d; }
         numeruesi = numeruesi + 2;
      }
      return cos;
   }

   public static void main(String[] args)
   { Detyra7_3_5_d_2 test=new Detyra7_3_5_d_2();
   String a = JOptionPane.showInputDialog("Shkruaj vleren e kosinusit");
      System.out.println(test.cosine(new Double(a).doubleValue()));
   }
}