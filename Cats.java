package DZ6;

public class Cats extends Animals {

    private boolean swim;
    public Cats(String name, int age, int run, boolean swim, int jump){
        name = name;
        age = age;
        run = run;
        swim = swim;
        jump = jump;

    };

    public void catsInfo() {
        System.out.println(getName() + ", " + getAge() + "y.o., " + getRun() + "m, " + swim + "swim, " + getJump() + "m.");
    }


}