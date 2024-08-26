package org.example.thirdHomeWork.exceptions;
import org.example.thirdHomeWork.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exception3 extends Exception {

    public void mainException3() {

        try {
            FileReader fileReader3 = new FileReader("test3.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
