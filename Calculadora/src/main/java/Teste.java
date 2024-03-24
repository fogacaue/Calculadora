public class Teste {
    public static void main(String[] args) {


        // ------------------Soma------------------------------
        Soma calcular = new Soma();
        // Cenário 1 : soma de dois valores
        int soma = calcular.soma(3, 7);
        System.out.println(soma);

        // Cenário 2: soma de dois valores sendo um "0"
        soma = calcular.soma(10, 0);
        System.out.println(soma);

        // Cenário 3: soma de ambos valores sendo que os dois são "0"
        soma = calcular.soma(0, 0);
        System.out.println(soma);

        // Cenário 4: soma de dois valores sendo um deles negativo
        soma = calcular.soma(20, -50);
        System.out.println(soma);

        System.out.println("\n");

        // ------------------Multiplicação------------------------------
        Multiplicacao calcuos = new Multiplicacao();
        // Cenário 1 : multiplicação de dois valores inteiros positivos
        int Multiplicacao = calcuos.multiplicacao(5, 5);
        System.out.println(Multiplicacao);

        // Cenário 2 : multiplicação de dois vlaores sendo um "0"
        Multiplicacao = calcuos.multiplicacao(423, 0);
        System.out.println(Multiplicacao);

        // Cenário 3 : multiplicação sendo ambos os valores "0"
        Multiplicacao = calcuos.multiplicacao(0, 0);
        System.out.println(Multiplicacao);

        // Cenário 4 : multiplicação de dois valores sendo um negativo
        Multiplicacao = calcuos.multiplicacao(3, -9);
        System.out.println(Multiplicacao);

        System.out.println("\n");

        // -----------------subtração-------------------------------------
        Subtracao calculo = new Subtracao();
        // Cenário 1: subtração de dois valores inteiros positivos
        int sub = calculo.subtracao(19, 23);
        System.out.println(sub);

        // Cenário 2: subtração de dois valores sendo um deles "0"
        sub = calculo.subtracao(22, 0);
        System.out.println(sub);

        // Cenário 3 : subtração sendo ambos "0"
        sub = calculo.subtracao(0, 0);
        System.out.println(sub);

        // Cenário 4 : subtração de dois valores sendo um negativo
        sub = calculo.subtracao(34, -45);
        System.out.println(sub);

        System.out.println("\n");

        // ----------------Divisão-------------------------------------------
        Divisao divi = new Divisao();
        // Cenário 1 : divisão de dois números inteiros positivos
        double div = divi.divisao(15, 5);
        System.out.println(div);

        // Cenário 2 ; divisão de dois números sendo um deles 0
        div = divi.divisao(34, 0);
        System.out.println(div);

        // Cenário 3 : divisão de dois números sendo ambos "0"
        div = divi.divisao(0, 0);
        System.out.println(div);

        // Cenário 4 : divisão de dois numeros, sendo um deles negativo
        div = divi.divisao(-76, 2);
        System.out.println(div);

        System.out.println("\n");
    }
}
