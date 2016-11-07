import java.awt.Component;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class calculator extends JFrame 
	{
		static JFrame frame = new JFrame();	
		public static void main(String[] args)
			{

							int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the first number"));
							
							int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second number"));
							
							String operation = (JOptionPane.showInputDialog("Waht would you like to do with them? Add, Subtract, Multiply, or Divide"));
						
				
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
				if (operation.equals("Multiply"))
					{
						Double answer = Multiply(number1,number2);
						JOptionPane.showMessageDialog(frame,answer);
					}
				
				else if (operation.equals("Divide"))
					{
						Double answer = Divide(number1,number2);
						JOptionPane.showMessageDialog(frame,answer);
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
}

