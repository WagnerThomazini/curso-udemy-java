package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoas> list = new ArrayList<>();
        Pessoas p = new Pessoas();


        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            System.out.println("Funcionario #"+ (i+1));
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("ID já exite! Tente novamente");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Pessoas pessoa = new Pessoas(id,nome,salario);
            list.add(pessoa);
        }

        System.out.println();
        System.out.print("Digite o id do funcionario para acrescimo do salario: ");
        int idSalario = sc.nextInt();
        Pessoas pessoa = list.stream().
                filter(x -> x.getId() == idSalario).findFirst().orElse(null);

        if (pessoa == null){
            System.out.println("ID nao exite");
        }else{
            System.out.print("Digite a porcentagem: ");
            double percent = sc.nextDouble();
            pessoa.aumento(percent);
        }

        System.out.println();
        System.out.println("Lista dos funcionarios: ");
        for (Pessoas e : list){
            System.out.println(e);
        }

        sc.close();
    }

    private static boolean hasId(List<Pessoas> list, Integer id) {
        Pessoas pessoa = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return pessoa != null;
    }
}
