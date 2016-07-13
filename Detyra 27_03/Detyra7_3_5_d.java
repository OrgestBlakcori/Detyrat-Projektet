import javax.swing.*;
public class Detyra7_3_5_d
{Detyra7_3_5_c fac= new Detyra7_3_5_c();
   public Detyra7_3_5_d()
   {}
   
   public double sinus(double x)
   { double sin = x;
      int numeruesi = 3;
      while ( numeruesi <= 19 )
      // sin == x - (x^3/3!) +...deri te...(x^(numeruesi-2)/(numeruesi-2)!)
      { double d = Math.pow(x, numeruesi)/fac.factoriel(numeruesi);
         if ( (numeruesi % 4) == 3 )
         { sin = sin - d; }
         else { sin = sin + d; }
         numeruesi = numeruesi + 2;
      }
      return sin;
   }

   public static void main(String[] args)
   { Detyra7_3_5_d test=new Detyra7_3_5_d();
   String a = JOptionPane.showInputDialog("Shkruaj vleren e sinusit");
      System.out.println(test.sinus(new Double(a).doubleValue()));
   }
}