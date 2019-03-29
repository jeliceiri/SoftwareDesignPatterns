package Spr2019.Observer.JE;

/**
 * CPSC 6119 Assignment 2
 * GrassCuttingMachineDriver  
 * @author Jill Eliceiri
 * Feb 22, 2019
 */

public class GrassCuttingMachineDriver {

    public static void main(String[] args) {

        //instantiate 5 different GrassCuttingMachineData
        GrassCuttingMachineData grassData1 = new GrassCuttingMachineData();
        GrassCuttingMachineData grassData2 = new GrassCuttingMachineData();
        GrassCuttingMachineData grassData3 = new GrassCuttingMachineData();
        GrassCuttingMachineData grassData4 = new GrassCuttingMachineData();
        GrassCuttingMachineData grassData5 = new GrassCuttingMachineData();

        //instantiate three different monitors and pass GrassCuttingMachineData to them
        //simple monitor can observe 1, medium - 2, and advanced - 5
        SimpleMonitor simpleMonitor = new SimpleMonitor(grassData1);
        MediumMonitor mediumMonitor = new MediumMonitor(grassData1, grassData2);
        AdvancedMonitor advancedMonitor = new AdvancedMonitor(grassData1, grassData2, grassData3, grassData4, grassData5);

        System.out.println("\n---Create and set the status of 5 different machines and notify its observers.\n"
                + "(SimpleMonitor observes Machine 1, Medium observes Machines 1 & 2, and Advanced Observes 1-5)\n");

        //set the status of each GrassCuggintMachineData
        grassData1.setMeasurements("normal");
        grassData2.setMeasurements("minor");
        grassData3.setMeasurements("major");
        grassData4.setMeasurements("hardFix");
        grassData5.setMeasurements("totallyBroke");

        System.out.println("\n---Now, change the status of each of these 5 machines and notify its observers---\n");

        //change the status of each GrassCuttingMachineData
        grassData1.setMeasurements("hardFix");
        grassData2.setMeasurements("totallyBroke");
        grassData3.setMeasurements("normal");
        grassData4.setMeasurements("minor");
        grassData5.setMeasurements("major");
    }
}
