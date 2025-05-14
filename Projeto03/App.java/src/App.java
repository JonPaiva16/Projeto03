
import java.util.ArrayList;

public class App {

    public static int funcaoHash(String palavra, int tam) {
        int hash = 0;
        // ex: Abobora -> pega letra A->int da tabela ascii
        // A -> valor 65
        /// 65 -> 0
        /// 90 -> 25
        hash = 13 + palavra.toUpperCase().charAt(0); // pega a inicial

        return hash % tam;
    }

    public static boolean buscarPalavra(String palavra, ArrayList<String>[] tabelaHash, int totalCategorias) {

        int categoria = funcaoHash(palavra, totalCategorias);

        ArrayList<String> lista = tabelaHash[categoria];

        if (lista.contains(palavra)) {
            System.out.println("Palavra \"" + palavra + "\" encontrada na categoria " + categoria + ".");
            return true;
        } else {
            System.out.println("Palavra \"" + palavra + "\" não encontrada.");
            return false;
        }

    }

    public static void main(String[] args) throws Exception {

        int totalCategorias = 26;

        ArrayList<String> tabelaHash[] = new ArrayList[totalCategorias];

        // inicializar a tabela
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> " + tabelaHash[i]);
            tabelaHash[i] = new ArrayList<String>();
        }

        System.out.println("---INSTANCIADAS---");
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> " + tabelaHash[i]);
        }

        System.out.println("Adicionando palavras...");
        for (int i = 0; i < 100; i++) {
            String palavra = GeradorPalavras.gerarPalavraAleatoria();

            int categoria = funcaoHash(palavra, totalCategorias);
            tabelaHash[categoria].add(palavra);
        }

        System.out.println("---PREENCHIDA---");
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> total = " + tabelaHash[i]);
        }

        System.out.println("\n--- TESTANDO BUSCAS ---");
        buscarPalavra("Jonathan", tabelaHash, totalCategorias);

    }

}
