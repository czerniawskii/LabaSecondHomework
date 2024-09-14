package org.example.thirdHomeWork.lambda;

@FunctionalInterface
public interface ITransform <T, R> {
    R transform(T input);
}
