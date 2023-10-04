package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo= in.nextDouble();
		double parameterThree = in.nextDouble();
		
		StdDraw.setPenRadius(0.05);
		
		if(shapeType.equals("ellipse"))
		{
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if(isFilled)
			{
				StdDraw.filledEllipse(0.5, 0.5, parameterOne, parameterThree);
			}
			else
				StdDraw.ellipse(0.5, 0.5, parameterOne, parameterThree);
		}
		else if(shapeType.equals("rectangle"))
		{
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if(isFilled)
			{
				StdDraw.filledRectangle(0.5, 0.5, parameterOne, parameterThree);
			}
			else
				StdDraw.rectangle(0.5, 0.5, parameterOne, parameterThree);
		}
		else if(shapeType.equals("triangle"))
		{
			double parameterFour = in.nextDouble();
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			 double[] triX  = {parameterOne, parameterThree, parameterFive};
			 double[] triY = {parameterTwo, parameterFour, parameterSix};
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if(!isFilled)
			{
				StdDraw.line(parameterOne, parameterTwo, parameterThree, parameterFour);
				StdDraw.line(parameterThree, parameterFour, parameterFive, parameterSix );
				StdDraw.line(parameterFive, parameterSix, parameterOne, parameterTwo);
			}
			else
				StdDraw.filledPolygon(triX,triY);
		}
	}
}
