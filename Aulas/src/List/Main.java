package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); //adicionando na posicao 2

        System.out.println("Tamnho da lista " + list.size()); //tamanho

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------------");
        //list.remove("Anna"); //Anna é outro dado, para servir de comparação
        //list.remove(4); //Removendo por posição
        list.removeIf(x -> x.charAt(0) == 'M'); // função lambda predicado vai responder em verdadeiro ou falso
        //pega um valor x que é do tipo String, e me retorna de x.charAt(0) == 'M'

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //Quando não encontra o resultado é -1
        System.out.println("--------------------------");
        List<String> resultado = list.stream(). //convertendo list para stream
                filter(x -> x.charAt(0) == 'A'). //fazendo a filtragem do "stream" com nomes que começam com A
                collect(Collectors.toList()); //Comando para "retornar" de stream para lista

        for (String x : resultado) { //pega a lista filtrada
            System.out.println(x);
        }
        System.out.println("--------------------------");
        String name = list.stream(). //passa lista para stream
                filter(x -> x.charAt(0) =='A'). //faz o fultro de buscar os nomes que iniciam com A
                findFirst().orElse(null); //Aqui faz a busca do primeiro elemento com o filtro, se nao encontrar retorna null
        System.out.println(name);

    }
}
