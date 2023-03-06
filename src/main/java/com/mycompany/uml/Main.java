/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {
    public static void main(String[] args) {
         Pessoa pe1 = new Pessoa();
         Aluno a1 = new Aluno();
         Professor p1 = new Professor();     
         Funcionario f1 = new Funcionario();
         
         a1.setNome("ronaldo");
         p1.setNome("ronaldo");
         f1.setNome("ronaldo");
         pe1.setNome("ronaldo");
         
         pe1.consultaSiga();
         a1.consultaSiga();        
         p1.consultaSiga();        
         f1.consultaSiga();
         
    }
    
}
