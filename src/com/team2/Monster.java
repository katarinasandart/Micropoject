package com.team2;

import java.util.Random;

public class Monster {
    public float x;
    public float y;
    private float moveMin = -0.5f;
    private float movePlus = 0.5f;
    Person person;
    Random random = new Random();


    public Monster(Person person) {
        this.x = random.nextInt(78);
        this.y = random.nextInt(22);
        this.person = person;
    }


    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        if (person.getY() >= getY())
            this.y = y + movePlus;
        else if (getY() > 1)
            this.y = y + moveMin;
    }

    public void setX(float x) {
        if (person.getX() >= getX())
            this.x = x + movePlus;
        else if (getX() > 1)
            this.x = x + moveMin;
    }
}
