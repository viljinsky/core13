/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.viljinsky.core13;

import javax.swing.SwingUtilities;

/**
 *
 * @author viljinsky
 */
public class Main {
    public static void execute(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            execute();
        });
    }
    
}
