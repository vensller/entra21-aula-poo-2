public class Rh {

    private INotificador notificador;

    public Rh(INotificador notificador) {
        this.notificador = notificador;
    }

    public void processarFuncionario(Funcionario func) {
        func.exibirInformacoes();
        Double salario = func.calcularSalario();
        notificador.notificar(
                "O salário do mês atual é: " + salario,
                func
        );
    }
}
