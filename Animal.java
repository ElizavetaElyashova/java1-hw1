/** Java 1 hw 6
 * @author Elizaveta Elyashova
 * @version 31.08.2018
 */
class hw6 {
    public static void main(String[] args){
        Cat cat1 = new Cat ("Мурзик", 200, 2);
        //Мурзик - стандартный кот из д/з с ограничением на бег 200 м и на прыжок 2 м
        Cat cat2 = new Cat ("Фендер", 600, 5);
        //Фендер - мейн-кун, поэтому он может бегать на 600 м и прыгать на 5 м

        //делаем проверки
        System.out.println (cat1.name + ", max бег = " + cat1.maxrun + ", max прыжок = " + cat1.maxjump);
        System.out.print ("бежит 100 м? "); cat1.run(100); //true
        System.out.print ("бежит 700 м? "); cat1.run(700); //false
        System.out.print ("плывет 12 м? "); cat1.swim(12); //false
        System.out.print ("прыгает 1 м? "); cat1.jump(1); //true
        System.out.print ("прыгает 3 м? "); cat1.jump(3); //false
        System.out.println ("");

        System.out.println (cat2.name + ", max бег = " + cat2.maxrun + ", max прыжок = " + cat2.maxjump);
        System.out.print ("бежит 300 м? "); cat2.run(300); //true
        System.out.print ("бежит 700 м? "); cat2.run(700); //false
        System.out.print ("прыгает 3 м? "); cat2.jump(3); //true
        System.out.print ("прыгает 6 м? "); cat2.jump(6); //false
        System.out.println ("");

        Dog dog1 = new Dog ("Полкан", 500, 10, 0.5);
        //Полкан - стандартный пес из условий д/з, бегает на 500 м, плавает на 10 м, прыгает на 0,5
        Dog dog2 = new Dog ("Ромка", 100, 0, 0.2);
        //Ромка - мопс, поэтому он может бегать только на 100 м, не может плавать и прыгает совсем невысоко

        //делаем проверки
        System.out.println (dog1.name + ", max бег = " + dog1.maxrun + ", max плавание = "
                            + dog1.maxswim + ", max прыжок = " + dog1.maxjump);
        System.out.print ("бежит 300 м? "); dog1.run(300); //true
        System.out.print ("бежит 600 м? "); dog1.run(600); //false
        System.out.print ("плывет 7 м? "); dog1.swim(7); //true
        System.out.print ("плывет 12 м? "); dog1.swim(12); //false
        System.out.print ("прыгает 0,4 м? "); dog1.jump(0.4); //true
        System.out.print ("прыгает 1 м? "); dog1.jump(1); //false
        System.out.println ("");

        System.out.println (dog2.name + ", max бег = " + dog2.maxrun + ", max плавание = "
                            + dog2.maxswim + ", max прыжок = " + dog2.maxjump);
        System.out.print ("бежит 50 м? "); dog2.run(50); //true
        System.out.print ("бежит 200 м? "); dog2.run(200); //false
        System.out.print ("плывет 2 м? "); dog2.swim(2); //false
        System.out.print ("прыгает 0,1 м? "); dog2.jump(0.1); //true
        System.out.print ("прыгает 0,5 м? "); dog2.jump(0.5); //false
        System.out.println ("");
    }
}

public class Animal {
    public String name;

    public Animal (String name) {
        this.name = name;
    }

    void run (int length) {
        System.out.println(true);
    }

    void swim (int length) {
        System.out.println(true);
    }

    void jump (double height) {
        System.out.println(true);
    }
}

class Cat extends Animal {
    protected int maxrun;
    protected double maxjump;

    public Cat(String name, int maxrun, double maxjump) {
        super(name);
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

    @Override
    void run (int length) {
        System.out.println(length <= maxrun ? true : false);
    }

    @Override
    void swim(int length) {
        System.out.println(false);
    }

    @Override
    void jump (double height) {
        System.out.println(height <= maxjump ? true : false);
    }
}

class Dog extends Animal {
    protected int maxrun;
    protected int maxswim;
    protected double maxjump;

    public Dog(String name, int maxrun, int maxswim, double maxjump){
        super(name);
        this.maxrun = maxrun;
        this.maxswim = maxswim;
        this.maxjump = maxjump;
    }

    @Override
    void run (int length) {
        System.out.println(length <= maxrun ? true : false);
    }

    @Override
    void swim (int length) {
        System.out.println(length <= maxswim ? true : false);
    }

    @Override
    void jump (double height) {
        System.out.println(height <= maxjump ? true : false);
    }
}
