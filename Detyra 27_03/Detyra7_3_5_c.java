import javax.swing.*;
public class Detyra7_3_5_c
{ public Detyra7_3_5_c()
{}

public long factoriel(int n)
{ long fakt = -1; 
if ( n >= 0 && n <= 20 )
{ int numeruesi = 0; fakt = 1;
while ( numeruesi != n )

{ numeruesi = numeruesi + 1;
fakt = fakt * numeruesi;
}
}
return fakt;
}
public static void main(String[] args)
{ Detyra7_3_5_c test=new Detyra7_3_5_c();
  String a = JOptionPane.showInputDialog("Shkruaj numrin qe doni ta faktorielizoni");

  System.out.println(a+"!( ne faktoriel) eshte: " +test.factoriel(new Integer(a).intValue()));
  }}