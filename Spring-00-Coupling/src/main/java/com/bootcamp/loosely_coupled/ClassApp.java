package com.bootcamp.loosely_coupled;

public class ClassApp {

    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);

        mentor.manageAccount();


        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentorAccount = new MentorAccount(partTime);

        mentorAccount.manageAccount();


    }
}
