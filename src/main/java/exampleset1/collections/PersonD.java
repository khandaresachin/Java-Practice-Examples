package com.collections;

public class PersonD {
    private String name;
    private String city;
    private int uuid;
    private int age;

    public PersonD(String name, String city, int uuid, int age) {
        this.name = name;
        this.city = city;
        this.uuid = uuid;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonD{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", uuid=" + uuid +
                ", age=" + age +
                '}';
    }
}
