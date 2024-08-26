package org.example.thirdHomeWork.exceptions;
import org.example.thirdHomeWork.*;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exception2 extends RuntimeException {


    public void mainException2(String args) throws FileNotFoundException {

        FileReader filereader2 = new FileReader("test1.txt");
    }





}

