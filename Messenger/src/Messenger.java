import java.awt.*;

//import javax.swing.JTextArea;

public class Messenger {
	
//	static JTextArea textArea;
//	
//	static QAConsulting R1, R2;

	public static void main(String[] args) {
//		R1 = QAConsulting.createObject();
//		R2 = QAConsulting.createObjectWithPar("Vinu", 24, "London");

		//Instantiate objects
		Frame F = new Frame("vinu");
		TextField T = new TextField();
		Event2 E2 = new Event2(T);
		Event3 E3 = new Event3(T);
		Event4 E4 = new Event4(T);
		Button B = new Button("Greetings");
		Button B2 = new Button("Who am I?");
		Button B3 = new Button("How am I?");
		
		//Frame settings
		F.setSize(400,400);
		F.setLayout(new FlowLayout());
		F.setTitle("Vinu");
		F.setBackground(Color.BLUE);
		F.setVisible(true);
		
		//TextField
		F.add(T, BorderLayout.SOUTH);
		T.setPreferredSize( new Dimension( 200, 24 ) );
		
		//Button setting
		B.addActionListener(E2);
		B2.addActionListener(E3);
		B3.addActionListener(E4);
		F.add(B, BorderLayout.NORTH);
		F.add(B2, BorderLayout.NORTH);
		F.add(B3, BorderLayout.NORTH);
		
		

//		//Text area functionality
//		textArea = new JTextArea(5, 20);
//        textArea.setEditable(false);
//        F.add(textArea, BorderLayout.SOUTH);
		
	}

}