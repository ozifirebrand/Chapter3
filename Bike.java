//OKOROAFOR OZIOMA ASSIGNMENT 18/7/2021

package chapterThree;

public class Bike {
    private boolean isOn;
    private int acceleration;
    private int gear;
    private int gearLevel;

    public void isSwitchedOn(boolean isOn) {
    }

    public void changeAcceleration(int gear){
        acceleration = acceleration + gear;
       }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int displayAcceleration() {

        return acceleration;
    }

    public void automaticGearSystem(int gear){

    }

    public void setGearLevel(int gear){
        if (gear >= 0 || gear <= 20 )
            gearLevel = 1;
        if (gear >= 21 && gear <= 30 )
            gearLevel = 2;
        if (gear >= 31 && gear <= 40 )
            gearLevel = 3;
        if (gear >= 41)
            gearLevel = 4;
        System.out.println("Gear " +gearLevel);

    }

    public int displayNextGear() {
        return gearLevel;
    }
}
