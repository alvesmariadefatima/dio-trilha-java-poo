import java.util.Set;
import java.util.TreeSet;
import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Collections;

public class ExemploSet {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set <Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 5d, 7d, 8d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a soma dos valores: ");
        Iterator <Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator <Double> iterator1 = notas.iterator();
        Double subtracao = 0.0;
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                System.out.println(notas);
            }
            Set <Double> notas2 = new LinkedHashSet<>();
            notas2.add(7.0); 
            notas2.add(8.5);
            notas2.add(9.3);
            notas2.add(5d);
            notas2.add(7d);
            notas.add(0d);
            notas.add(3.6);

            System.out.println("Exiba todas as notas na ordem crescente: ");
            Set <Double> notas3 = new TreeSet<>(notas2);
            System.out.println(notas3);

            System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
            System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
            System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
        } 
    }
}
