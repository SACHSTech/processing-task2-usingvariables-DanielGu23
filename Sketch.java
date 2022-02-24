import processing.core.PApplet;

/* A program Sketch.java that sketches out a cat face that is able to dynamically change its size depending on the size of the sketchpad. 
 @author: D. Gu */

public class Sketch extends PApplet {
  
  public void settings() {
    // Size of sketchpad  
    size(500, 500);
  }

  public void setup() {
    background(0, 140, 128);
  }

  public void draw() {
    // Creating a foreground
    stroke(255);
    strokeWeight(4);
    fill(140,70,20);
    rect((float)(width/width),(float)(height/1.2), (float)(width),(float)(height/5));
    
    // Drawing the head
    stroke(255);
    fill(255,255,255);
    ellipse((width/2), (height/2), (float)(width/1.82), (float)(height/1.82));

    // Drawing the ears
    stroke(255);
    line((float)(width/2.67), (float)(height/3.2), (float)(width/6.67), (float)(height/8)); 
    line((float)(width/3.33), (float)(height/2.5), (float)(width/6.67), (float)(height/8));
    line((float)(width/1.6), (float)(height/3.2), (float)(width/1.18), (float)(height/8)); 
    line((float)(width/1.43), (float)(height/2.5), (float)(width/1.18), (float)(height/8));

    // Drawing the eyes
    stroke(0);
    rect((float)(width/3.2), (float)(height/2.67), (float)(width/10), (float)(height/13.33));
    ellipse((float)(width/2.76), (float)(height/2.42), (float)(width/40), (float)(height/40));
    rect((float)(width/1.7), (float)(height/2.67), (float)(width/10), (float)(height/13.33));  
    ellipse((float)(width/1.57), (float)(height/2.42), (float)(width/40), (float)(height/40));

    // Drawing the nose and mouth
    triangle((float)(width/2.29), (float)(height/1.78), (float)(width/1.78), (float)(height/1.78), (width/2), (float)(height/2.29));
    noFill();
    arc((float)(width/1.6), (float)(height/1.78), (float)(width/4), (float)(height/4.44), HALF_PI, PI);
    arc((float)(width/2.67), (float)(height/1.78), (float)(width/4), (float)(height/4.44), 0, HALF_PI);
  }
  
}