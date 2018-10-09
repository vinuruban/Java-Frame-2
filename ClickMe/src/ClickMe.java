import java.awt.*;

public class ClickMe {

	public static void main(String[] args) {
		
		Frame F = new Frame("Vinu");
		Button B1 = new Button("click 1");
		Button B2 = new Button("click 2");
		Button B3 = new Button("click 3");
		Button B4 = new Button("click 4");
		Button B5 = new Button("click 5");
		
		F.add(B1, BorderLayout.NORTH);
		F.add(B2, BorderLayout.CENTER);
		F.add(B3, BorderLayout.SOUTH);
		F.add(B4, BorderLayout.WEST);
		F.add(B5, BorderLayout.EAST);
		
		F.setSize(400, 400);
		F.setBackground(Color.BLUE);
		F.setVisible(true);
	}

}