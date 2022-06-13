package DZ6;

import Lesson5.Dog;

public class Main {
    public static void main(String[] args) {

        Cats cat1 = new Cats("Paris", 4, 200, false, 10);
        Cats cat2 = new Cats("London", 3, 200, false, 10);

        Dogs dog1 = new Dogs("BoraBora", 4, 500, 10, 3);
        Dogs dog2 = new Dogs("Maldive", 3, 500, 10, 2);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);

    }

}
