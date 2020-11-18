package auto;

import org.springframework.beans.factory.annotation.Autowired;

public class People {

    @Autowired
    private Dog dog;

    @Autowired
    private Cat cat;
    private  String name;

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }

    public People() {

    }

    public People(Dog dog, Cat cat, String name) {
        this.dog = dog;
        this.cat = cat;
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

