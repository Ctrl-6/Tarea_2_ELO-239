public class MagneticSensor extends Sensor {
    public MagneticSensor(int z){
        super(z);
        view = new MagneticSensorView();
    }
    public void setSensorOpen() {
        view.setOpenView();
    }
    public void setSensorClose() {
        view.setCloseView();
    }
    public MagneticSensorView getView(){ return view;}
    private final MagneticSensorView view;
}
