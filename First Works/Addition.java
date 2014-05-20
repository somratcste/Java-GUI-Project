import javax.swing.JOptionPane;

public class Addition {
	public static void main(String args[])
	{
      String firstNumber = JOptionPane.showInputDialog("Enter your first number : ");
      String secondNumber = JOptionPane.showInputDialog("Enter you second number : ");
      int numberone = Integer.parseInt(firstNumber);
      int numbertwo = Integer.parseInt(secondNumber);
      int sum = numberone + numbertwo;
      JOptionPane.showMessageDialog(null, "The sum is : " + sum , "Sum of two integer " ,
    		  JOptionPane.PLAIN_MESSAGE);
      
		
	}

}
