/**
 * A window with its magnetic sensor.
 */
public class Window {
    public Window(int zone, WindowView view) {
        magneticSensor = new MagneticSensor(zone);
        state = State.CLOSE;
        wView = view;
        wView.addMagneticSensorView(magneticSensor.getView());
        wView.setWindowModel(this);
    }
    public void changeState() {  // is called when this window's view is clicked
        if (state == State.CLOSE) {
            state = State.OPEN;
            wView.startOpening();
        } else {
            state = State.CLOSE;
            wView.startClosing();
        }
    }
    public void finishMovement() { // is called when this window ends closing or opening
        if (state == State.CLOSE) {
            magneticSensor.setState(SwitchState.CLOSE);
        } else {
            magneticSensor.setState(SwitchState.OPEN);
        }
    }
    public WindowView getView(){
        return wView;
    }
    private final WindowView wView;
    private final MagneticSensor magneticSensor;
    private State state;
}
