// if C is subset of B and B is Subset of A, than C is subset of A
// Child class can access all the methods( from child class as well as Parents class

public class InheritanceDemo extends BMW {
    public InheritanceDemo(int speed) {
        super(speed);
        // here got super(speed) which came from For-father class Cars
        // which is Constructor and must create constructor to assign the variable from parent class
    }
    public void increaseSpeedInheritanceDemo(){
        System.out.println("increasing Speed of cars of InheritanceDemo");
    }

    public static void main(String[] args) {
        int speed = 10;
        InheritanceDemo obj = new InheritanceDemo(10);
        obj.increaseSpeedInheritanceDemo(); //own method of class

        obj.headUpDisplayNavigation(); //calling method of BMW class which is parent of InheritanceDemo

        obj.increaseSpeed(); // Calling method of Cars class which is for-father
                              // of InheritanceDemo and father of BMW class

        obj.decreaseSpeed(); // same like above -- increaseSpeed


    }

}
