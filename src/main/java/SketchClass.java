import processing.core.PApplet;

// by Camden Hobson. @CamdenHobson on Twitter.
public class SketchClass extends PApplet {
    public static PApplet mainSketch;
    public static int frameWidth = 100, frameHeight = 100;
    public static void main(String [] args, int tWid, int tHei) {
        PApplet.main("SketchClass", args);
        frameWidth = tWid;
        frameHeight = tHei;
    }

    public void settings() {
        mainSketch = this;

        size(frameWidth, frameHeight);
        //fullScreen();
    }
    public void setup() {
        colorMode(HSB,360,100,100);
    }
    public void draw() {
        background(color(0,0,95));
    }

    public void keyPressed() {
        if (key == 'q') {
            dispose();
            mainSketch.getSurface().setVisible(false);
        }
    }
}
