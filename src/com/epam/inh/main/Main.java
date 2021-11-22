package com.epam.inh.main;

import com.epam.inh.entity.Appliances;
import com.epam.inh.entity.CookTop;
import com.epam.inh.entity.ElectricToothBrush;
import com.epam.inh.entity.RobotVacuumCleaner;
import com.epam.inh.entity.Scale;
import com.epam.inh.entity.VacuumCleaner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Appliances cookTop = new CookTop(300, new Date(105, 1, 2), 100, "Electric");
        Appliances electricToothBrush = new ElectricToothBrush(200, new Date(100, 11, 5), "Plastic",true);
        Appliances vacuumCleaner = new VacuumCleaner(400, new Date(200, 4, 2), 2000, 11);
        Appliances robotVacuumCleaner = new RobotVacuumCleaner(2000, new Date(200, 4, 2), 2000, 5);
        List<Appliances> appliances = Arrays.asList(cookTop, electricToothBrush, vacuumCleaner, robotVacuumCleaner);

        for(Appliances appliance : appliances) {
            if(appliance.getPrice() >= 300) {
                System.out.println(appliance);
            }
        }

        Appliances scale1 = new Scale(300, new Date(105, 1, 12), "Metal", 500);
        Appliances scale2 = new Scale(200, new Date(101, 5, 11), "Plastic", 400);
        Appliances scale3 = new Scale(250, new Date(102, 4, 5), "Plastic", 400);
        Appliances scale4 = new Scale(100, new Date(103, 2, 2), "Plastic", 400);
        Appliances electricToothBrush1 = new ElectricToothBrush(2000, new Date(100, 11, 5), "Plastic",true);
        Appliances electricToothBrush2 = new ElectricToothBrush(2300, new Date(100, 11, 5), "Plastic",true);
        Appliances electricToothBrush3 = new ElectricToothBrush(2400, new Date(100, 11, 5), "Plastic",true);
        Appliances electricToothBrush4 = new ElectricToothBrush(2500, new Date(100, 11, 5), "Plastic",true);
        Appliances electricToothBrush5 = new ElectricToothBrush(2600, new Date(100, 11, 5), "Plastic",true);
        Appliances electricToothBrush6 = new ElectricToothBrush(2700, new Date(100, 11, 5), "Plastic",true);

        List<Appliances> applianceList = Arrays.asList(scale1, scale2, scale3, scale4, electricToothBrush1, electricToothBrush2, electricToothBrush3,
                electricToothBrush4, electricToothBrush5, electricToothBrush6);

        for(Appliances appliance : applianceList) {
            System.out.println(appliance.info());
        }

    }
}
