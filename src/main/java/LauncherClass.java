import controlP5.*;
import processing.core.PApplet;

public class LauncherClass extends PApplet {
    public static void main(String [] args) {
        PApplet.main("LauncherClass", args);
    }
    PApplet launcherApp;

    public void settings() {
        size(750,500);
    }

    ControlP5 cp5;
    public void setup () {
        launcherApp = this;
        cp5 = new ControlP5(this);

        colorMode(HSB,360,100,100,100);
    }

    public void draw() {
        background(color(0,0,95));
    }

    public void keyPressed() {
        if (keyCode == UP) SketchClass.main(args,round(random(200,400)),round(random(200,400)));
        if (key == 'q') {
            exit();
        }
    }
}
