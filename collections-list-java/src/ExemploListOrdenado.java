import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploListOrdenado {
    public static void main(String[] args) {
        List <Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }}

    class Gato {
        
    private String nome;
    private Integer idade;
    private String cor;

    Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
        
    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;

    System.out.println("Ordem de Inserção");
    System.out.println(meusGatos);

    System.out.println("Ordem aleatória");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("Ordem Natural (Nome)");
    Collections.shufle(meusGatos);

    System.out.println("Ordem Idade");
    Collections.sort(meusGatos);
    meusGatos.sort();
        }

    class Gato implements Comparable<Gato>{
        private String nome;
        private Integer idade;
        private String cor;
    }

    @Override

    public String toString(){
        return "{" + 
        "nome:'" + nome + '\'' +
        ", idade= " + idade + 
        ", cor = '" + cor + '\'' + 
        '}';
        }

    @Override

    public int compareTo(Gato gato){
        
        return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }

    class ComparatorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2);
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}