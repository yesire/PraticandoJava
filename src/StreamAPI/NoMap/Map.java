package StreamAPI.NoMap;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ","Audi ","Honda ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
        UnaryOperator<String> grito = n -> n + "!!! ";

        System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

        System.out.println("Utilizando a composição\n");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);
    }
}
