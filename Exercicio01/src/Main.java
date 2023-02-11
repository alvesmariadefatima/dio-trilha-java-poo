public class Main {
    public static void main(String[] args) {
        //exemplos de upcast em Java

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();

        Funcionario vendedor = new Vendedor();

        Funcionario faxineiro = new Faxineiro();

        //exemplo de downcast em Java
        
        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }    
}
