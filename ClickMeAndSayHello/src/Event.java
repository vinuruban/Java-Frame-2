import java.awt.event.*;

public class Event implements ActionListener {
	
	public void actionPerformed(ActionEvent x) {
		ClickMeAndSayHello.area.setText("Hello again");
	}
}