public class Programador extends Funcionario{
    private Double horasExtras;

    public Programador(String nome, Double salarioBase, Double horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public Double calcularSalario() {
        return salarioBase + (horasExtras * 50);
    }
}
