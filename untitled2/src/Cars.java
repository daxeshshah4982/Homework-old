public class Cars {
    int speed;

    public Cars(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed(){
        speed++;
        System.out.println("increasing speed of cars = " +speed);
    }
    public void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing speed of cars = " + speed);
    }
}
