/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Funcionario extends Pessoa {

        private int RegistroFuncionario;
      
        
        
    public int getRegistroAluno() {
        return RegistroFuncionario;
    }


    public void setRegistroAluno(int RegistroFuncionario) {
        this.RegistroFuncionario = RegistroFuncionario;
    }
    
    public void consultaSiga(){
        System.out.println("OI EU SOU O FUNCIONARIO "+getNome());
    }

}
