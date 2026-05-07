package wipro_training_day_3;

public class Car {
    private boolean engineOn;
    private int speed;
    private int fuelLevel;

    public void startEngine() {
        engineOn = true;
    }

    public void setSpeed(int speed) {
        if (engineOn && speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Start engine first!");
        }
    }

    public void setFuelLevel(int fuel) {
        if (fuel >= 0) {
            this.fuelLevel = fuel;
        }
    }

    public void displayStatus() {
        System.out.println("Engine: " + engineOn + ", Speed: " + speed + ", Fuel: " + fuelLevel);
    }

	public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.setFuelLevel(40);
        car.setSpeed(100);
        car.displayStatus();// TODO Auto-generated method stub

	}

}
