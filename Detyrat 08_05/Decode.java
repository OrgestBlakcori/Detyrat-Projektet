import javax.swing.*;
public class Decode
{ public static void main(String[] args)
  { int[] code = new int[27];   // this is the translation table:
                            // code[0] holds the code for ' ',
                            // code[1] holds the code for 'a',
                            // code[2] holds the code for 'b', and so on
    int k = new Integer(JOptionPane.showInputDialog
             ("Type seed (an integer): ")).intValue();
    code[0] = k;
    for ( int i = 1;  i != code.length;  i = i+1 )
        { code[i] = (int)((code[i-1] * 1.3) + 1); }

    String answer = "";
    boolean processing = true;
    while ( processing )
          {  String input = JOptionPane.showInputDialog
                       ("Type an integer to decode (or nothing, to quit): ");
             if ( input.equals("") )
                  { processing = false; }
             else { char c = decode(code, new Integer(input).intValue());
                    answer = answer + c;
                  }
          }
    System.out.println(answer);
  }

  /** decode  translates an integer code into a character
    * @param code - the array holding the codes for  ' ', 'a', 'b', ..., 'z'
    * @param i - the integer to be decoded
    * @return the matching character, or '*' if the integer does not decode */
  private static char decode(int[] code, int i)
  { char c = '*';
    boolean found = false;
    int index = 0;
    while ( !found  &&  index != code.length )
          { if ( code[index] == i )
                 { found = true;
                   if ( index == 0 )
                        { c = ' '; }
                   else { c = (char)(index + 'a' - 1); }
                 }
            else { index = index + 1; }
          }
    return c;
  }
}