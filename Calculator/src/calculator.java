import javax.swing.JFrame; 
import javax.swing.JOptionPane;

public class calculator extends JFrame 
	{
		static JFrame frame = new JFrame();	
		public static void main(String[] args)
			{
							String operation = (JOptionPane.showInputDialog("Waht would you like to do Add, Subtract, Multiply, Divide, Square?\n If you would like to square, "
									+ "\njust put a random number as the second number and enter the number \nthat you would like to square as the first number."));
							int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the first number"));
							
							int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second number"));

				if (operation.equals("Add"))
					{						
						Double answer = Add(number1,number2);
						JOptionPane.showMessageDialog(frame,answer);
					}
						
				else if (operation.equals("Subtract"))
					{
						Double answer = Subtract(number1,number2);
						JOptionPane.showMessageDialog(frame,answer);
					}
				else if (operation.equals("Multiply"))
					{
						Double answer = Multiply(number1,number2);
						JOptionPane.showMessageDialog(frame,answer);
					}
				
				else if (operation.equals("Divide"))
					{
						Double answer = Divide(number1,number2);
						JOptionPane.showMessageDialog(frame,answer);
					}
				else if (operation.equals("Square"))
				{
					Double answer = Multiply(number1,number1);
					JOptionPane.showMessageDialog(frame,answer);
				}
				else 
				{
					System.exit(0);
				}
			
			}
					public static double Add (double a, double b)
					{
											return a + b;
					}
					
					public static double Multiply (double a, double b)
					{
								return a * b;
					}
					
					
					public static double Subtract (double a, double b)
					{
								return a - b;
					}
					
					public static double Divide (double a, double b)
					{
								return a / b;
					}
					public static void Square (double a)
					{
						
					}
}