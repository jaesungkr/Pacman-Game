package code;



import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Pacman extends Circle {

    public Pacman(double x, double y) {
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(25);
        //pacman image inserted
        this.setFill(new ImagePattern(new Image("pacman.png")));
  
    }
}
