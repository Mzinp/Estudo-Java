package exercicios.introducao;

public class Ex1 {
    public static void main(String[] args) {
        double salario = 1500;
        double imposto;
        if (salario >= 0 && salario <= 34.712){
            imposto = salario*0.0970;
        }
        else if(salario >= 34.712 && salario <= 68.507){
            imposto = salario*0.3735;
        }
        else{
            imposto = salario*0.4950;
        }
        double s = salario-imposto;
        System.out.println("o imposto pago foi de "+imposto+"Antes o salario era de R$"+salario+"\n agora é de "+s);
    }
}
