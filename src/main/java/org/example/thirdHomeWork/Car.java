package org.example.thirdHomeWork;
//3rd HomeWork

import java.util.Objects;

public abstract class Car extends Transport {

    protected int i = 0;
    public Car(){
        System.out.println(++i + " object of parent type Car has been created:");
    }


    public abstract void speedUp();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return i == car.i;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(i);
    }

    @Override
    public String toString() {
        return "Car{" +
                "i=" + i +
                '}';
    }
}
