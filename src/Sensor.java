public class Sensor {
    public Sensor(int z){
        this(z, SwitchState.CLOSE);
    }
    public Sensor(int z, SwitchState s){
        this.zone = z;
        this.state = s;
    }
    public SwitchState getState(){
        return this.state;
    }
    protected void setState(SwitchState s) {
        this.state = s;
    }

    private SwitchState state;
    private int zone;
}
