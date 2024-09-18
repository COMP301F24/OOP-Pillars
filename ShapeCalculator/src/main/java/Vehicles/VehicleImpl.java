package Vehicles;

public class VehicleImpl {
    private Engine engine;
    private Wheel frontLeft;
    private Wheel  frontRight;
    private Wheel  rearLeft;
    private Wheel  rearRight;

    public VehicleImpl() {
        engine     = new EngineImpl();
        frontLeft  = new WheelImpl();
        frontRight = new WheelImpl();
        rearLeft   = new WheelImpl();
        rearRight  = new WheelImpl();
    }

    // ...
}

