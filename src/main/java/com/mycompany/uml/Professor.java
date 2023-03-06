package com.mycompany.uml;

public class Professor extends Pessoa {

        private int RegistroProfessor;
             
    public int getRegistroAluno() {
        return RegistroProfessor;
    }

    public void setRegistroAluno(int RegistroAluno) {
        this.RegistroProfessor = RegistroAluno;
    }
    
    public void consultaSiga(){
        System.out.println("OI EU SOU O PROFESSOR "+getNome());
    }

}
