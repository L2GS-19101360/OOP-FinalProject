package GABS;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class IntroGUI {
	
	IntroGUI(){
		JFrame jFrame = new JFrame();//creates the frame
		
		ImageIcon jIcon = new ImageIcon("C:\\Users\\Lorenz Gil Suico\\eclipse-workspace\\JavaApp\\src\\GABS\\icon.png");//create the image icon
											   /* /\ - change file path to get the image/s in the folder */
		ImageIcon jImage = new ImageIcon("C:\\Users\\Lorenz Gil Suico\\eclipse-workspace\\JavaApp\\src\\GABS\\name.png");
		
		JLabel jLabel = new JLabel(); //create the labels
		JButton jButton = new JButton();//create the buttons
		
		//Setting the JFrame to Android Screen
		jFrame.setTitle("GABS USC");
		jFrame.setSize(540,810); //Android Screen Ratio
		jFrame.setLayout(null);
		jFrame.setResizable(false); //To Avoid changing the size of the screen
				
		jFrame.setIconImage(jIcon.getImage());//change image icon of frame
		jFrame.getContentPane().setBackground(new Color(0, 177, 63));//to set the background color same as the logo
				
		jLabel.setIcon(jImage);
		jLabel.setBounds(70,130,354,258);//trying to match the size of the image
				
		Border roundedBorder = BorderFactory.createCompoundBorder();
				
		jButton.setBounds(190,500,150,50);
		jButton.setText("Start App");
		jButton.setFocusable(false);
		jButton.setBackground(Color.white);
		jButton.setBorder(roundedBorder);
				
		jFrame.add(jLabel);
		jFrame.add(jButton);
				
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
