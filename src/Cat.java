public class Cat  extends Animal{

    static  int counterCat;

    private final int runLimit = 200;
    private final int swimLimit = 0;

    public Cat(String name) {
        super(name);
        counterCat++;
        counter++;
    }

    @Override
    void run(int distance) {
        if(distance < 0){
            System.out.println("Животные бегут только вперед и бежать: " + distance + " м, не могут");
            return;
        }
        System.out.println((distance > this.runLimit) ? "Кот " + this.name + " не может столько бегать " + distance + " м, ограниечение: " + this.runLimit + " м"
                : "Кот " + this.name + " успешно пробежал " + distance + " м");
    }

    @Override
    void swim(int distance) {

        if(distance < 0){
            System.out.println("Животные плывут только вперед и плыть: " + distance + " м, не могут");
            return;
        }
        System.out.println((distance > this.swimLimit) ? "Кот " + this.name + " не умеет плавать совсем " + distance + " м, ограниечение: " + this.swimLimit + " м"
                : "Кот " + this.name + " успешно просидел на месте и никуда не плыл " + distance + " м");
    }


}
