package org.example.thirdHomeWork.exceptions;
import org.example.thirdHomeWork.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exception4 extends Exception {

    public void mainException4() {

        try {
            FileReader fileReader4 = new FileReader("test4.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
