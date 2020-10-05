package task_2;

public class Helm {

    int diameter;
    String steeringWheelMaterial;

    public Helm(int diameter, String steeringWheelMaterial) {
        super();
        this.diameter = diameter;
        this.steeringWheelMaterial = steeringWheelMaterial;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getSteeringWheelMaterial() {
        return steeringWheelMaterial;
    }

    public void setSteeringWheelMaterial(String steeringWheelMaterial) {
        this.steeringWheelMaterial = steeringWheelMaterial;
    }

    @Override
    public String toString() {
        return "Helm [diameter=" + diameter + ", steeringWheelMaterial=" + steeringWheelMaterial + "]";
    }

}
