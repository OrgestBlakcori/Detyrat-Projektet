import javax.swing.*;
public class AccountController
{ 
   private BankReader reader;
   private BankAccount A_account;
   private BankWriter A_writer;
   private BankAccount B_account;
   private BankWriter B_writer;
   private BankAccount account;
   private BankWriter writer;


   public AccountController(BankReader r, BankAccount a1, BankWriter w1,
   BankAccount a2, BankWriter w2)
   { reader = r;
   
      A_account = a1;
      A_writer = w1;
      account = A_account;
      writer = A_writer; 
      B_account = a2;
      B_writer = w2;
      account = B_account;
      writer = B_writer;
      
      
      
      
   }

   private void resetAccount(BankAccount new_account, BankWriter new_writer)
   { writer.showTransaction("Inactive"); 
      account = new_account; 
      writer = new_writer;
      writer.showTransaction("Active");
   }

   public void processTransactions()
   { char command = reader.readCommand("Command (A,B, D,W,Q):");
      if ( command == 'Q' ) 
      { }
      else { 
         if ( command == 'D' ) 
         { int amount = reader.readAmount();
            account.deposit(amount);
            writer.showTransaction("Deposit of $", amount);
         }
         else if ( command == 'W' ) 
         { int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { writer.showTransaction("Withdrawal of $", amount); }
            else { writer.showTransaction("Withdrawal invalid", amount); }
         }
         else if ( command == 'A' ) 
         { resetAccount(A_account, A_writer); }
         else if ( command == 'B' ) 
         { resetAccount(B_account, B_writer); }
         else { writer.showTransaction("Illegal command"); }
         this.processTransactions(); 
      }
   }

   public void processTransactions2()
   {account = A_account;
      writer = A_writer;
    char command = reader.readCommand("Command (D,W,Q):");
      if ( command == 'Q' ) 
      { }
      else { 
         if ( command == 'D' ) 
         { int amount = reader.readAmount();
            account.deposit(amount);
            writer.showTransaction("Deposit of $", amount);
         }
         else if ( command == 'W' ) 
         { int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { writer.showTransaction("Withdrawal of $", amount); }
            else { writer.showTransaction("Withdrawal invalid", amount); }
         }
       else { writer.showTransaction("Illegal command"); }
       this.processTransactions2(); 
      }
   }
   
      public void processTransactions3()
   {account = B_account;
      writer = B_writer; 
   char command = reader.readCommand("Command (D,W,Q):");
      if ( command == 'Q' ) 
      { }
      else { 
         if ( command == 'D' ) 
         { int amount = reader.readAmount();
            account.deposit(amount);
            writer.showTransaction("Deposit of $", amount);
         }
         else if ( command == 'W' ) 
         { int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { writer.showTransaction("Withdrawal of $", amount); }
            else { writer.showTransaction("Withdrawal invalid", amount); }
         }
       else { writer.showTransaction("Illegal command"); }
       this.processTransactions3(); 
      }
   }
   
   public static void main(String[] args)
   { BankReader reader = new BankReader();
   
      BankAccount A_account = new BankAccount(0);
      
      BankWriter A_writer= new BankWriter("Client A", A_account,100);
   
      BankAccount B_account = new BankAccount(0);
   
      BankWriter B_writer= new BankWriter("Client B", B_account,600);
         
      AccountController controller = new AccountController(reader,A_account, A_writer, B_account, B_writer);
   
   
   
      String a = JOptionPane.showInputDialog("Choose the account (A,B,BT):");
      a=a.trim().toUpperCase();
      if(a.equals("A"))
      {A_writer.frame();controller.processTransactions2();}
      else if(a.equals("B"))
       {B_writer.frame();controller.processTransactions3();}
       else if(a.equals("BT"))
       {A_writer.frame();B_writer.frame();controller.processTransactions();}
       else {JOptionPane.showMessageDialog(null,"Error"); 
}

       
   
   
   }
}