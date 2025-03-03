package com.company;

import java.io.Console;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        Main_Sys sys = new Main_Sys("8xSys");
        sys.printSysDetails();
        sys.isWeConnectedWithGithubOnline();
        System.out.println(sys.isWeConnectedWithGithubOnline());

    }
}



class Main_Sys{
    private String specification;
    private boolean isOnlineConn;
    Main_Sys(String specification){
        this.specification = specification;
    }

    void printSysDetails(){
        System.out.println(this.specification);
    }


    boolean isWeConnectedWithGithubOnline(){
       return this.isOnlineConn = true;
    }
}

