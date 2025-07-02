public class Gerente extends Funcionario {
    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        return salarioBase + 2000;
    }
}
