public class Beetle {
    String name;
    int distance;
    int speed;

    /*Constructor*/

    public Beetle(String name, int distance, int speed) {
        this.name = name;
        this.distance = distance;
        this.speed = speed;
    }

    /*This method count distance for Beetle*/

    public void countDistance() {
        distance += speed * Math.random();
    }

    /*This method print moving of Beetle*/

    public void printMoving() {
        for (int i = 0; i < getDistance(); i++) {
            System.out.print("=");
        }
        System.out.println(this.name);
    }

    /*Getters and setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}