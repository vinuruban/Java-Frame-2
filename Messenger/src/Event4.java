import java.awt.*;
import java.awt.event.*;

public class Event4 implements ActionListener{
	
		TextField txt;
	
		@Override
		public void actionPerformed(ActionEvent x) {
			
			txt.setText("Gooooood");
		
		}
		
		public Event4(TextField x) {
			txt = x;
		}
}