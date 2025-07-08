public abstract class Funcionario {
    protected String nome;
    protected Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract Double calcularSalario();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: " + salarioBase);
    }

    public String getNome() {
        return nome;
    }
}
