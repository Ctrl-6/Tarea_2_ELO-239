import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MagneticSensorView extends Group {
    public MagneticSensorView () {
        switchView = new Rectangle(6,6);

        magnetView = new Rectangle(6,6);
        magnetView.setFill(Color.BLACK);
        switchView.setFill(Color.RED);
        getChildren().addAll(magnetView,switchView);
        setCloseView();
        
    }
    public void setCloseView(){
        magnetView.setTranslateX(0);
    }
    public void setOpenView(){
        magnetView.setTranslateX(6);
    }
    public Rectangle getSwitchView(){
        return switchView;
    }
    public Rectangle getMagnetView(){
        return magnetView;
    }
    private final Rectangle switchView;
    private final Rectangle magnetView;
}
