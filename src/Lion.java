public class Lion extends Animal {

    static  int counterCat;

    private final int runLimit = 400;
    private final int swimLimit = 0;

    public Lion (String name) {
        super(name);
        counterCat++;
        counter++;
    }


    @Override
    void run(int distance) {

    }

    @Override
    void swim(int distance) {

    }
}
