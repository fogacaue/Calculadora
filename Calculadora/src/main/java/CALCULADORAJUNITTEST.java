import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CALCULADORAJUNITTEST {

    @Test
    public void testSoma() {
        Soma calcular = new Soma();

        // Cenário 1: soma de dois valores
        assertEquals(10, calcular.soma(3, 7));

        // Cenário 2: soma de dois valores sendo um "0"
        assertEquals(10,  calcular.soma(10, 0));

        // Cenário 3: soma de ambos valores sendo que os dois são "0"
        assertEquals(0, calcular.soma(0, 0));

        // Cenário 4: soma de dois valores sendo um deles negativo
        assertEquals(-30, calcular.soma(20, -50));
    }

    @Test
    public void testMultiplicacao() {
        Multiplicacao calculo = new Multiplicacao();

        // Cenário 1 : multiplicação de dois valores inteiros positivos
        assertEquals(25, calculo.multiplicacao(5, 5));

        // Cenário 2 : multiplicação de dois valores sendo um "0"
        assertEquals(0,  calculo.multiplicacao(423, 0));

        // Cenário 3 : multiplicação sendo ambos os valores "0"
        assertEquals(0, calculo.multiplicacao(0, 0));

        // Cenário 4 : multiplicação de dois valores sendo um negativo
        assertEquals(-27, calculo.multiplicacao(3, -9));
    }

    @Test
    public void testSubtracao() {
        Subtracao calculo = new Subtracao();

        // Cenário 1: subtração de dois valores inteiros positivos
        assertEquals(-4, calculo.subtracao(19, 23));

        // Cenário 2: subtração de dois valores sendo um deles "0"
        assertEquals(22, calculo.subtracao(22, 0));

        // Cenário 3 : subtração sendo ambos "0"
        assertEquals(0, calculo.subtracao(0, 0));

        // Cenário 4 : subtração de dois valores sendo um negativo
        assertEquals(79, calculo.subtracao(34, -45));
    }

    @Test
    public void testDivisao() {
        Divisao calculo = new Divisao();

        // Cenário 1 : divisão de dois números inteiros positivos
        assertEquals(3, calculo.divisao(15, 5));

        // Cenário 2 : divisão de dois números sendo um deles 0
        assertEquals(0, calculo.divisao(34, 0));

        // Cenário 3 : divisão de dois números sendo ambos "0"
        assertEquals(0, calculo.divisao(0, 0));

        // Cenário 4 : divisão de dois numeros, sendo um deles negativo
        assertEquals(-38, calculo.divisao(-76, 2));
    }
}
