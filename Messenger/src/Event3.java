import java.awt.*;
import java.awt.event.*;

public class Event3 implements ActionListener{
	
		TextField txt;
	
		@Override
		public void actionPerformed(ActionEvent x) {
			
			txt.setText("I am Vinu");
		
		}
		
		public Event3(TextField x) {
			txt = x;
		}
}