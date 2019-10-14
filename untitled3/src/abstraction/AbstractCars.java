package abstraction;

public abstract class AbstractCars {
    private int privateSpeed;


    public void setPrivateSpeed(int speed) {
        this.privateSpeed = speed;
    }
    public void engineStart(){
        System.out.println("Engine start");
    }
    public abstract void abc1();

    public abstract void engineStart(String keyType, int numOfCyl);
}