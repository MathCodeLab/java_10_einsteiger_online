package live_coding.kapitel_4_OOP;

import live_coding.kapitel_5_access_modifiers.PublicHourse;
//import live_coding.kapitel_5_access_modifiers.Elephant;


// Access modfiers:
// before     class:                   public, "default",
// before     variable & methods:      public, "default", private, protected

// Non-access modifers:
// before     classes:                         abstract
// before     variable & methods:      static, abstract, final


public class Main_AccessModifiers7 {
    public static void main(String[] args) {

        String name3 = "sarah";
        int age3 = 54;
        float speed3 = 23423.1f;



        String name4 = "yasser";
        float speed4 = 3431.3f;
        int age4 = 76;


        // default
        int x; // 0
        float x3; // 0.0
        boolean x4; // false



//        public String name;
//        int age; // default
//        private float speed;

        // create object from PublicMouse
        PublicMouse mouse1 = new PublicMouse();
        mouse1.name = "mymouse";
        mouse1.age = 12;
        // mouse1.speed = 12.3f; // -> private

        // create object from bird
        Bird bird1 = new Bird();
        bird1.name = "mybird";
        bird1.age = 34;
        // bird1.speed = 23.2f; // private

        PublicHourse publicHourse = new PublicHourse();
        // Elephant elephant1 = new Elephant();





    }
}
