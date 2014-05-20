import javax.swing.JOptionPane;
public class AddTwoNo extends JOptionPane {

	public static void main(String[] args) {
		
		String a;
		String b;
		int n,m;
		a=JOptionPane.showInputDialog("Enter first number : ");
		b=JOptionPane.showInputDialog("Enter Seconed number : ");
		n=Integer.parseInt(a);
		m=Integer.parseInt(b);
		int sum=n+m;
		JOptionPane.showMessageDialog(null, "The sum of two number's are : "+sum);
	}

}
