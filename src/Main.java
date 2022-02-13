public class Main {
    private static final int MIN = -5;
    private static final int MAX = 1000;

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик"),
                new Dog("Шарик"),
                new Tiger("Барс"),
                new Tiger("Злодей"),
                new Dog("Кузя"),
                new Cat("Фаня"),
                new Tiger("Полюс"),
                new Dog("Чарли")
        };

        for (Animal a: animals) {
            a.run((int)(Math.random() * (MAX - MIN)));
            a.swim((int)(Math.random() * (MAX - MIN)/10));
            
        }



        System.out.println(" ");
        System.out.println("Всего животных " + Animal.counter + " из них кошек: " + Cat.counterCat + " Собак : " + Dog.counterDog +
                " Тигров : " + Tiger.counterTiger);

    }
}
