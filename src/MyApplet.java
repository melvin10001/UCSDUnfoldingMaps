import processing.core.*;
public class MyApplet extends PApplet{

	
	String url = "http://orig02.deviantart.net/63b8/f/2014/088/d/b/ava_addams_1_by_spartanm129-d7c5xxa.png";
	
	PImage backgroundImage = loadImage(url, "png");
	
	public void setup(){
		
		size(300,300);
		
	}
	public void draw(){
		backgroundImage.resize(0, height);
		image(backgroundImage, 0, 0);
	}
}
