package live_coding.kapitel_5_access_modifiers;

import live_coding.kapitel_4_OOP.PublicMouse;
// import live_coding.kapitel_4_OOP.Bird;

public class Main_kapitel_5 {
    public static void main(String[] args) {

//        public String name;
//        int age; // default
//        private float speed;



        // create an object1 from class PublicMouse
        PublicMouse publicMouse_obj1 = new PublicMouse();
        publicMouse_obj1.name = "myMouse1";
        // publicMouse_obj1.age = 12; // (age is not public; it is "default")
        // publicMouse_obj1.speed = 12.345; // (age is private)


        // create an object1 from class Bird
        // Bird bird_obj1 = new Bird();


    }
}
