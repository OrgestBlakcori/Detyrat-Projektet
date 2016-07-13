import javax.swing.*;
import java.util.*;
class Numrat_e_thjesht
{
   public static void main(String[] args)
   {		
            int i =0;
      int num =0;

      String  numratthjesht = "";
      System.out.println("Shkruaj Vleren e numrit:");
      int n = new Integer(JOptionPane.showInputDialog("Shkruaj numrin ")).intValue();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {		counter = counter + 1;	    }
	 }
	 if (counter ==2)
	 {

	    numratthjesht = numratthjesht + i + "  ";
	 }	
      }	
      System.out.println("Numrat e Thjeshte nga 1 deri ne "+n+" jane :");
      System.out.println(numratthjesht);
   }
}