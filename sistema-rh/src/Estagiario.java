public class Estagiario extends Funcionario {
    public Estagiario(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        return salarioBase;
    }
}
