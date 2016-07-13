import java.awt.*;
import javax.swing.*;
import java.text.*;

public class BankWriter extends JPanel
{ private int WIDTH = 300; 
   private int DEPTH = 200;
   private BankAccount bank; 
   private String last_transaction = ""; 
   private int pos;
   private String t="";

   public BankWriter(String title, BankAccount b,int position)
   { bank = b;
     t=title;
     pos=position;}
     
  public void frame()
  {
      JFrame my_frame = new JFrame();
      my_frame.getContentPane().add(this);
      my_frame.setTitle(t);
      my_frame.setSize(WIDTH, DEPTH);
      my_frame.setVisible(true);
      my_frame.setLocation(pos,200);
   }
   public void paintComponent(Graphics g)
   { g.setColor(Color.white);
      g.fillRect(0, 0, WIDTH, DEPTH);
      g.setColor(Color.black);
      int text_margin = 50;
      int text_baseline = 50;
      g.drawString(last_transaction, text_margin, text_baseline);
      g.drawString("Current balance = $" + unconvert(bank.getBalance()),
         text_margin, text_baseline + 20);
   }

   private String unconvert(int i)
   { double dollars_cents = i / 100.00;
      return new DecimalFormat("0.00").format(dollars_cents);
   }

   public void showTransaction(String message, int amount)
   { last_transaction = message + " " + unconvert(amount);
      this.repaint();
   }

   public void showTransaction(String message)
   { last_transaction = message;
      this.repaint();
   }
}