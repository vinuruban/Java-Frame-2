import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ClickMeAndSayHello {
	
	static JTextArea area;

	public static void main(String[] args) {
		
		Frame F = new Frame("Vinu");
		Button B = new Button("Click");
//		TextField T = new TextField();
		JLabel L = new JLabel();
		
//		F.add(T, BorderLayout.NORTH);
		F.add(B, BorderLayout.CENTER);
		F.add(L, BorderLayout.NORTH);
		
		Event E = new Event();
		B.addActionListener(E); //called in from event class
		
		L.setText("Hello");
		
		F.add(B);
		F.setSize(400, 400);
		F.setBackground(Color.BLUE);
		F.setVisible(true);
		
		area = new JTextArea(5,20); //size
		area.setEditable(false); //disables to type
		F.add(area, BorderLayout.NORTH);
		
	}
	
	

}