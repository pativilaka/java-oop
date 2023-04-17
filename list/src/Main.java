import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Patrícia");
        list.add("Alexandre");
        list.add("Bill");
        list.add("Zé");
        list.add("Charlotte");
        list.add(2,"Paula");

        System.out.println(list.contains("Zé"));

        System.out.println(list.size());

        for (String i: list) {
            System.out.println("- " + i);
        }

        System.out.println("__________________________________________");

        list.removeIf(x -> x.charAt(0) == 'P');

        for (String i: list) {
            System.out.println("- " + i);
        }

        System.out.println("__________________________________________");

        System.out.println("Index of Charlotte..." + list.indexOf("Charlotte"));
        System.out.println("Index of Patrícia..." + list.indexOf("Patrícia"));
        list.add("Patricia");
        System.out.println("Index of Patrícia..." + list.indexOf("Patrícia"));
        System.out.println("Index of Patrícia..." + list.indexOf("Patricia"));

        System.out.println("__________________________________________");

        list.add(1, "Poliana");
        for (String i: list) {
            System.out.println("- " + i);
        }

        System.out.println("__________Stream_______________________________");
        //Resultado do filtro de nomes com a letra P
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
        for (String i: result) {
            System.out.println("- " + i);
        }

        System.out.println("__________Stream_______________________________");
        //Encontrar o primeiro nome com a letra P de uma lista
        String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(name);
        String nameJ = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nameJ);

        System.out.println("__________________________________________");

    }
}