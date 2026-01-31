package exercicios.javacore.Gassociacao.test;

import exercicios.javacore.Gassociacao.domain.Escola;
import exercicios.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor teacher = new  Professor("Maria");
        Professor teacher2 = new  Professor("Jiraya Sensei");
        Professor[] teachers = {teacher, teacher2};
        Escola school = new Escola("School", teachers);

        school.print();
    }
}
