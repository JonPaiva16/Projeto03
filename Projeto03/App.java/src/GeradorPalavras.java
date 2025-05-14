import java.util.Random;

public class GeradorPalavras {

    static String[] palavrasFixas = {
        "casa", "carro", "bola", "livro", "gato", "cachorro", "janela", "porta",
        "banana", "maçã", "computador", "cadeira", "mesa", "telefone", "papel",
        "caneta", "sapato", "chuva", "fogo", "água", "terra", "vento", "flor",
        "sol", "lua", "estrela", "tempo", "noite", "dia", "trabalho", "escola",
        "praia", "rio", "montanha", "caminho", "pessoa", "amigo", "amor", "paz",
        "força", "vida", "tempo", "tempo", "tempo", "tempo"
    };

    public static String gerarPalavraAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(palavrasFixas.length);
        return palavrasFixas[indice];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(gerarPalavraAleatoria());
        }
    }
}
