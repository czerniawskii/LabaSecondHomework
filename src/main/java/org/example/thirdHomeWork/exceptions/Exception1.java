package org.example.thirdHomeWork.exceptions;
import org.example.thirdHomeWork.*;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exception1 extends RuntimeException {


    public void mainException1(String args) throws FileNotFoundException {

        FileReader filereader1 = new FileReader("test1.txt");
    }





}

