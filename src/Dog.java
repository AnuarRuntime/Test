public class Dog  extends Animal{

    static int counterDog ;
    private final int runLimit = 500;
    private final int swimLimit = 10;

    public Dog(String name) {
        super(name);
        counterDog++;
        counter++;
    }

    @Override
    void run(int distance) {

        if(distance < 0){
            System.out.println("Животные бегут только вперед и бежать: " + distance + " м, не могут");
            return;
        }
        System.out.println((distance > this.runLimit) ? "Собака " + this.name + " не может столько бегать " + distance + " м, ограниечение: " + this.runLimit + " м"
                : "Собака " + this.name + " успешно пробежала " + distance + " м");
    }

    @Override
    void swim(int distance) {

        if(distance < 0){
            System.out.println("Животные плывут только вперед и плыть: " + distance + " м, не могут");
            return;
        }
        System.out.println((distance > this.swimLimit) ? "Собака " + this.name + " не умеет так много плавать" + distance + " м, ограниечение: " + this.swimLimit + " м"
                : "Собака " + this.name + " успешно проплыла " + distance + " м");
    }
}
