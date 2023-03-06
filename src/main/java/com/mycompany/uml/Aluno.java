/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Aluno extends Pessoa {
        
        private int RegistroAluno;
        private int mediaFinal;
        
        
    public int getRegistroAluno() {
        return RegistroAluno;
    }


    public void setRegistroAluno(int RegistroAluno) {
        this.RegistroAluno = RegistroAluno;
    }
    public int getMediaFinal() {
        return mediaFinal;
    }
    
    public void setMediaFinal(int mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
    
    public void consultaSiga(){
        System.out.println("OI EU SOU O ALUNO "+getNome());
    }
}
