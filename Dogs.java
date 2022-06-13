package DZ6;

import Lesson5.Animal;

public class Dogs extends Animal {
    public int swim;
    int run;
    int jump;

    public Dogs(String name, int age, int run, int swim, int jump) {
        super(name,age, run, swim, jump);
    }

    public int getSwim() {
        return swim;
    }
    public void setSwim(int swim) {
        this.swim = swim;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void dogsInfo() {
        System.out.println(getName() + ", " + getAge() + "y.o., " + getRun() + "m, " + swim + "swim, " + getJump() + "m.");
    }



}
