package org.example.thirdHomeWork.lambda;

@FunctionalInterface

public interface IMerge<T> {
    T merge(T a, T b);

}
