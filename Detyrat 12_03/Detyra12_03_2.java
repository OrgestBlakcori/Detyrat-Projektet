import javax.swing.*;
/**
Detyra me vit te brisht

 Orgest Blakcori*/
public class Detyra12_03_2
{
public static void main(String[] args)
{
String a = JOptionPane.showInputDialog("Shkruaj vitin"); 
int viti = new Integer(a).intValue();
if ((viti % 4 == 0) && viti % 100 != 0){JOptionPane.showMessageDialog(null,"Viti  "+viti+" eshte vit i brisht");}else
if((viti % 4 == 0) && (viti % 100 == 0) && (viti % 400 == 0))
{JOptionPane.showMessageDialog(null,"Viti  "+viti+" eshte vit i brisht");}
else{JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk eshte vit i brisht");
}
}}