package Vehicles.ConstructorDI;

import Vehicles.Engine;
import Vehicles.Wheel;

public class VehicleImpl {
    private Engine engine;
    private Wheel frontLeft;
    private Wheel  frontRight;
    private Wheel  rearLeft;
    private Wheel  rearRight;

    public VehicleImpl(Engine engine, Wheel frontRight, Wheel frontLeft, Wheel  rearLeft, Wheel  rearRight ) {
        this.engine = engine;
        this.frontRight = frontRight;
        this.frontLeft = frontLeft;
        this.rearRight = rearRight;
        this.rearLeft  = rearLeft;

    }

}
