import java.util.Arrays;
import javax.swing.*;

public class Detyra7_8
{
    public static void main(String[] args)
    {
        String original = JOptionPane.showInputDialog("Shkruaj fjalen ose fjalin");
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        JOptionPane.showMessageDialog(null,sorted);
    }
}