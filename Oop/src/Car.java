/**
 * Created by uyutthy on 12/24/2016.
 */
public class Car {
    private int numTires;
    private int numSeats;
    private String steeringWheelColor;

    public Car(int numTires, int numSeats, String steeringWheelColor){
        this.numTires = numTires;
        this.numSeats = numSeats;
        this.steeringWheelColor = steeringWheelColor;
    }

    public void drive(){
        System.out.printf("Car with %d Tires, %d Seats with %s Color Is Driving Now \n", this.numTires, this.numSeats, this.steeringWheelColor);
    }
}
