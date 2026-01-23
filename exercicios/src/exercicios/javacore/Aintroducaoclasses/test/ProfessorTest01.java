package exercicios.javacore.Aintroducaoclasses.test;

import exercicios.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Pedro";
        professor.sexo = 'M';
        professor.idade = 12;
        System.out.println(professor.nome + " " + professor.sexo + " " + professor.idade);

    }
}
