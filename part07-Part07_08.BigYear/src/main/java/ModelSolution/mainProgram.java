/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSolution;

import java.util.Scanner;
 
public class mainProgram {
 
    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
 
        Scanner scan = new Scanner(System.in);
 
        BirdDatabase birdbase = new BirdDatabase();
 
        UserInterface ui = new UserInterface(scan, birdbase);
        ui.start();
    }
 
}
 