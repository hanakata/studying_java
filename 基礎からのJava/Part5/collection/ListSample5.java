import java.util.*;

class Man {
    String name;
    int age;

    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void intoroduce() {
        System.out.println("I'm " + name + "age " + age);
    }
}

class ListSample5 {
    public static void main(String[] args) {
        List<Man> list = new ArrayList<Man>();
        list.add(new Man("Son", 10));
        list.add(new Man("kitao", 15));
        list.add(new Man("Miki", 20));

        for (int i = 0; i < list.size(); i++) {
            Man man = list.get(i);
            man.intoroduce();
        }
    }
}