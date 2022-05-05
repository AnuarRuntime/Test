public class Tiger extends Animal{

    static int counterTiger;
    private final int runLimit = 300;
    private final int swimLimit = 100; // увеличена дистанция плавания с 50 до 100

    public Tiger(String name) {
        super(name);
        counterTiger++;
        counter++;
    }

    @Override
    void run(int distance) {

        if(distance < 0){
            System.out.println("Животные бегут только вперед и бежать: " + distance + " м, не могут");
            return;
        }
        System.out.println((distance > this.runLimit) ? "Тигр " + this.name + " не может столько бегать " + distance + " м, ограниечение: " + this.runLimit + " м"
                : "Тигр " + this.name + " успешно пробежал " + distance + " м");
    }

    @Override
    void swim(int distance) {

        if(distance < 0){
            System.out.println("Животные плывут только вперед и плыть: " + distance + " м, не могут");
            return;
        }
        System.out.println((distance > this.swimLimit) ? "Тигр " + this.name + " не умеет так много плавать" + distance + " м, ограниечение: " + this.swimLimit + " м"
                : "Тигр " + this.name + " успешно проплыл " + distance + " м");
    }
}
