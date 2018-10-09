import java.awt.*;
import java.awt.event.*;

public class Event2 implements ActionListener{
	
		TextField txt;
	
		@Override
		public void actionPerformed(ActionEvent x) {
			
			txt.setText("Hello");
		
		}
		
		public Event2(TextField x) {
			txt = x;
		}
}