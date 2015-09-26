import processing.core.*;


public class LearningGUI extends PApplet {
	private String URL = "http://www.thaibuddhist.com/wp-content/uploads/2011/10/IMG_3866.jpg";
	private PImage backgroundImg;
	
	public void setup() {
		size(400,400);
		backgroundImg = loadImage(URL, "jpg");
	}
	
	public void draw() {
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
	}
}
