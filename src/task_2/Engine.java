package task_2;

public class Engine {

    int numberOfCylinders;

    public Engine(int numberOfCylinders) {
        super();
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
    }

}