/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accumulator;

import javax.swing.JOptionPane;

/**
 *
 * @author Novashnee
 */
public class Accumulator {

    public static void main(String[] args) {

        double totalHours = 0;
        double taskHours;
        int options;

        do {
            // Prompt the user to enter Task Name 
            String taskName = JOptionPane.showInputDialog(null, 
                    "Please Enter The Task Name: ", "TASK NAME", 
                    JOptionPane.QUESTION_MESSAGE);

            
            // Prompt the user to enter Task Hours
            taskHours = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Please Enter The Task Hours", "TASK HOURS", 
                    JOptionPane.QUESTION_MESSAGE));

            
            // Add the Task Hours
            totalHours += taskHours;

            
            // Option to add another task or finish
            options = JOptionPane.showConfirmDialog(null, 
                    "Do you want to add another task?", "Continue?", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (options == JOptionPane.YES_OPTION);

        
        // Display total hours accumulated
        JOptionPane.showMessageDialog(null, "Total Task Hours: " + 
                totalHours, "TOTAL HOURS", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // Exits the Program
    }
}
