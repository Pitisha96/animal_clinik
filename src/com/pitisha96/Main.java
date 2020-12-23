package com.pitisha96;

import com.pitisha96.Actions.CreateClientAction;
import com.pitisha96.Actions.ExitFromClinic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Validator validator=new Validator(new Scanner(System.in));
        SingleClinicUI clinic=new SingleClinicUI(new Clinic(),validator);
        clinic.loadActions(new CreateClientAction());
        clinic.loadActions(new ExitFromClinic());
        do{
            clinic.show();
            clinic.doAction(validator);
        }while(true);
    }
}
