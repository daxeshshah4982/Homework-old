package Encaptulation;

public class EncaptulationDemo {
    private int id;
    private String name;
// method 1 with the constructor and getters
    public EncaptulationDemo(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   // method 2 with setters and getters (here we already create getters class so no need to create again


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
