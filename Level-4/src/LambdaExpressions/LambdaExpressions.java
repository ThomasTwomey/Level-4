package LambdaExpressions;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LambdaExpressions {
	JFrame frame;
	JPanel panel;
	JButton[] buttons;
	
	public static void main(String[] args){
		new LambdaExpressions();
	}
	
	public LambdaExpressions(){
		frame = new JFrame();
		panel = new JPanel();
		buttons = new JButton[4];
		
		for(int i = 0; i < 4; i++){
			buttons[i] = new JButton("Button " + i);
			panel.add(buttons[i]);
		}
		
		buttons[0].addActionListener((e) -> System.out.println(new Random().nextInt(10) + 1));
		buttons[1].addActionListener((e) -> System.out.println("Tommy"));
		buttons[2].addActionListener((e) -> frame.setTitle("Title has been changed"));
		buttons[3].addActionListener((e) -> System.exit(0));
		
		frame.add(panel);
		frame.pack();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
