package live_coding.kapitel_4_OOP;

// class definition
class Cat {
    // attribute (variables)
    String color;
    int age;

    // constructor
    Cat(){
    }


    Cat(String color) {
        this.color = color;
    }

    Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    // methods
    public void didEat(int weight){
        int age = 0;
       // This methods becomes weight as input.
       // Depending on the weight, tell whether the cat ate or not
        boolean ate = false;
        if (weight > 4){
            ate = true;
        }
        System.out.println(ate + " " + age + " " + this.age);

    }
}

public class LectureConstructor_recap_4 {
    public static void main(String[] args) {
        // create objects (instance)
        Cat myCat_1 = new Cat("white", 3);
        System.out.println(myCat_1.color); // white
        System.out.println(myCat_1.age); // 3
        myCat_1.didEat(5); // true

        Cat myCat_2 = new Cat("black", 2);
        System.out.println(myCat_2.color); // black
        System.out.println(myCat_2.age); // 2
        myCat_2.didEat(2); // false


        Cat myCat_3 = new Cat();
        System.out.println(myCat_2.color); // null
        System.out.println(myCat_2.age); // 0
        myCat_3.didEat(6); // true

        myCat_3.color = "orange";
        myCat_3.age = 4;

        Cat myCat_4 = new Cat("red");
        System.out.println(myCat_4.color); // red
        System.out.println(myCat_4.age); // 0
        myCat_4.age = 7;
        System.out.println(myCat_4.age); // 7

    }
}
