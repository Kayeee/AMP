package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static ArrayList<Double> test = new ArrayList<Double>();
    static ArrayList<Double> positions = new ArrayList<Double>(Arrays.asList(0.0, 1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 128.0, 512.0, 1024.0));
    static ArrayList<Double> timeStamps = new ArrayList<Double>(Arrays.asList(0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0));
    static ArrayList<Double> instantVelocities = new ArrayList<Double>(); //will contain the instant velocity for time between 0.1 and 0.9
    static double mass = 1.0; //lets assume kg for right now.

    public static void main(String[] args) {

        //show use of breakpoints?
        makeInstantVelocitiesList();

        double changeInTime = getChangeInTime();
        double changeInKinetic = getChangeInKinetic();
        double power = getPower(changeInKinetic, changeInTime);
        
        System.out.println(test);
    }

    public static double getPower(double changeInKineticPassed, double changeInTimePassed){
        double power = changeInKineticPassed/changeInTimePassed;
        return power;
    }
    
    public static void makeInstantVelocitiesList(){

        //note that since we are using index i-1 and i+1 to calculate the velocity for index i.
        //this means we cannot calculate the instant velocity for when i = 0 and i = positions.size()
        //However if you know you are starting from 0, you can put a 0 at the start of the 'instantVelocities' list.

        for (int i = 1; i < positions.size()-1; i = i + 1) {
            double p1 = positions.get(i - 1);
            double p2 = positions.get(i + 1);
            double t1 = timeStamps.get(i - 1);
            double t2 = timeStamps.get(i + 1);

            double instantVelocity = (p2 - p1) / (t2 - t1);

            instantVelocities.add(instantVelocity);
        }
    }

    public static double getChangeInTime(){
        double initialTime = timeStamps.get(0); //should be 0
        double finalTime = timeStamps.get(timeStamps.size() - 1);

        double changeInTime = finalTime - initialTime;

        return changeInTime;
    }

    public static double getChangeInKinetic(){
        //Kinetic Energy = (1/2)mv^2
        double initialVelocity = instantVelocities.get(0); //get the first
        double finalVelocity = instantVelocities.get(instantVelocities.size()-1); //get the last

        double initialKinetic = (0.5)*mass*(Math.pow(initialVelocity, 2.0)); //Math.pow(base, exponent)
        double finalKinetic = (0.5)*mass*(Math.pow(finalVelocity, 2.0));

        double changeInKinetic = finalKinetic - initialKinetic;

        return changeInKinetic;

    }

}
