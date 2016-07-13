import javax.swing.*;
public class Votimi
{  static int first;
   static int second;
   public static void main(String[] args)
   {  
      JOptionPane.showMessageDialog(null,"Verejtje:"+"\n"+"Te drejte vote kane personat mbi moshen 18");
      int mosha=new Integer(JOptionPane.showInputDialog("Shkruani moshen tuaj")).intValue();
      if (mosha<=18)
      {JOptionPane.showMessageDialog(null,"Nuk keni te drejte vote!");}
      
      
      else 
      {  JOptionPane.showMessageDialog(null,"I/e nderuar, ju keni konfirmuar se jeni mbi moshen 18,"+"\n"+"shtypni OK per te vazhduar");
         JOptionPane.showMessageDialog(null,"Ju duhet te shtypni vetem 1 ose 2(varesisht se per cilin kandidat votoni),"+"\n"+"perndryshe vota juaj shpallet e pavlefshme!"+"\n"+"Shtypni OK per te kaluar tek lista e kandidateve.");
         int vota=new Integer(JOptionPane.showInputDialog("Ju votoni per: "+"\n"+"1.Filan Fisteku(1)"+"\n"+"2.Filan Fisteku(2)")).intValue();
         if (vota==1)
         { first=first++;
         JOptionPane.showMessageDialog(null,"Ju keni votuar per Filan Fisteku(1)");}     
         else 
         { 
            if (vota==2)
            { second =second++;
              JOptionPane.showMessageDialog(null,"Ju keni votuar per Filan Fisteku(2)");}
            else {JOptionPane.showMessageDialog(null,"Vota juaj eshte e pavlefshme!");}
                       
         }}
         
         }}