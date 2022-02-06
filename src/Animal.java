abstract class Animal {
    static int counter;
    String name;

    abstract void run(int distance);
    abstract void swim(int distance);

    public Animal(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Animal.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
