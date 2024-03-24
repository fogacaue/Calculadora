// Esta é uma classe chamada Divisão.
public class Divisao {
    public double divisao(int g, int h) {
        // Este é um método chamado soma que retorna um double.
        // Ele recebe dois parâmetros, g e h, ambos podem ser double.

        if (h == 0) {
            System.out.println("Não é possível dividir por zero!");
            return 0;
        }
        // Este método simplesmente retorna a divisão dos dois parâmetros g e h .
        return g / h;
    }
}