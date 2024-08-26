package org.example.thirdHomeWork.exceptions;
import org.example.thirdHomeWork.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exception5 extends Exception {

    public void mainException5() {

        try {
            FileReader fileReader5 = new FileReader("test5.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
