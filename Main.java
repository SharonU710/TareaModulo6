/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4.Main;

/**
 *
 * @author s0733
 */
public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Nuria Gomez", 50, "Pediatria");
        Deportista deportista1 = new Deportista("Julian Alvarez", 20, "Natacion");

        doctor1.mostrarInfo();
        deportista1.mostrarInfo();
    }
}
