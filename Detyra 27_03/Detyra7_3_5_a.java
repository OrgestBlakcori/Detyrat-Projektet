import javax.swing.*;
public class Detyra7_3_5_a
{ public Detyra7_3_5_a()
{}
public int sumation(int i)
{ int total = 0;
int counter = 0; 
while ( counter != i )
{ counter = counter + 1;
total = total + counter;
}
return total;
}

public static void main(String[] args)
{ Detyra7_3_5_a test=new Detyra7_3_5_a();
  String a = JOptionPane.showInputDialog("Shkruaj numrin qe doni te ja gjeni shumen deri ne 1");

  System.out.println("Shuma nga nurmi "+a+" deri ne nurmin 1 eshte: " +test.sumation(new Integer(a).intValue()));
  }}