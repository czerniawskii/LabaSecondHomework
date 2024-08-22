package org.example.thirdHomeWork;
//3rd HomeWork

import org.example.thirdHomeWork.interfaces.IBeep;
import org.example.thirdHomeWork.interfaces.IDrive;
import org.example.thirdHomeWork.interfaces.IStop;

import java.util.Objects;

public abstract class Car extends Transport implements IBeep, IStop, IDrive {

    protected int i = 0;
    public Car(){
        // System.out.println(++i + " object of parent type Car has been created:");
    }



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
