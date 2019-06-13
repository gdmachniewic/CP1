
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
//        JFrame frame = new JFrame("Frame Demo");  // Creating a new JFrame object names a frame and sets the title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the operation when you close
		frame.setSize(200, 200); // Our frame is 400 x 400
        
        Shapes r = new Shapes(); // A new shape object
        
        frame.add(r); //Putting R on the frame
        
		frame.setVisible(true); //  Allows us to see the frame
	}
}
