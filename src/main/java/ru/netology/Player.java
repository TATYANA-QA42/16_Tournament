package ru.netology;

public class Player {
    protected int id; //ид
    protected String name; //имя
    protected int strenght; // сила

    public Player(int id, String name, int strenght) {
        this.id = id;
        this.name = name;
        this.strenght = strenght;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

}

