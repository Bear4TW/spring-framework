package com.bootcamp.tightly_coupled;

public class ClassApp {

    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime, partTime); //MI
        mentor.manageAccount();

        //MI
    }
}
