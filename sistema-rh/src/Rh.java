public class Rh {
    public void processarFuncionario(Funcionario func) {
        func.exibirInformacoes();
        Double salario = func.calcularSalario();
        System.out.println("O salário do mês atual é: " + salario);
    }
}
